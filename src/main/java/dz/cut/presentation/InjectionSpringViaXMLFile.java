package dz.cut.presentation;

import dz.cut.business.Business;
import dz.cut.business.IBusiness;
import dz.cut.dao.IDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InjectionSpringViaXMLFile {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IBusiness business = (IBusiness)context.getBean("business");

        System.out.println("Result = "+business.Calculate());

    }
}














