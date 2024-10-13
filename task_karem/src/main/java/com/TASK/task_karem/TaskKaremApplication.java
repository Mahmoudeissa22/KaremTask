package com.TASK.task_karem;

import com.TASK.task_karem.dao.UserDao;
import com.TASK.task_karem.entity.Material;
import com.TASK.task_karem.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskKaremApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskKaremApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserDao userDao){

		return runner -> {
			createUserandMatrial(userDao);
			findUser(userDao);
			deleteuser(userDao);
			updateuser(userDao);

		};
	}

	private void updateuser(UserDao userDao) {
		int userId = 1;
		User theUser = userDao.findUserById(userId);
		theUser.setName("Ali");
		userDao.update(theUser);
	}

	private void deleteuser(UserDao userDao) {
		int theId = 1;
		userDao.deleteUser(theId);
	}

	private void findUser(UserDao userDao) {
		int theId = 1;
		User tempUser = userDao.findUserById(theId);
	}

	private void createUserandMatrial(UserDao userDao) {

		User newUser = new User("Mahmoud" , "mm@Gmail.com");
		Material newMat = new Material("English" , 6666);

		newUser.setMaterial(newMat);
		userDao.save(newUser);
	}


}
