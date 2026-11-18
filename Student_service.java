
package com.sms.service;

import java.util.List;
import com.sms.repository.StudentRepository;
import com.sms.model.Student;

public class Student_service {

    StudentRepository repo = new StudentRepository();

    	public boolean addStudent(Student student) {
    		return repo.add(student);
    	}

    	public List<Student> findAll() {
    		return repo.findAll();
    	}

    	public Student findById(int id) {
    		return repo.findById(id);
    	}
}
