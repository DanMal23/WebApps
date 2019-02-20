
/**
 * CoursesServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package pl.edu.coursesonline.services.coursesservice;

    /**
     *  CoursesServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CoursesServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CoursesServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CoursesServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getCourseByCodeRequestNumber method
            * override this method for handling normal response from getCourseByCodeRequestNumber operation
            */
           public void receiveResultgetCourseByCodeRequestNumber(
                    pl.edu.coursesonline.categories.courses.CourseResponseType result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCourseByCodeRequestNumber operation
           */
            public void receiveErrorgetCourseByCodeRequestNumber(java.lang.Exception e) {
            }
                


    }
    