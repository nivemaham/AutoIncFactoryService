
/**
 * CheckAvailabilityFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.order;

public class CheckAvailabilityFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434978787555L;
    
    private com.autoinc.order.OrderProcessServiceStub.CheckAvailabilityFault faultMessage;

    
        public CheckAvailabilityFaultException() {
            super("CheckAvailabilityFaultException");
        }

        public CheckAvailabilityFaultException(java.lang.String s) {
           super(s);
        }

        public CheckAvailabilityFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CheckAvailabilityFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.order.OrderProcessServiceStub.CheckAvailabilityFault msg){
       faultMessage = msg;
    }
    
    public com.autoinc.order.OrderProcessServiceStub.CheckAvailabilityFault getFaultMessage(){
       return faultMessage;
    }
}
    