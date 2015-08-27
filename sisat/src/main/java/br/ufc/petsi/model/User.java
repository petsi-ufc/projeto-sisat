package br.ufc.petsi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "users" )
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String login;
	
	@NotNull
	private String password;
	
	@NotNull
	private String email;
	
	@ManyToMany
	@JoinTable( name = "user_role", 
				joinColumns = @JoinColumn( name = "user_id" ), 
				inverseJoinColumns = @JoinColumn( name = "role_id" ) )
	private List<Role> roles;

	public User() {

	}
	
	public User(Long id, String login, String password, String email, List<Role> roles) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.email = email;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
