package com.edstem.ministryRecords.contract;

import com.edstem.ministryRecords.enums.Document_type;
import com.edstem.ministryRecords.enums.Security_Classification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDTO {
	private String title;
	private String description;
	private String owner_department;
	private Document_type document_type;
	private Security_Classification security_classification;
	private String digital_file;
}
