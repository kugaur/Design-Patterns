package com.designpatterns.proxy;

/**
 * Proxy Internet Access Class
 */
public class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet Access.");
        }
    }

    private int getRole(String employeeName) {
        return 9;
    }
}
