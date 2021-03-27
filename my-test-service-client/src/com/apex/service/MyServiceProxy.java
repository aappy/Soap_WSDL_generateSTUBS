package com.apex.service;

public class MyServiceProxy implements com.apex.service.MyService {
  private String _endpoint = null;
  private com.apex.service.MyService myService = null;
  
  public MyServiceProxy() {
    _initMyServiceProxy();
  }
  
  public MyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyServiceProxy();
  }
  
  private void _initMyServiceProxy() {
    try {
      myService = (new com.apex.service.MyServiceServiceLocator()).getMyService();
      if (myService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myService != null)
      ((javax.xml.rpc.Stub)myService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.apex.service.MyService getMyService() {
    if (myService == null)
      _initMyServiceProxy();
    return myService;
  }
  
  public int add(int num1, int num2) throws java.rmi.RemoteException{
    if (myService == null)
      _initMyServiceProxy();
    return myService.add(num1, num2);
  }
  
  public java.util.Calendar getServerDate() throws java.rmi.RemoteException{
    if (myService == null)
      _initMyServiceProxy();
    return myService.getServerDate();
  }
  
  public java.lang.String sayHelloWithName(java.lang.String name) throws java.rmi.RemoteException{
    if (myService == null)
      _initMyServiceProxy();
    return myService.sayHelloWithName(name);
  }
  
  public com.apex.service.vo.Employee getEmployee(int id) throws java.rmi.RemoteException{
    if (myService == null)
      _initMyServiceProxy();
    return myService.getEmployee(id);
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (myService == null)
      _initMyServiceProxy();
    return myService.sayHello();
  }
  
  
}