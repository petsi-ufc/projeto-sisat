package br.ufc.petsi.dao;

import java.util.List;

import br.ufc.petsi.model.User;

public interface UserDAO {
	public List<User> getAll();
	public User getByCpf(String cpf);
}
