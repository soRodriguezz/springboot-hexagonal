package com.example.api.domain.repositories;

import com.example.api.domain.entities.DocumentType;

import java.util.List;
import java.util.Optional;

public interface DocumentTypeRepository {
    List<DocumentType> getAll();
    Optional<DocumentType> getTypeDocumentById(int id);
    DocumentType saveDocumentType(DocumentType documentType);
    void deleteDocumentType(int ind);
}
