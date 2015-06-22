
/**
 * ConfirmOrderFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.order;

public class ConfirmOrderFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434978787570L;
    
    private com.autoinc.order.OrderProcessServiceStub.ConfirmOrderFault faultMessage;

    
        public ConfirmOrderFaultException() {
            super("ConfirmOrderFaultException");
        }

        public ConfirmOrderFaultException(java.lang.String s) {
           super(s);
        }

        public ConfirmOrderFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ConfirmOrderFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.order.OrderProcessServiceStub.ConfirmOrderFault msg){
       faultMessage = msg;
    }
    
    public com.autoinc.order.OrderProcessServiceStub.ConfirmOrderFault getFaultMessage(){
       return faultMessage;
    }
}
    