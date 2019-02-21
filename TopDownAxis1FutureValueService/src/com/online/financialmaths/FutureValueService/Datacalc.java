/**
 * Datacalc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.online.financialmaths.FutureValueService;

public class Datacalc  implements java.io.Serializable {
    /**
	 * generated serial number:
	 */
	private static final long serialVersionUID = 1900316796243963519L;

	private float presentValue;

    private float annualInterestRate;

    private float years;

    public Datacalc() {
    }

    public Datacalc(
           float presentValue,
           float annualInterestRate,
           float years) {
           this.presentValue = presentValue;
           this.annualInterestRate = annualInterestRate;
           this.years = years;
    }


    /**
     * Gets the presentValue value for this Datacalc.
     * 
     * @return presentValue
     */
    public float getPresentValue() {
        return presentValue;
    }


    /**
     * Sets the presentValue value for this Datacalc.
     * 
     * @param presentValue
     */
    public void setPresentValue(float presentValue) {
        this.presentValue = presentValue;
    }


    /**
     * Gets the annualInterestRate value for this Datacalc.
     * 
     * @return annualInterestRate
     */
    public float getAnnualInterestRate() {
        return annualInterestRate;
    }


    /**
     * Sets the annualInterestRate value for this Datacalc.
     * 
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    /**
     * Gets the years value for this Datacalc.
     * 
     * @return years
     */
    public float getYears() {
        return years;
    }


    /**
     * Sets the years value for this Datacalc.
     * 
     * @param years
     */
    public void setYears(float years) {
        this.years = years;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Datacalc)) return false;
        Datacalc other = (Datacalc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.presentValue == other.getPresentValue() &&
            this.annualInterestRate == other.getAnnualInterestRate() &&
            this.years == other.getYears();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Float(getPresentValue()).hashCode();
        _hashCode += new Float(getAnnualInterestRate()).hashCode();
        _hashCode += new Float(getYears()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Datacalc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "datacalc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualInterestRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annualInterestRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("years");
        elemField.setXmlName(new javax.xml.namespace.QName("", "years"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
