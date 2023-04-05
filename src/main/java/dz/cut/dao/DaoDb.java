package dz.cut.dao;

import org.springframework.stereotype.Component;

@Component
public class DaoDb implements IDao {
    @Override
    public double GetData() {
        System.out.println("Db version");
        return 10.2;
    }
}
