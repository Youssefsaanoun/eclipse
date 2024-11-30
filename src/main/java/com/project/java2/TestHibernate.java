package com.project.java2;

public class TestHibernate {
	 public static void main(String[] args) {
	        HibernateUtil.getSessionFactory().openSession().close();
	        HibernateUtil.shutdown();
	        System.out.println("Hibernate initialized successfully.");
	    }

}
