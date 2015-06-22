
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.autoinc.order.process.autoincorderprocess;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "Product".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.Product.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "address".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.User.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.Customer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "AutoIncOrderException".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.AutoIncOrderException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://process.order.autoinc.com/AutoIncOrderProcess/".equals(namespaceURI) &&
                  "Order".equals(typeName)){
                   
                            return  com.autoinc.order.process.autoincorderprocess.Order.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    