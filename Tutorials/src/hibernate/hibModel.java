package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class hibModel {
	
	//calls the instance of the survey bean that has the values
	UserBean Ubean = new UserBean();
	
	
	public void addToDb (UserBean Ubean){
		
		//starts the session
		Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
		
		//creates the transaction
		Transaction transaction = session.beginTransaction();
		
		//saves the values that are in SurveyBean
		session.save(Ubean);
		
		//saves the session and exits
		transaction.commit();
	}

}
