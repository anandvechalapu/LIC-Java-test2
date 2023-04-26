package com.lic.epgs.adjustmentcontribution.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.adjustmentcontribution.service.RegularAdjustmentContributionService;

@RestController
@RequestMapping("/api/v1/adjustment-contribution")
public class RegularAdjustmentContributionController {
	
	@Autowired
	private RegularAdjustmentContributionService regularAdjustmentContributionService;
	
	@DeleteMapping("/remove/{batchId}")
	public Optional<Object> removeAdjustmentContributionBatch(@PathVariable Long batchId) {
		return regularAdjustmentContributionService.removeAdjustmentContributionBatch(batchId);
	}

}