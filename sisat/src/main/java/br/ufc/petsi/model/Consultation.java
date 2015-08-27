package br.ufc.petsi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.ufc.petsi.enums.ConsultationState;

@Entity
@Table( name = "consultation" )
public class Consultation {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(targetEntity = Service.class, 
			  cascade = { CascadeType.MERGE }, 
			  fetch = FetchType.EAGER )
	@JoinColumn( name = "id_service" )
	private Service service;
	
	@Enumerated( EnumType.STRING )
	private ConsultationState state;
	
	@OneToOne(targetEntity = Schedule.class, 
			  cascade = { CascadeType.MERGE }, 
			  fetch = FetchType.EAGER )
	@JoinColumn( name = "id_schedule" )
	private Schedule schedule;
}
