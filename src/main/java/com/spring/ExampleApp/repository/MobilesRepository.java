package com.spring.ExampleApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ExampleApp.model.Mobiles;

@Repository
public interface MobilesRepository extends JpaRepository<Mobiles, Integer>{

}
