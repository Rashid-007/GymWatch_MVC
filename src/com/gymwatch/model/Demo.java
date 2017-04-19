package com.gymwatch.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tuple.entity.EntityMetamodel.GenerationStrategyPair;

public class Demo {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		User user1=new User("user1", "1234", "MANAGER");
		/**
		 * Objects initialization
		 */
		Gym gym1=new Gym("Offenburg", "Offenburg 77652");
		Manager manager1=new Manager("CR","3321","",gym1);
		Coach coach1=new Coach("AC","23123","", gym1); 
		Client client1=new Client("Ab","7896","male","er@gmail.com",format1.parse("12/12/1993"));
		SubType type1=new SubType("PrimaryPackages",25, "Primarycustomers");
		Subscription subscriptions1=new Subscription(format1.parse("01/12/2016"),format1.parse("01/01/2017"),1,25.0, type1, client1, gym1);

		gym1.setManager(manager1);
		manager1.setGym(gym1);
		gym1.getClients().add(client1);
		client1.setGym(gym1);
		gym1.getCoaches().add(coach1);
		coach1.setGym(gym1);
		gym1.addSubscription(subscriptions1);
		subscriptions1.setGym(gym1);
		client1.addSubscription(subscriptions1);
		subscriptions1.setClient(client1);
		subscriptions1.setSubs_type(type1);
		coach1.addClient(client1);
		client1.setCoach(coach1);

		//Session session=GymResourceFactory.getSessionFactory().openSession();
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(gym1);
		session.save(manager1);
		session.save(coach1);
		session.save(client1);
		session.save(type1);
		session.save(subscriptions1);
		session.save(user1);
		session.getTransaction().commit();
		session.close();
		System.out.println(gym1.searchClient("er@gmail.com").toString());



	}
}
