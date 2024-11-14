package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Services");
        double data = 35;
        return data;
    }
}