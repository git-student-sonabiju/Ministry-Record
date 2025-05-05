package com.edstem.ministryRecords.model;

import com.edstem.ministryRecords.enums.Document_type;
import com.edstem.ministryRecords.enums.Security_Classification;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.Format;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Document
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long document_number;
	private String title;
	private String description;
	private LocalDate creation_date;
	private String owner_department;
	private Document_type document_type;
	private Security_Classification security_classification;
	private String digital_file;
	private Format version;
}
