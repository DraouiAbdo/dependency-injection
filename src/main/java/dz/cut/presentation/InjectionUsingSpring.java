package dz.cut.presentation;

import dz.cut.business.Business;
import dz.cut.business.IBusiness;
import dz.cut.dao.IDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InjectionUsingSpring {
    public static void main(String[] args) throws Exception {

        // using XML file
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // using Spring Annotations
        ApplicationContext context = new AnnotationConfigApplicationContext("dz.cut");


        IBusiness business = context.getBean(IBusiness.class);

        System.out.println("Result = "+business.Calculate());

    }
}














