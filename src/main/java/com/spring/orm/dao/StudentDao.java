package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    //Save in table.
    @Transactional
    public int insert(Student student){
        return (Integer) this.hibernateTemplate.save(student);
    }

    //Get single student
    public Student getStudent(int id){
        return this.hibernateTemplate.get(Student.class, id);
    }

    //Get all student
    public List<Student> getAllStudents(){
        return this.hibernateTemplate.loadAll(Student.class);
    }

    //Delete student
    @Transactional
    public void delete(int id){
        Student student = this.hibernateTemplate.get(Student.class, id);
        this.hibernateTemplate.delete(student);
    }

    //Updating data
    @Transactional
    public void update(Student student){
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
