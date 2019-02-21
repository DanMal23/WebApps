/**
 * FutureValueSOAPBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.online.financialmaths.FutureValueService;

public class FutureValueSOAPBindingImpl implements com.online.financialmaths.FutureValueService.FutureValueService{
    public float calculateFutureValue(com.online.financialmaths.FutureValueService.Datacalc parameters) throws java.rmi.RemoteException {
        return parameters.getPresentValue()*((parameters.getAnnualInterestRate()*parameters.getYears())+1);
    }

}
