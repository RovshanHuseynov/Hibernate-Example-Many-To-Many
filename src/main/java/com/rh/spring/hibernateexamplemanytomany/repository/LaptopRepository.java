package com.rh.spring.hibernateexamplemanytomany.repository;

import com.rh.spring.hibernateexamplemanytomany.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
