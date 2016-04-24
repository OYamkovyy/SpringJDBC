package com.yamkoviy.jdbc.worker;

import org.springframework.beans.factory.annotation.Autowired;

import com.yamkoviy.jdbc.dao.StudentsDao;
import com.yamkoviy.jdbc.models.Student;

public class WorkWithStudents {
	@Autowired
	private StudentsDao studentsDao;

	public void saveStudentToDb(Student student){
	if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
	studentsDao.addStudent(student);
	System.out.println("Student have been saved "+student);
	}
	}

}
