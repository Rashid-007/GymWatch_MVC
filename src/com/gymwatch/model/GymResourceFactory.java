package com.gymwatch.model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

public class GymResourceFactory {
	private boolean flag=false;
	private static SessionFactory sessionFactory;
	public GymResourceFactory(){ 
		
	}
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable e){
			throw new ExceptionInInitializerError(e);	
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public boolean checkLogin(String username, String password, String user){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		if(user=="MANAGER"){
			//String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"' AND category='ADMINISTRATOR'";
			Query query = session.createQuery("select count(*) from User where username='"+username+"' AND password='"+password+"' AND user='MANAGER'");
			boolean exists = (long)query.uniqueResult()>0;
			try{
				//rs=stmt.executeQuery(query);
				if(exists){
					flag=true;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			Query query = session.createQuery("select count(*) from User where username='"+username+"' AND password='"+password+"' AND user='COMMON'");
			//String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'AND category='NORMAL USER'";
			boolean exists = (long)query.uniqueResult()>0;
			try{
				//rs=stmt.executeQuery(query);
				if(exists){
					flag=true;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		session.close();
		return flag;
	}
	public void addClient(String name, String phone, String email, Date birthDate, String gender){
		Client client = new Client(name,phone, gender, email, birthDate);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(client);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteClient(String value){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
/*		try {
			  String hql = "delete from Client where name=?";
			  Query query = session.createQuery(hql);
			  query.setString(0, value);
			  System.out.println(query.executeUpdate());
			  // your code end
			  session.getTransaction().commit();
			} catch (Throwable t) {
			  session.getTransaction().rollback();
			  throw t;
			}*/
		session.getTransaction().commit();
		session.close();
	}
	public List<Client> getClientTable(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
/*		Criteria cr = session.createCriteria(Client.class);
			    cr.setProjection(Projections.projectionList()
			    	      .add(Projections.property("name"), "Name")
			    	      .add(Projections.property("phone"), "Phone")
			    	      .add(Projections.property("email"), "Email")
			    	      .add(Projections.sqlGroupProjection("date(birth_date) as Birth_Date", "Birth_Date", new String[] { "Birth_Date" }, new Type[] { StandardBasicTypes.DATE }))
			    	      //.add(Projections.groupProperty("Birth_Date"))
			    	      .add(Projections.property("gender"), "Gender")
			    	      .add(Projections.property("coach.id"), "Coach ID")
			    	      .add(Projections.property("gym.id"), "Gym ID"))
			    //.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
			    .setResultTransformer(Transformers.aliasToBean(Client.class));
			  List<Client> list = (List<Client>)cr.list();*/
		Query query = session.createQuery("from Client"); //You will get Client object
		List<Client> list = (List<Client>)query.list();
		//session.close();
		return list;
	}
	
	
    public DefaultTableModel buildTableModel(List<Client> list) throws SQLException {

    	//ClassMetadata clientMeta = sessionFactory.getClassMetadata(Client.class);
        String[] columnNames = {"NAME", "PHONE", "EMAIL", "Birth Date", "GENDER", "COACH ID", "GYM ID"};
        Vector<String> colNamesVec = new Vector<String>();
        int columnCount = columnNames.length;
        for (int i = 0; i < columnCount; i++) {
            colNamesVec.add(columnNames[i]);
        }
        Vector<Vector<String>> dataVec = new Vector<Vector<String>>();
        //Object[] data = clientMeta.getPropertyValues(Object);
        //createCriteria(MyEntity.class).list();
        System.out.println(list.size());
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        for (int i = 0; i < list.size() ; i++) {
        	 Vector<String> vector = new Vector<String>();
        	 //String[] str=new String[7];
        	 vector.add(list.get(i).getName());
        	 vector.add(list.get(i).getPhone());
        	 vector.add(list.get(i).getEmail());
        	 vector.add(df.format(list.get(i).getBirthDate()));
        	 vector.add(list.get(i).getGender());
        	 vector.add(String.valueOf(list.get(i).getCoach().getId()));
        	 vector.add(String.valueOf(list.get(i).getGym().getId()));
        	 
/*        	 str[0]=list.get(i).getName();
        	 str[1]=list.get(i).getPhone();
        	 str[2]=list.get(i).getEmail();
        	 str[3]=df.format(list.get(i).getBirthDate());
        	 str[4]=list.get(i).getGender();
        	 str[5]=String.valueOf(list.get(i).getCoach().getId());
        	 str[6]=String.valueOf(list.get(i).getGym().getId());*/
        	 //vector.add(str);
        	 dataVec.add(vector);
        }
        return new DefaultTableModel(dataVec, colNamesVec);
/*    	Vector<Vector<Object>> dataVec = new Vector<Vector<Object>>();
    	Vector<String> colNamesVec = new Vector<String>();
    	 System.out.println(list.size());
    	return new DefaultTableModel(dataVec, colNamesVec);*/
       
    }
}
