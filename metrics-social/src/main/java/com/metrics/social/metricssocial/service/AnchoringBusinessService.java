package com.metrics.social.metricssocial.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	            System.out.println(rows);
	            for (String[] row : rows) {
	            	AnchoringScore anchoringScore = new AnchoringScore();
	            	anchoringScore.setName(row[0]);
	            	anchoringScore.setAnchoring(Double.parseDouble(row[1]));
	            	anchoringScore.setNormalized(Double.parseDouble(row[2]));
	            	anchoringScore.setInnovator(Double.parseDouble(row[2]));
	            	anchoringScore.setDealProne(Double.parseDouble(row[2]));
	            	anchoringScore.setNostalgia(Double.parseDouble(row[2]));
	            	anchoringScore.setDigitalChannelAffinity(Double.parseDouble(row[2]));
	            	anchoringScore.setPromoterWOM(Double.parseDouble(row[2]));
	            	anchoringScore.setImmitation(Double.parseDouble(row[2]));
	            	anchoringScoreRepository.save(anchoringScore);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
