package com.students;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kpit.HotelReception;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspring.xml");
		
		StudentController studController = (StudentController) ctx.getBean(StudentController.class);
		
		
	}
}
// JPA code
@Repository
class StudentRepo {
	@Autowired
	Student student;
	
	
}
@Service
class StudentService {
	@Autowired
	StudentRepo studRepo;
	
	
}
@Controller
class StudentController {
	@Autowired 
	StudentService studService;
	
}

