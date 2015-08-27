package br.ufc.petsi.dao;

import java.util.List;

import br.ufc.petsi.model.User;

public interface DAOUser {
	public List<User> getAll();
	public User getByCpf(String cpf);
}
