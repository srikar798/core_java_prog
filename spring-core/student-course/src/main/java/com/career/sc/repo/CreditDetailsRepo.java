package com.career.sc.repo;

import com.career.sc.domain.CreditDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditDetailsRepo extends JpaRepository<CreditDetails,Long> {
}
