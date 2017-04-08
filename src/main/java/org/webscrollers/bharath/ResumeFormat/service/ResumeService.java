package org.webscrollers.bharath.ResumeFormat.service;

import org.webscrollers.bharath.ResumeFormat.dao.ResumeDao;
import org.webscrollers.bharath.ResumeFormat.daoImpl.ResumeDaoImpl;
import org.webscrollers.bharath.ResumeFormat.model.User;

public class ResumeService {
	
	ResumeDao rsDao = null;
	
	public User addUser(User user){
		rsDao = new ResumeDaoImpl();
		try {
			rsDao.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
}
