package br.ufc.petsi.dao.ldap;

import java.util.List;

import javax.inject.Inject;

import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;

import br.ufc.petsi.dao.DAOUser;
import br.ufc.petsi.model.User;

public class LdapUser implements DAOUser {

	@Inject
	private LdapTemplate ldapTemplate;
	
	@Inject
	private String base;
	
	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public User getByCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	public LdapTemplate getLdapTemplate() {
		return ldapTemplate;
	}

	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	
	
}
