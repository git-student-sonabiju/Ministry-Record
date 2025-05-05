package com.edstem.ministryRecords.service;

import com.edstem.ministryRecords.contract.DocumentDTO;
import com.edstem.ministryRecords.model.Document;
import com.edstem.ministryRecords.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentService {

private final DocumentRepository documentRepository;

	public DocumentService(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}
	public List<DocumentDTO> getDocuments()
	{
		return documentRepository.findAll().stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList());
	}

	private DocumentDTO convertToDTO(Document document)
	{
		return DocumentDTO.builder()
				.title(document.getTitle())
				.document_type(document.getDocument_type())
				.description(document.getDescription())
				.digital_file(document.getDigital_file())
				.owner_department(document.getOwner_department())
				.security_classification(document.getSecurity_classification())
				.build();
	}
}
