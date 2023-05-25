package com.metrics.social.metricssocial.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrics.social.metricssocial.entity.AnchoringScore;
import com.metrics.social.metricssocial.service.AnchoringBusinessService;

@RestController
public class AnchoringScoreController {
		@Autowired
		private AnchoringBusinessService anchoringBusinessService;
		private static final String CSV_FILE_PATH= "C:\\Users\\Aparna\\Documents\\metrics@social\\anchoring-business-scores.csv";
		
		@GetMapping("/import-csv")
	    public ResponseEntity<Void> importCsv() {
	        	try {
					anchoringBusinessService.saveCsvDataToDb(CSV_FILE_PATH);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            return ResponseEntity.ok().build();
		}
		
		@GetMapping("/getCustomerData")
		public ResponseEntity<List<AnchoringScore>> getCustomerData() {
			ResponseEntity<List<AnchoringScore>> Data = anchoringBusinessService.getData();
			return Data;
		}
}
