package com.SaiJava.HibernateRelationMapping;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop=new Laptop();
        laptop.setLid(1);
        laptop.setLname("dell");
    	Student s=new Student();
    	s.setRollno(101);
    	s.setSname("siva");
    	s.setMarks("100");
         //laptop.getStd().add(s);               -->for many to many
    	//s.setLaptop(laptop);                -->for one to one relation 
    	//s.getLaptop().add(l);                -->for one to many relation 
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	org.hibernate.service.ServiceRegistry rg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry(); 
    	SessionFactory sf=cfg.buildSessionFactory(rg);
    	Session session=sf.openSession();
    	org.hibernate.Transaction tx=session.beginTransaction();
    	session.save(s);
    	session.save(laptop);
    }
}
