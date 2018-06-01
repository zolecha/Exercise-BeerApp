package pl.exercise.model;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@Component
public class Beer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String tagline;
	private String first_brewed;
	private String description;
	private String image_url;
	private Double ibu;
	@Embedded
	private FoodPairing food_pairing;
//	private String [] food_pairing;

	public Beer() {
	}

	
	public FoodPairing getFood_pairing() {
		return food_pairing;
	}


	public void setFood_pairing(FoodPairing food_pairing) {
		this.food_pairing = food_pairing;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getFirst_brewed() {
		return first_brewed;
	}

	public void setFirst_brewed(String first_brewed) {
		this.first_brewed = first_brewed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getIbu() {
		return ibu;
	}


	public void setIbu(Double ibu) {
		this.ibu = ibu;
	}

	@Override
	public String toString() {
		return "Beer name: " + name;
	}


//	public String [] getFood_pairing() {
//		return food_pairing;
//	}
//
//	public void setFood_pairing(String[] food_pairing) {
//		this.food_pairing = food_pairing;
//	}

	
	
}
