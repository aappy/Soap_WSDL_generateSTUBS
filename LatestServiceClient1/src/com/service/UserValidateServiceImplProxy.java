package com.service;

public class UserValidateServiceImplProxy implements com.service.UserValidateServiceImpl {
  private String _endpoint = null;
  private com.service.UserValidateServiceImpl userValidateServiceImpl = null;
  
  public UserValidateServiceImplProxy() {
    _initUserValidateServiceImplProxy();
  }
  
  public UserValidateServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserValidateServiceImplProxy();
  }
  
  private void _initUserValidateServiceImplProxy() {
    try {
      userValidateServiceImpl = (new com.service.UserValidateServiceImplServiceLocator()).getUserValidateServiceImpl();
      if (userValidateServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userValidateServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userValidateServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userValidateServiceImpl != null)
      ((javax.xml.rpc.Stub)userValidateServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.UserValidateServiceImpl getUserValidateServiceImpl() {
    if (userValidateServiceImpl == null)
      _initUserValidateServiceImplProxy();
    return userValidateServiceImpl;
  }
  
  public java.lang.String validateUser(com.vo.User user) throws java.rmi.RemoteException{
    if (userValidateServiceImpl == null)
      _initUserValidateServiceImplProxy();
    return userValidateServiceImpl.validateUser(user);
  }
  
  
}