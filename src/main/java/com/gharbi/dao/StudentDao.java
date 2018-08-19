package com.gharbi.dao;

import com.gharbi.model.Student;
import java.util.List;

public interface StudentDao {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();
}
