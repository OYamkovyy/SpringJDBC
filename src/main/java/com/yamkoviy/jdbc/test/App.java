package com.yamkoviy.jdbc.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yamkoviy.jdbc.models.Student;
import com.yamkoviy.jdbc.models.Teacher;
import com.yamkoviy.jdbc.worker.WorkWithStudents;
import com.yamkoviy.jdbc.worker.WorkWithTeacher;

public class App {
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		WorkWithStudents worker = 
		(WorkWithStudents) context.getBean("worker");
		//new WorkWithStudents();
		Student testStudent = new Student("Oleksandr Yamkoviy", 4);
		worker.saveStudentToDb(testStudent);
		
	
	WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
			Teacher teacher = new Teacher();
			teacher.setFirstname("Teacher");
			teacher.setLastname("Teacher");
			teacher.setCellphone("+3804134653457");
			teacher = workWithTeacher.addTeacher(teacher);
			teacher.setBirthDate(new Date());
			workWithTeacher.saveTacher(teacher);
	}

}
