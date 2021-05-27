package DAO;

import POJO.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class ClazzDAO {
    public static List<Clazz> getAllClazzes() {
        Session session = HibernateUtil.getSession();

        List<Clazz> clazzes = null;
        try{
            final String hql = "select cl from Clazz cl";
            Query query = session.createQuery(hql);

            //get all students
            clazzes = query.list();

        }
        catch (Throwable ex){
            System.err.println(ex);
        } finally {
            session.close();
        }
        return clazzes;
    }



}
