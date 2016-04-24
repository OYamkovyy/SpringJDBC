package com.yamkoviy.jdbc.dao;

import com.yamkoviy.jdbc.models.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}
