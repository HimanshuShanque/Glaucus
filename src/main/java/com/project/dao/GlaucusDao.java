package com.project.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * GlaucusDao.class is implemented to apply database operations.
 * @author Himanshu Sahu
 * @version 1.0 Build 01 Dec 12, 2018
 */
@Repository
public class GlaucusDao {
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	

	/**
	 * The increase method is responsible to increment the value in database by one on every rest call.
	 * It is thread safe.
	 * @return It returns a String value based on the success or failure of the operation performed.
	 * @exception It throws CannotGetJdbcConnectionException for database connection error.
	 * @exception It throws General Exception for unknown error.
	 */
	public synchronized String increase () { 
		
		String statement="Updated";
		try {
		jdbcTemplateObject.update("UPDATE public.glaucus SET \"number\"=((SELECT \"number\" FROM public.glaucus)+1)");
		}
		catch(CannotGetJdbcConnectionException e) {
			System.out.println(e);
			statement = "Database Connection Error";
		}
		catch(Exception e)
		{
			System.out.println(e);
			statement="Error occured";
		}
		
		return statement;
		
	}

}
