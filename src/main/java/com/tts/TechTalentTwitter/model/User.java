package com.tts.TechTalentTwitter.model;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SpringBootApplication


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	@Getter
	@Setter
	private Long id;

	@Email(message = "Please provide a valid email")
	@NotEmpty(message = "Please provide an email")
	@Getter
	@Setter
	private String email;
	
	@Length(min = 3, message = "Your username must have at least 3 characters")
	@Length(max = 15, message = "Your username cannot have more than 15 characters")
	@Pattern(regexp="[^\\s]", message="Your username cannot contain spaces")
	@Getter
	@Setter
	private String username;
	
	@Length(min = 5, message = "Your password must have at least 5 characters")
	@Getter
	@Setter
	private String password;
	
	@NotEmpty(message = "Please provide your first name")
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	@NotEmpty(message = "Please provide your last name")
	private String lastName;
	
	
	private int active;

	@CreationTimestamp 
	@Getter
	@Setter
	private Date createdAt;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), 
	    inverseJoinColumns = @JoinColumn(name = "role_id"))

	public void setRoles(HashSet<com.tts.TechTalentTwitter.model.Role> hashSet) {
		HashSet<Role> roles;
		
	}

}




