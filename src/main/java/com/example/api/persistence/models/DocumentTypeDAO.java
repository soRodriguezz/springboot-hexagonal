package com.example.api.persistence.models;

import javax.persistence.*;

@Entity
@Table(name = "document_type")
public class DocumentTypeDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document_type")
    private Integer idDocumentType;

    private String name;

}

