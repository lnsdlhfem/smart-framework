package com.lnsdlhfem.framework.helper;

import com.lnsdlhfem.framework.annotation.Action;
import com.lnsdlhfem.framework.bean.Handler;
import com.lnsdlhfem.framework.bean.Request;
import com.lnsdlhfem.framework.util.ArrayUtil;
import com.lnsdlhfem.framework.util.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 控制器助手类
 * Created by lnsdlhfem on 2017/6/28.
 */
public final class ControllerHelper {

    /**
     * 用于存放请求与处理器的映射关系（Action Map）
     */
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        // 获取所有的Controller类
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if (CollectionUtil.isNotEmpty(controllerClassSet)) {
            // 遍历所有的Controller类
            for (Class<?> controllerClass : controllerClassSet) {
                Method[] methods = controllerClass.getDeclaredMethods();
                // 遍历Controller类中的方法
                for (Method method : methods) {
                    // 判断当前方法是否带有Action注解
                    if (method.isAnnotationPresent(Action.class)) {
                        // 从Action注解中获取URL映射规则
                        Action action = method.getAnnotation(Action.class);
                        String mapping = action.value();
                        // 验证Url映射规则
                        if (mapping.matches("\\w+:\\w*")) {
                            String[] array = mapping.split(":");
                            if (ArrayUtil.isNotEmpty(array) && array.length == 2) {
                                // 获取请求方法和路径
                                String requestMethod = array[0];
                                String requestPath = array[1];
                                Request request = new Request(requestMethod, requestPath);
                                Handler handler = new Handler(controllerClass, method);
                                // 初始化Action Map
                                ACTION_MAP.put(request, handler);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * 获取Handler
     * @param requestMethod
     * @param requestPath
     * @return
     */
    public static Handler getHandler(String requestMethod, String requestPath) {
        Request request = new Request(requestMethod, requestPath);
        return ACTION_MAP.get(request);
    }
}
