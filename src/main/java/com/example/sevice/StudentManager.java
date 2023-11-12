package com.example.sevice;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements iStudentSevice<Student> {
    private List<Student> list=new ArrayList<>();
    public StudentManager(){
        list.add(new Student(1,"son","son@gmail.com","HN"));
        list.add(new Student(2,"toan","toan@gmail.com","HN2"));
        list.add(new Student(3,"duong","duong@gmail.com","HN3"));
    }
    public Student StudentFindById(int id){
        for (Student student:list) {
            if (id==student.getId()){
                return student;
            }
        }
        return null;
    }
    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        list.remove(index);
    }

    @Override
    public void update(int id, Student student) {
        int index = findById(id);
        list.set(index, student);
    }

    @Override
    public List<Student> findAll() {
        return list;
    }
    public List<Student> searchByName(String name){
        List<Student> listSearch=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                listSearch.add(list.get(i));
            }
        }
        if (!listSearch.isEmpty()){
            return listSearch;
        }else {
            return null;
        }
    }
}
