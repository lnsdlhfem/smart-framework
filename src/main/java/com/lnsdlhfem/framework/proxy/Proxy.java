package com.lnsdlhfem.framework.proxy;

/**
 * 代理接口
 * Created by lnsdlhfem on 2017/6/29.
 */
public interface Proxy {

    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
