/**
 * FutureValueSOAPBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.online.financialmaths.FutureValueService;

public class FutureValueSOAPBindingSkeleton implements com.online.financialmaths.FutureValueService.FutureValueService, org.apache.axis.wsdl.Skeleton {
    private com.online.financialmaths.FutureValueService.FutureValueService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "datacalc"), com.online.financialmaths.FutureValueService.Datacalc.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calculateFutureValue", _params, new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "futureValue"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CalculateFutureValue"));
        _oper.setSoapAction("http://financialmaths.online.com/FutureValueService/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calculateFutureValue") == null) {
            _myOperations.put("calculateFutureValue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calculateFutureValue")).add(_oper);
    }

    public FutureValueSOAPBindingSkeleton() {
        this.impl = new com.online.financialmaths.FutureValueService.FutureValueSOAPBindingImpl();
    }

    public FutureValueSOAPBindingSkeleton(com.online.financialmaths.FutureValueService.FutureValueService impl) {
        this.impl = impl;
    }
    public float calculateFutureValue(com.online.financialmaths.FutureValueService.Datacalc parameters) throws java.rmi.RemoteException
    {
        float ret = impl.calculateFutureValue(parameters);
        return ret;
    }

}
