/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



/**
 *
 * @author rjs
 */

public class Find {
      
   public static void main(String[] args)       
   {
  //创建session工厂  
       //1)创建Configuration对象
        Configuration cfg = new Configuration().configure();
       //2)创建SessionFactory对象
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
       StandardServiceRegistry sr = srb.build();

   
   SessionFactory sf= cfg.buildSessionFactory(sr);
          
   Session session = sf.openSession();  
   Transaction tx= session.beginTransaction();
     
  Cjhlei n= (Cjhlei)session.get(Cjhlei.class,"bbc36063574036230157403626f80000");
    session.delete(n);
 
   tx.commit();
   session.close();
   sf.close();
   }

}
