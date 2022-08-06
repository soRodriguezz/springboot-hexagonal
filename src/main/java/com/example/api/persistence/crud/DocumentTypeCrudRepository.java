package com.example.api.persistence.crud;

import com.example.api.persistence.models.DocumentTypeDAO;
import org.springframework.data.repository.CrudRepository;

public interface DocumentTypeCrudRepository extends CrudRepository<DocumentTypeDAO, Integer> {
}
