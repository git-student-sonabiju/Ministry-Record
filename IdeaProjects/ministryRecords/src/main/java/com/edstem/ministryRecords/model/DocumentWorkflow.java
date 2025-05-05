package com.edstem.ministryRecords.model;

import com.edstem.ministryRecords.enums.Current_State;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DocumentWorkflow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Document document;
	private Current_State current_state;
	private LocalDate last_modified_date;
	private LocalDate last_modifiedByUserId;
	private String comments;
}
