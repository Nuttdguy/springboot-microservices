package com.springboot.microservice.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TeamRepository extends CrudRepository<Team, Long> {

}
