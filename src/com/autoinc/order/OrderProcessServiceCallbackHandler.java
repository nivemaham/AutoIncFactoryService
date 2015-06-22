
/**
 * OrderProcessServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.autoinc.order;

    /**
     *  OrderProcessServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderProcessServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderProcessServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderProcessServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for confirmOrder method
            * override this method for handling normal response from confirmOrder operation
            */
           public void receiveResultconfirmOrder(
                    com.autoinc.order.OrderProcessServiceStub.ConfirmOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from confirmOrder operation
           */
            public void receiveErrorconfirmOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkAvailability method
            * override this method for handling normal response from checkAvailability operation
            */
           public void receiveResultcheckAvailability(
                    com.autoinc.order.OrderProcessServiceStub.CheckAvailabilityResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkAvailability operation
           */
            public void receiveErrorcheckAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for process method
            * override this method for handling normal response from process operation
            */
           public void receiveResultprocess(
                    com.autoinc.order.OrderProcessServiceStub.OrderProcessResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from process operation
           */
            public void receiveErrorprocess(java.lang.Exception e) {
            }
                


    }
    