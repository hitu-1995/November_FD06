package com.cjc.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Dominoz;

@Repository
public interface DominozRepository  extends JpaRepository<Dominoz, Integer>{

}
