/**
 * 
 */
package com.infosys.irs.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.irs.entity.AdminUserEntity;
import com.infosys.irs.entity.UserEntity;
import com.infosys.irs.exception.InvalidCredentialException;
import com.infosys.irs.model.AdminUser;
import com.infosys.irs.model.Login;
import com.infosys.irs.model.User;
import com.infosys.irs.repository.AdminUserRepository;
import com.infosys.irs.repository.UserRepository;


@Service
public class LoginService {
	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
	private AdminUserRepository adminUserRepository;	
	
	public User authenticateLogin(Login userLogin) throws InvalidCredentialException{
		Optional<UserEntity> optionalUserentity = userRepository.findById(userLogin.getUserName());
		User user=new User();
		UserEntity userentity = optionalUserentity.get();
		user.setCity(userentity.getCity());
		user.setEmail(userentity.getEmail());
		user.setName(userentity.getName());
		user.setPassword(userentity.getPassword());
		user.setPhone(userentity.getPhone());
		user.setUserId(userentity.getUserId());
		
		if (user == null){
			throw new InvalidCredentialException(
					"LoginService.INVALID_CREDENTIALS");
		}
		else if(!(user.getPassword().equals(userLogin.getPassword()))){
			throw new InvalidCredentialException(
					"LoginService.INVALID_CREDENTIALS");
		}
		return user;				
	}

	@Transactional
	public AdminUser authenticateAdminLogin(Login userLogin) throws InvalidCredentialException {
		// TODO Auto-generated method stub
		
		/*AdminUserEntity userentity = new AdminUserEntity();
		userentity.setCity("Pata ni yr");
		userentity.setEmail("admin@gmail.com");
		userentity.setName("Admin");
		userentity.setPassword(userLogin.getPassword());
		userentity.setPhone("8008580085");
		userentity.setUserId(userLogin.getUserName());
		return adminUserRepository.saveAndFlush(userentity);*/
		
		Optional<AdminUserEntity> optionalUserentity = adminUserRepository.findById(userLogin.getUserName());
		AdminUser user=new AdminUser();
		AdminUserEntity userentity = optionalUserentity.get();
		user.setCity(userentity.getCity());
		user.setEmail(userentity.getEmail());
		user.setName(userentity.getName());
		user.setPassword(userentity.getPassword());
		user.setPhone(userentity.getPhone());
		user.setUserId(userentity.getUserId());
		
		if (user == null){
			throw new InvalidCredentialException(
					"LoginService.INVALID_CREDENTIALS");
		}
		else if(!(user.getPassword().equals(userLogin.getPassword()))){
			throw new InvalidCredentialException(
					"LoginService.INVALID_CREDENTIALS");
		}
		return user;
	}
}
