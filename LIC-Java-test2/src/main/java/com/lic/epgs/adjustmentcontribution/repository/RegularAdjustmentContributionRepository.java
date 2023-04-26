package com.lic.epgs.adjustmentcontribution.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.adjustmentcontribution.model.RegularAdjustmentContribution;

@Repository
public interface RegularAdjustmentContributionRepository extends JpaRepository<RegularAdjustmentContribution, Long> {
	
	/**
	 * This method is used to remove an adjustment contribution batch from the database.
	 * 
	 * @param batchId The id of the batch to be removed
	 * 
	 * @return A JSON response indicating the status and message of the transaction
	 */
	public Optional<Object> removeAdjustmentContributionBatch(Long batchId);

}