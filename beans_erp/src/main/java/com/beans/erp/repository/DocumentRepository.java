// src/main/java/com/beans/erp/repository/DocumentRepository.java

package com.beans.erp.repository;

import com.beans.erp.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
