package com.edstem.ministryRecords.contract;

import com.edstem.ministryRecords.enums.Current_State;
import com.edstem.ministryRecords.model.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentWorkflowDTO {
	private Document document;
	private Current_State current_state;
	private String comments;
}
