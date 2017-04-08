package org.webscrollers.bharath.ResumeFormat.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.webscrollers.bharath.ResumeFormat.dao.ResumeDao;
import org.webscrollers.bharath.ResumeFormat.model.User;
import org.webscrollers.bharath.ResumeFormat.util.DatabaseUtil;

public class ResumeDaoImpl implements ResumeDao{

	public User addUser(User user) throws Exception{
		Connection connection = null;
		User resp = null;
		int key = 0;
		try {
			connection = DatabaseUtil.getConnection();
			String query = " insert into rf_users (name, email, phoneno, linkedin, github, summary)"
			        + " values (?, ?, ?, ?, ?, ?)";

	        PreparedStatement preparedStmt = connection.prepareStatement(query, new String[]{"ID"});
	        preparedStmt.setString(1, user.getName());
	        preparedStmt.setString(2, user.getEmail());
	        preparedStmt.setString(3, user.getPhoneno());
	        preparedStmt.setString(4, user.getLinkedin());
	        preparedStmt.setString(5, user.getGithub());
	        preparedStmt.setString(6, user.getSummary());
	        preparedStmt.executeUpdate();
	      
	        ResultSet rs = preparedStmt.getGeneratedKeys();
	        if (rs.next()) {
	           key = rs.getInt(1);
	        }
	        user.setId(key);
	        resp = addSkillToUser(user);
	        connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return resp;
	}
	
	public User addSkillToUser(User user) throws Exception{
		Connection connection = null;
		try {
			connection = DatabaseUtil.getConnection();
			String query = " insert into rf_skills (languages, framework, devtech, scripting, methodologies, servers, databases,"
					+ "operatingsystem, othertools, user_id)"
			        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        PreparedStatement preparedStmt = connection.prepareStatement(query);
	        preparedStmt.setString(1, user.getSkills().getLanguages());
	        preparedStmt.setString(2, user.getSkills().getFramework());
	        preparedStmt.setString(3, user.getSkills().getDevtech());
	        preparedStmt.setString(4, user.getSkills().getScripting());
	        preparedStmt.setString(5, user.getSkills().getMethodologies());
	        preparedStmt.setString(6, user.getSkills().getServers());
	        preparedStmt.setString(7, user.getSkills().getDatabases());
	        preparedStmt.setString(8, user.getSkills().getOperatingsystem());
	        preparedStmt.setString(9, user.getSkills().getOthertools());
	        preparedStmt.setInt(10, user.getId());
	        preparedStmt.executeUpdate();
	        connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return user;
	}
	
}
