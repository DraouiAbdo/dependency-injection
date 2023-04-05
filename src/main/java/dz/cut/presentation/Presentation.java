package dz.cut.presentation;

import dz.cut.business.Business;
import dz.cut.business.IBusiness;
import dz.cut.dao.DaoDb;
import dz.cut.external.DaoWS;

public class Presentation {


    public static void main(String[] args) {


//      1- Static injection via a constructor
        Business business = new Business(new DaoDb());

//        2-  Static injection via a setter
//        Business business = new Business();
//        business.setDao(new DaoWS());



        System.out.println("Result : "+business.Calculate());

    }


}
