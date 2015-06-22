
/**
 * ProcessFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.order;

public class ProcessFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434978787524L;
    
    private com.autoinc.order.OrderProcessServiceStub.ProcessFault faultMessage;

    
        public ProcessFaultException() {
            super("ProcessFaultException");
        }

        public ProcessFaultException(java.lang.String s) {
           super(s);
        }

        public ProcessFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProcessFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.order.OrderProcessServiceStub.ProcessFault msg){
       faultMessage = msg;
    }
    
    public com.autoinc.order.OrderProcessServiceStub.ProcessFault getFaultMessage(){
       return faultMessage;
    }
}
    