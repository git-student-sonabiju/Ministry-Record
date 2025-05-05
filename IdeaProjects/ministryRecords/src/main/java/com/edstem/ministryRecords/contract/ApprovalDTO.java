package com.edstem.ministryRecords.contract;

import com.edstem.ministryRecords.enums.Approval_Status;
import com.edstem.ministryRecords.model.Department;
import com.edstem.ministryRecords.model.DocumentWorkflow;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalDTO
{
	private DocumentWorkflow documentWorkflow;
	private Department approver_department;
	private Approval_Status approval_status;
	private String comments;
}
