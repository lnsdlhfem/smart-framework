package com.lnsdlhfem.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 * Created by lnsdlhfem on 2017/6/29.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
