package com.metrics.social.metricssocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metrics.social.metricssocial.entity.AnchoringScore;

@Repository
public interface AnchoringScoreRepository extends JpaRepository<AnchoringScore, String> {

}
