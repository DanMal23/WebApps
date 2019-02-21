package com.online.financialmaths.FutureValueService;

public class FutureValueServiceProxy implements com.online.financialmaths.FutureValueService.FutureValueService {
  private String _endpoint = null;
  private com.online.financialmaths.FutureValueService.FutureValueService futureValueService = null;
  
  public FutureValueServiceProxy() {
    _initFutureValueServiceProxy();
  }
  
  public FutureValueServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFutureValueServiceProxy();
  }
  
  private void _initFutureValueServiceProxy() {
    try {
      futureValueService = (new com.online.financialmaths.FutureValueService.FutureValueLocator()).getFutureValuePort();
      if (futureValueService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)futureValueService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)futureValueService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (futureValueService != null)
      ((javax.xml.rpc.Stub)futureValueService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.online.financialmaths.FutureValueService.FutureValueService getFutureValueService() {
    if (futureValueService == null)
      _initFutureValueServiceProxy();
    return futureValueService;
  }
  
  public float calculateFutureValue(com.online.financialmaths.FutureValueService.Datacalc parameters) throws java.rmi.RemoteException{
    if (futureValueService == null)
      _initFutureValueServiceProxy();
    return futureValueService.calculateFutureValue(parameters);
  }
  
  
}