package com.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.GlaucusDao;
/**
 * GlaucusService.class is implemented to apply business logics needed to be performed on the data, now or in future.
 * @author Himanshu Sahu
 * @version 1.0 Build 01 Dec 12, 2018
 */

@Service
public class GlaucusService {
	
	@Autowired
	GlaucusDao glaucusDao;
	/**
	 * The increase method is responsible to transfer data from controller class to dao class and vice versa.
	 * @return It returns a String value returned by the dao class method.
	 */ 
	public String increase() {
		
		return glaucusDao.increase();
	}

}
