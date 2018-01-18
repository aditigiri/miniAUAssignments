package com.accolite.jdbc;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        e.setEmpId(1000);
        e.setEmpName("Aditi Giri");
        e.setSalary(50000);
        
        Laptop laptop = new Laptop();
        laptop.setLaptopId(100);
        laptop.setBrand("Dell");
        laptop.setPrice("30000");
        
        e.setLaptop(laptop);
        
        Expenses exp = new Expenses();
        exp.setExId(10);
        exp.setAmount(350);
        
        Expenses exp1 = new Expenses();
        exp1.setExId(11);
        exp1.setAmount(570);
        
        Expenses exp2 = new Expenses();
        exp2.setExId(12);
        exp2.setAmount(245);
        
        e.getExpenses().add(exp);
        e.getExpenses().add(exp1);
        e.getExpenses().add(exp2);
        
        Configuration com = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Expenses.class);
        SessionFactory sf = com.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(exp);
        session.save(exp1);
        session.save(exp2);
        session.save(laptop);
        session.save(e);
        t.commit();
        session.close();
    }
}
