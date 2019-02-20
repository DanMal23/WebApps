
/**
 * CoursesServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package pl.edu.coursesonline.services.coursesservice;

import pl.edu.coursesonline.categories.courses.CourseResponseType;

/**
     *  CoursesServiceSkeleton java skeleton for the axisService
     */
    public class CoursesServiceSkeleton implements CoursesServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
             * @param courseRequestType0 
             * @return courseResponseType1 
         */
        
                 public pl.edu.coursesonline.categories.courses.CourseResponseType getCourseByCodeRequestNumber
                  (
                  pl.edu.coursesonline.categories.courses.CourseRequestType courseRequestType0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 CourseResponseType courseResponseType = new CourseResponseType();
                	 courseResponseType.setCourseId(courseRequestType0.getCodeNumber());
                	 courseResponseType.setCourseName("Course Web Service SOAP");
                	 courseResponseType.setProvider("Course provided to you by: ");
                	 courseResponseType.setCategory("Course's Category: ");
					return courseResponseType;
            }
     
    }
    