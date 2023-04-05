package dz.cut.presentation;

import dz.cut.business.Business;
import dz.cut.business.IBusiness;
import dz.cut.dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInstantiation {
    public static void main(String[] args) throws Exception {

        // Dynamic instatiation via a setter
//        Scanner scanner = new Scanner(new File("config.txt"));
//        String DaoClassName = scanner.nextLine();
//        Class cDao = Class.forName(DaoClassName);
//        IDao dao = (IDao) cDao.newInstance();
//
//        String BusinessClassName = scanner.nextLine();
//        Class cBusiness = Class.forName(BusinessClassName);
//        Business business = (Business)cBusiness.newInstance();
//
//        business.setDao(dao);
//        System.out.println(business.Calculate());

        Scanner scanner = new Scanner(new File("config.txt"));
        String DaoClassName = scanner.nextLine();
        Class cDao = Class.forName(DaoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String BusinessClassName = scanner.nextLine();
        Class cBusiness = Class.forName(BusinessClassName);
        Business business = (Business)cBusiness.newInstance();

        // dyanamic setDao Call
        // call setDao method which is in bussiness object passing dao object as arg
        Method set = cBusiness.getMethod("setDao",IDao.class);
        set.invoke(business,dao);

        // static setDao Call
        // business.setDao(dao);

        System.out.println(business.Calculate());

    }
}
