/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mr.main;
import com.mr.xuesheng.Xuesheng;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 *
 * @author Administrator
 */
public class AddXuesheng {
    public static void main(String[] args) {
        System.out.println("test...");//测试
        try {
            //1. 创建一个 SessionFactory 对象
            //1). 创建 Configuration 对象: 对应 hibernate 的基本配置信息和 对象关系映射信息
            Configuration configuration = new Configuration().configure();
            //2). 创建一个 ServiceRegistry 对象: hibernate 4.x 新添加的对象
            //hibernate 的任何配置和服务都需要在该对象中注册后才能有效.
            ServiceRegistry serviceRegistry
                    = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            //3).
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            //2. 创建一个 Session 对象
            Session session = sessionFactory.openSession();
            //3. 开启事务
            Transaction transaction = session.beginTransaction();
            
            //增加数据        
            /*
            Xuesheng xuesheng = new Xuesheng();
            xuesheng.setXuehao("10");
            xuesheng.setXingming("五六七");
            xuesheng.setNianling(19);
            xuesheng.setDianhua("110119");
            xuesheng.setYouxiang("1265454@163.com");
            session.save(xuesheng);
            */
            
            //修改数据
            /*
            Xuesheng xuesheng =(Xuesheng) session.get(Xuesheng.class,"bbc3606257414848015741484ae90000" );
            xuesheng.setXingming("赵一");
            session.update(xuesheng);
            */
           
            //删除数据
            /*
            Xuesheng xuesheng =(Xuesheng) session.get(Xuesheng.class,"bbc3606257414848015741484ae90000" );
            session.delete(xuesheng);
            */
            
            //查询数据
            
            Xuesheng xuesheng =(Xuesheng) session.get(Xuesheng.class,"bbc360625741499c015741499e4a0000" );
            System.out.println("学生姓名："+xuesheng.getXingming());
            

            //提交事物
            transaction.commit();
            //关闭
            session.close();
        } catch (Throwable ex) {
      throw new ExceptionInInitializerError(ex);
        }
    }
}
