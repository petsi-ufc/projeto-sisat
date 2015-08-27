package br.ufc.petsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "rating")
public class Rating {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String comment;
	
	public Rating() {
		
	}

	public Rating(Long id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
