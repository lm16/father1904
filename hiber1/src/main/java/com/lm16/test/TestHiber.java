package com.lm16.test;

import com.lm16.bean.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHiber {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Product product = new Product();
        product.setName("iphone6s");
        product.setPrice(1700);
        s.save(product);

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
