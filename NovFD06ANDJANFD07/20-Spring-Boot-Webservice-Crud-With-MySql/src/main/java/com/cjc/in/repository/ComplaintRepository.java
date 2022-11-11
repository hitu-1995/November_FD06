package com.cjc.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer>{

}
