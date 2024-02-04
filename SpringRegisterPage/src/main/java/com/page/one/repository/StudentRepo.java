package com.page.one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.page.one.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {

}
