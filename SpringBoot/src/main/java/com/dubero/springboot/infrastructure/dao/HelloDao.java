package com.dubero.springboot.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dubero.springboot.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
