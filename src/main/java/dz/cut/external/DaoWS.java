package dz.cut.external;

import dz.cut.dao.IDao;

public class DaoWS implements IDao {
    @Override
    public double GetData() {
        System.out.println("Web Service version");
        return 5;
    }
}
