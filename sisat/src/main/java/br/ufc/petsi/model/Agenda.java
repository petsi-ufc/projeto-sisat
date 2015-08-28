package br.ufc.petsi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "agenda" )
public class Agenda {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "agenda", targetEntity = Schedule.class, 
			cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Schedule> schedules;
	
	@OneToOne(targetEntity = User.class, 
			  cascade = { CascadeType.MERGE }, 
			  fetch = FetchType.EAGER)
	private User user;
}
