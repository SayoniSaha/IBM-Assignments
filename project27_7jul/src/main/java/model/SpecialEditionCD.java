package model;

import javax.persistence.Entity;

import lombok.Setter;

@Setter
@Entity

public class SpecialEditionCD extends CD {

	private String feature;
	
	public SpecialEditionCD(String cdName, String feature) {
		super(cdName);
		this.feature = feature;
	}

}
