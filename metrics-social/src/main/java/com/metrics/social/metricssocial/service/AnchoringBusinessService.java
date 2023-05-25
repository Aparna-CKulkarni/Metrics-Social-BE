package com.metrics.social.metricssocial.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.metrics.social.metricssocial.entity.AnchoringScore;
import com.metrics.social.metricssocial.repository.AnchoringScoreRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Service
public class AnchoringBusinessService {
	    @Autowired
	    private AnchoringScoreRepository anchoringScoreRepository;

	    public void saveCsvDataToDb(String file) throws IOException{
	        try {
	        	FileReader filereader = new FileReader(file);
	        	CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
	            List<String[]> rows = csvReader.readAll();
	
	            for (String[] row : rows) {
	            	AnchoringScore anchoringScore = new AnchoringScore();
	            	anchoringScore.setUserId(row[0]);
	            	anchoringScore.setUserName(row[0]);
	            	anchoringScore.setName(row[0]);
	            	anchoringScore.setAnchoring(Double.parseDouble(row[1]));
	            	anchoringScore.setNormalized(Double.parseDouble(row[2]));
	            	anchoringScore.setInnovator(Double.parseDouble(row[3]));
	            	anchoringScore.setDealProne(Double.parseDouble(row[4]));
	            	anchoringScore.setNostalgia(Double.parseDouble(row[5]));
	            	anchoringScore.setDigitalChannelAffinity(Double.parseDouble(row[6]));
	            	anchoringScore.setPromoterWOM(Double.parseDouble(row[7]));
	            	anchoringScore.setImmitation(Double.parseDouble(row[8]));
	            	anchoringScoreRepository.save(anchoringScore);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
		public ResponseEntity<List<AnchoringScore>> getData() {
			return new ResponseEntity<List<AnchoringScore>>(anchoringScoreRepository.findAll(), HttpStatus.OK);
		}
}
