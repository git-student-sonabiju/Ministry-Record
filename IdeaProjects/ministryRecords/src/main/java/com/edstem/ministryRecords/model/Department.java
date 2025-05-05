package com.edstem.ministryRecords.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String department_code;
	private String name;
	private String description;
	private String status;
}
