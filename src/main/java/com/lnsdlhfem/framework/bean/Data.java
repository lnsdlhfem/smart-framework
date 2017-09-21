package com.lnsdlhfem.framework.bean;

import java.util.Map;

/**
 * 返回数据对象
 * Created by lnsdlhfem on 2017/6/28.
 */
public class Data {

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public Data(Map<String, Object> model) {
        this.model = model;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
