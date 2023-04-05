package dz.cut.business;

import dz.cut.dao.IDao;

public class Business implements IBusiness {

    private IDao dao;

//            1- Static injection via a constructor
//    public Business(IDao dao){
//        this.dao = dao;
//    }

//    2- static injection via a setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double Calculate() {
        System.out.println("Business 1");
        return dao.GetData()*5;
    }
}
