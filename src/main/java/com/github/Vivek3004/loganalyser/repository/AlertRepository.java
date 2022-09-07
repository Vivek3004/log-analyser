package com.github.Vivek3004.loganalyser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.Vivek3004.loganalyser.model.persistence.Alert;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
