
/**
 * AutoIncOrderProcessCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.autoinc.order.process.autoincorderprocess;

    /**
     *  AutoIncOrderProcessCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AutoIncOrderProcessCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AutoIncOrderProcessCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AutoIncOrderProcessCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for findCheapestSupplier method
            * override this method for handling normal response from findCheapestSupplier operation
            */
           public void receiveResultfindCheapestSupplier(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.FindCheapestSupplierResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findCheapestSupplier operation
           */
            public void receiveErrorfindCheapestSupplier(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createOrder method
            * override this method for handling normal response from createOrder operation
            */
           public void receiveResultcreateOrder(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.CreateOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createOrder operation
           */
            public void receiveErrorcreateOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerUser method
            * override this method for handling normal response from registerUser operation
            */
           public void receiveResultregisterUser(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.RegisterUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerUser operation
           */
            public void receiveErrorregisterUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateOrderStatus method
            * override this method for handling normal response from updateOrderStatus operation
            */
           public void receiveResultupdateOrderStatus(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.UpdateOrderStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateOrderStatus operation
           */
            public void receiveErrorupdateOrderStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for showtotalCost method
            * override this method for handling normal response from showtotalCost operation
            */
           public void receiveResultshowtotalCost(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.ShowtotalCostResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from showtotalCost operation
           */
            public void receiveErrorshowtotalCost(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerCustomer method
            * override this method for handling normal response from registerCustomer operation
            */
           public void receiveResultregisterCustomer(
                    com.autoinc.order.process.autoincorderprocess.AutoIncOrderProcessStub.RegisterCustomerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerCustomer operation
           */
            public void receiveErrorregisterCustomer(java.lang.Exception e) {
            }
                


    }
    