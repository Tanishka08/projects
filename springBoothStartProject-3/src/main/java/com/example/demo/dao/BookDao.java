package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.Book;

@Repository
@Transactional
public interface BookDao extends JpaRepository<Book, Integer> 
{

}
