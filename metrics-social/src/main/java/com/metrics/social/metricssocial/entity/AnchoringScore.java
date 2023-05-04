package com.metrics.social.metricssocial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ANCHOR_SCORE", schema="public")
public class AnchoringScore {
		@Id
		@Column(name= "USER_ID")
		private String userId;
		
		@Column(name= "USER_NAME")
		private String userName;
	    
		@Column(name= "NAME")
	    private String name;
	    
		@Column(name= "ANCHORING")
	    private double anchoring;
	    
		@Column(name= "NORMALIZED")
	    private double normalized;
	    
		@Column(name= "INNOVATOR")
	    private double innovator;
	    
	    @Column(name= "DEALPRONE")
	    private double dealProne;
	    
	    @Column(name= "NOSTALGIA")
	    private double nostalgia;
	    
	    @Column(name= "DIGITAL_CHANNEL_AFFINITY")
	    private double digitalChannelAffinity;
	    
	    @Column(name= "PROMOTER_WOM")
	    private double promoterWOM;
	    
	    @Column(name= "IMMITATION")
	    private double immitation;

	    public AnchoringScore() {}
	    
		public AnchoringScore(String userId, String userName, String name, double anchoring, double normalized,
				double innovator, double dealProne, double nostalgia, double digitalChannelAffinity, double promoterWOM,
				double immitation) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.name = name;
			this.anchoring = anchoring;
			this.normalized = normalized;
			this.innovator = innovator;
			this.dealProne = dealProne;
			this.nostalgia = nostalgia;
			this.digitalChannelAffinity = digitalChannelAffinity;
			this.promoterWOM = promoterWOM;
			this.immitation = immitation;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getAnchoring() {
			return anchoring;
		}

		public void setAnchoring(double anchoring) {
			this.anchoring = anchoring;
		}

		public double getNormalized() {
			return normalized;
		}

		public void setNormalized(double normalized) {
			this.normalized = normalized;
		}

		public double getInnovator() {
			return innovator;
		}

		public void setInnovator(double innovator) {
			this.innovator = innovator;
		}

		public double getDealProne() {
			return dealProne;
		}

		public void setDealProne(double dealProne) {
			this.dealProne = dealProne;
		}

		public double getNostalgia() {
			return nostalgia;
		}

		public void setNostalgia(double nostalgia) {
			this.nostalgia = nostalgia;
		}

		public double getDigitalChannelAffinity() {
			return digitalChannelAffinity;
		}

		public void setDigitalChannelAffinity(double digitalChannelAffinity) {
			this.digitalChannelAffinity = digitalChannelAffinity;
		}

		public double getPromoterWOM() {
			return promoterWOM;
		}

		public void setPromoterWOM(double promoterWOM) {
			this.promoterWOM = promoterWOM;
		}

		public double getImmitation() {
			return immitation;
		}

		public void setImmitation(double immitation) {
			this.immitation = immitation;
		}
}
