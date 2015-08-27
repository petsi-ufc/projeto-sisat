package br.ufc.petsi.enums;

public enum ConsultationState {
	CD("Cancelada"), SC("Agendada"), HD("Realizada");
	
	private String name;
	
	ConsultationState(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
