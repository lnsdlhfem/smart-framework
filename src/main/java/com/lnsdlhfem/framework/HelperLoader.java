package com.lnsdlhfem.framework;

import com.lnsdlhfem.framework.helper.*;
import com.lnsdlhfem.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * Created by lnsdlhfem on 2017/6/28.
 */
public class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };

        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
