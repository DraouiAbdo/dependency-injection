package dz.cut.business;

import dz.cut.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Business implements IBusiness {

    @Autowired @Qualifier("daoDb")
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
