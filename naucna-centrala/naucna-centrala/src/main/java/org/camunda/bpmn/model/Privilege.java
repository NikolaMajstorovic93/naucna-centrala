package org.camunda.bpmn.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Privilege implements GrantedAuthority{
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "name")
    private String name;
 
    @ManyToMany(mappedBy = "privileges", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Role> roles;
    
	public Long getId() {
		return id;
	}
    
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public String getAuthority() {
		return name;
	}

//	@Override
//	public String getAuthority() {
//		return name;
//	}
}
