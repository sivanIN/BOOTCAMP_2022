package com.dependency_injection.DependencyInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ConfigurableApplicationContext application = new ClassPathXmlApplicationContext("configuration.xml");
       Car car = (Car) application.getBean("c");
       car.moveLeft();
       car.moveRight();
       
       
       Vehicle vehicle = (Vehicle) application.getBean("vec");
       vehicle.moveVehicle();
    }
}
