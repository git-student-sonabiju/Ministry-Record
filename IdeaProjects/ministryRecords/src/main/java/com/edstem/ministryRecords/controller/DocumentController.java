package com.edstem.ministryRecords.controller;

import com.edstem.ministryRecords.contract.DocumentDTO;
import com.edstem.ministryRecords.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/documents/search")
@RestController
public class DocumentController
{
private final DocumentService documentService;

@Autowired
	public DocumentController(DocumentService documentService) {
		this.documentService = documentService;
	}
@GetMapping
	public ResponseEntity <List<DocumentDTO>> getDocuments()
{
	return ResponseEntity.ok(documentService.getDocuments());
}
}
