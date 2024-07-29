package com.currency.metalrate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currency.metalrate.model.MetalValue ;

@Repository
public interface MetalValueRepository extends JpaRepository<MetalValue, Long> {
    MetalValue findByFromAndTo(String from,String to);

}
