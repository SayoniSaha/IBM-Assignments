package model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class InternationalCD extends CD {

	private String language;

	public InternationalCD(String cdName, String language) {
		super(cdName);
		this.language = language;
	}
}
