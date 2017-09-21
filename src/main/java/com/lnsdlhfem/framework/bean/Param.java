package com.lnsdlhfem.framework.bean;

import com.lnsdlhfem.framework.util.CaseUtil;
import com.lnsdlhfem.framework.util.CollectionUtil;

import java.util.Map;

/**
 * 请求参数对象
 * Created by lnsdlhfem on 2017/6/28.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数获取long型参数值
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CaseUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }

    /**
     * 判断参数是否为空
     * @return
     */
    public boolean isEmpty() {
        return CollectionUtil.isEmpty(paramMap);
    }
}
