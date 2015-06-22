
/**
 * AutoIncOrderProcessMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.autoinc.order.process.autoincorderprocess;

        /**
        *  AutoIncOrderProcessMessageReceiverInOut message receiver
        */

        public class AutoIncOrderProcessMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AutoIncOrderProcessSkeleton skel = (AutoIncOrderProcessSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("updateOrder".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse updateOrderResponse1 = null;
	                        com.autoinc.order.process.autoincorderprocess.UpdateOrder wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.UpdateOrder)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.UpdateOrder.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateOrderResponse1 =
                                                   
                                                   
                                                         skel.updateOrder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateOrderResponse1, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "updateOrder"));
                                    } else 

            if("findCheapestSupplier".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse findCheapestSupplierResponse3 = null;
	                        com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               findCheapestSupplierResponse3 =
                                                   
                                                   
                                                         skel.findCheapestSupplier(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), findCheapestSupplierResponse3, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "findCheapestSupplier"));
                                    } else 

            if("createOrder".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.CreateOrderResponse createOrderResponse5 = null;
	                        com.autoinc.order.process.autoincorderprocess.CreateOrder wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.CreateOrder)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.CreateOrder.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createOrderResponse5 =
                                                   
                                                   
                                                         skel.createOrder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createOrderResponse5, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "createOrder"));
                                    } else 

            if("cancelOrder".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.CancelOrderResponse cancelOrderResponse7 = null;
	                        com.autoinc.order.process.autoincorderprocess.CancelOrder wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.CancelOrder)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.CancelOrder.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelOrderResponse7 =
                                                   
                                                   
                                                         skel.cancelOrder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelOrderResponse7, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "cancelOrder"));
                                    } else 

            if("registerUser".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.RegisterUserResponse registerUserResponse9 = null;
	                        com.autoinc.order.process.autoincorderprocess.RegisterUser wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse9 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse9, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "registerUser"));
                                    } else 

            if("updateOrderStatus".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse updateOrderStatusResponse11 = null;
	                        com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateOrderStatusResponse11 =
                                                   
                                                   
                                                         skel.updateOrderStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateOrderStatusResponse11, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "updateOrderStatus"));
                                    } else 

            if("showtotalCost".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse showtotalCostResponse13 = null;
	                        com.autoinc.order.process.autoincorderprocess.ShowtotalCost wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.ShowtotalCost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.ShowtotalCost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               showtotalCostResponse13 =
                                                   
                                                   
                                                         skel.showtotalCost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), showtotalCostResponse13, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "showtotalCost"));
                                    } else 

            if("registerCustomer".equals(methodName)){
                
                com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse registerCustomerResponse15 = null;
	                        com.autoinc.order.process.autoincorderprocess.RegisterCustomer wrappedParam =
                                                             (com.autoinc.order.process.autoincorderprocess.RegisterCustomer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.order.process.autoincorderprocess.RegisterCustomer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerCustomerResponse15 =
                                                   
                                                   
                                                         skel.registerCustomer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerCustomerResponse15, false, new javax.xml.namespace.QName("http://process.order.autoinc.com/AutoIncOrderProcess/",
                                                    "registerCustomer"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (FindCheapestSupplierFault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (CreateOrderFault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (RegisterCustomerFault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ShowtotalCostFault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (UpdateOrderStatusFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (RegisterUserFault e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AutoIncOrderFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.UpdateOrder param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrder.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.CreateOrder param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.CreateOrder.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.CreateOrderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.CreateOrderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.CancelOrder param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.CancelOrder.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.CancelOrderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.CancelOrderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.ShowtotalCost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.ShowtotalCost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.RegisterCustomer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterCustomer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse wrapupdateOrder(){
                                com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse wrapfindCheapestSupplier(){
                                com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.CreateOrderResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.CreateOrderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.CreateOrderResponse wrapcreateOrder(){
                                com.autoinc.order.process.autoincorderprocess.CreateOrderResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.CreateOrderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.CancelOrderResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.CancelOrderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.CancelOrderResponse wrapcancelOrder(){
                                com.autoinc.order.process.autoincorderprocess.CancelOrderResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.CancelOrderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.RegisterUserResponse wrapregisterUser(){
                                com.autoinc.order.process.autoincorderprocess.RegisterUserResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.RegisterUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse wrapupdateOrderStatus(){
                                com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse wrapshowtotalCost(){
                                com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse wrapregisterCustomer(){
                                com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse wrappedElement = new com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.autoinc.order.process.autoincorderprocess.UpdateOrder.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.UpdateOrder.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.UpdateOrderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.FindCheapestSupplier.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.FindCheapestSupplierResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.CreateOrder.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.CreateOrder.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.CreateOrderResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.CreateOrderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.CancelOrder.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.CancelOrder.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.CancelOrderResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.CancelOrderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.RegisterUser.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.RegisterUserResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.UpdateOrderStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.UpdateOrderStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.ShowtotalCost.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.ShowtotalCost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.ShowtotalCostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.RegisterCustomer.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.RegisterCustomer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.RegisterCustomerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.class.equals(type)){
                
                           return com.autoinc.order.process.autoincorderprocess.AutoIncOrderFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    