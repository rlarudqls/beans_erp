// src/main/java/com/beans/erp/controller/DocumentController.java

package com.beans.erp.controller;

import com.beans.erp.model.Document;
import com.beans.erp.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/documents")
public class BeansDocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public String listDocuments(Model model) {
        model.addAttribute("documents", documentService.getAllDocuments());
        return "documentList";
    }

    @GetMapping("/{id}")
    public String viewDocument(@PathVariable Long id, Model model) {
        model.addAttribute("document", documentService.getDocumentById(id));
        return "documentView";
    }

    @PostMapping
    public String createDocument(Document document) {
        documentService.saveDocument(document);
        return "redirect:/documents";
    }

    @DeleteMapping("/{id}")
    public String deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
        return "redirect:/documents";
    }

    // ... More CRUD operations ...
}
