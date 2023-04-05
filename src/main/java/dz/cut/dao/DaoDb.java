package dz.cut.dao;

public class DaoDb implements IDao {
    @Override
    public double GetData() {
        System.out.println("Db version");
        return 10.2;
    }
}
