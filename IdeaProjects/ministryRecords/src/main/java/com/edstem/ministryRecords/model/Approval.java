package com.edstem.ministryRecords.model;

import com.edstem.ministryRecords.enums.Approval_Status;
import jakarta.persistence.*;
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
public class Approval
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private DocumentWorkflow documentWorkflow;
	private Department approver_department;
	private Approval_Status approval_status;
	private LocalDate approval_date;
	private Long approval_id;
	private String comments;
}
