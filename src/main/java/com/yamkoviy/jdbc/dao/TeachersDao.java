package com.yamkoviy.jdbc.dao;

import com.yamkoviy.jdbc.models.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);
	Teacher getTeacherById(int id);
	void saveTacher(Teacher teacher);
}
