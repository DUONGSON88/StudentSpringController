package com.example.sevice;

import java.util.List;

public interface iStudentSevice<E> {
    void add(E e);
    int findById(int id);
    void delete(int id);
    void update(int id , E e);
    List<E> findAll();
}
