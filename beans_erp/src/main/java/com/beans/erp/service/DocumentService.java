package com.beans.erp.service;

import com.beans.erp.model.Document;
import com.beans.erp.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

	@Autowired
	private DocumentRepository documentRepository;

	public List<Document> getAllDocuments() {
		return documentRepository.findAll();
	}

	public Document getDocumentById(Long id) {
		return documentRepository.findById(id).orElse(null);
	}

	public Document saveDocument(Document document) {
		return documentRepository.save(document);
	}

	public void deleteDocument(Long id) {
		documentRepository.deleteById(id);
	}
}
