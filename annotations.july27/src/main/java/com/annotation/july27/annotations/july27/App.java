package com.annotation.july27.annotations.july27;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
//       Car c = annotationConfigApplicationContext.getBean(Car.class);
       Vehicle v = annotationConfigApplicationContext.getBean(Vehicle.class);
       v.moveVehicle();
    }
}
