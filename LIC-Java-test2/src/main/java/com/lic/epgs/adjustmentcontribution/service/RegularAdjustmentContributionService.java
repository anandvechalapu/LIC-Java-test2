package com.lic.epgs.adjustmentcontribution.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.adjustmentcontribution.repository.RegularAdjustmentContributionRepository;
import com.lic.epgs.adjustmentcontribution.model.RegularAdjustmentContribution;

@Service
public class RegularAdjustmentContributionService {

	@Autowired
	private RegularAdjustmentContributionRepository regularAdjustmentContributionRepository;
	
	/**
	 * This method is used to remove an adjustment contribution batch from the database.
	 * 
	 * @param batchId The id of the batch to be removed
	 * 
	 * @return A JSON response indicating the status and message of the transaction
	 */
	public Optional<Object> removeAdjustmentContributionBatch(Long batchId) {
		RegularAdjustmentContribution regularAdjustmentContribution = regularAdjustmentContributionRepository.findById(batchId).orElse(null);
        if (regularAdjustmentContribution != null) {
            regularAdjustmentContributionRepository.delete(regularAdjustmentContribution);
            return Optional.of("Adjustment Contribution Batch deleted successfully.");
        } else {
            return Optional.of("No adjustment contribution batch found with the given id.");
        }
	}
}