package com.lnsdlhfem.framework.util;

import org.junit.Test;

import java.util.Set;

/**
 * ClassUtil测试类
 * Created by lnsdlhfem on 2017/6/28.
 */
public class ClassUtilTest {

    @Test
    public void getClassSetTest() {
        String packageName = "com.lnsdlhfem.framework";
        Set<Class<?>> classSet = ClassUtil.getClassSet(packageName);

        for (Class<?> cls : classSet) {
            System.out.println(cls.getSimpleName());
        }
    }
}
