package com.edstem.ministryRecords.repository;

import com.edstem.ministryRecords.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long>
{
}
