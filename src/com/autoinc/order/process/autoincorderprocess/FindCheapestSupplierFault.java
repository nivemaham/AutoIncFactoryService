
/**
 * FindCheapestSupplierFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.order.process.autoincorderprocess;

public class FindCheapestSupplierFault extends java.lang.Exception{

    private static final long serialVersionUID = 1434861930041L;
    
    private com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault faultMessage;

    
        public FindCheapestSupplierFault() {
            super("FindCheapestSupplierFault");
        }

        public FindCheapestSupplierFault(java.lang.String s) {
           super(s);
        }

        public FindCheapestSupplierFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public FindCheapestSupplierFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault msg){
       faultMessage = msg;
    }
    
    public com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault getFaultMessage(){
       return faultMessage;
    }
}
    