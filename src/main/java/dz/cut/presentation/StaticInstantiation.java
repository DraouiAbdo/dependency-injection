package dz.cut.presentation;

import dz.cut.business.Business;
import dz.cut.dao.DaoDb;
import dz.cut.external.DaoWS;

public class StaticInstantiation {


    public static void main(String[] args) {


//      1- Static injection via a constructor
        //Business business = new Business(new DaoDb());

//        2-  Static injection via a setter
        Business business = new Business();
        business.setDao(new DaoDb());

        System.out.println("Result : "+business.Calculate());
        System.out.println("---------------------");

        // injection another Dao object
        business.setDao(new DaoWS());

        System.out.println("Result : "+business.Calculate());

    }


}
