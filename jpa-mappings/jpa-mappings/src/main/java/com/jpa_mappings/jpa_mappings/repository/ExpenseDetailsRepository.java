package com.jpa_mappings.jpa_mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa_mappings.jpa_mappings.entity.ExpenseDetailsEntity;

@Repository
public interface ExpenseDetailsRepository extends JpaRepository<ExpenseDetailsEntity, Integer> {
}
