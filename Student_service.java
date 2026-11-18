
package com.sms.service;

import java.util.List;
import com.sms.repository.Student_repository;
import com.sms.model.Student;

public class Student_service {

    Student_repository repo = new Student_repository();

    public boolean addStudent(Student student) {
        return repo.addStudent(student);
    }

    public List<Student> findAll() {
        return repo.findAll();
    }

    public Student findById(int id) {
        return repo.findById(id);
    }
}
