package com.designpatterns.proxy;

/**
 * ProxyPattern Client Class
 */
public class ProxyPatternClient {

    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Sam");
        access.grantInternetAccess();
    }
}
