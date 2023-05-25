package com.metrics.social.metricssocial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="anchor_score", schema="public")
public class AnchoringScore {
		@Id
		@Column(name= "user_id")
		private String userId;
		
		@Column(name= "user_name")
		private String userName;
	    
		@Column(name= "name")
	    private String name;
	    
		@Column(name= "anchoring")
	    private double anchoring;
	    
		@Column(name= "normalized")
	    private double normalized;
	    
		@Column(name= "innovator")
	    private double innovator;
	    
	    @Column(name= "dealprone")
	    private double dealProne;
	    
	    @Column(name= "nostalgia")
	    private double nostalgia;
	    
	    @Column(name= "digital_channel_affinity")
	    private double digitalChannelAffinity;
	    
	    @Column(name= "promoter_wom")
	    private double promoterWOM;
	    
	    @Column(name= "immitation")
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
