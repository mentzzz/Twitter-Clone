package com.tts.TechTalentTwitter.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tts.TechTalentTwitter.model.Role;

@SpringBootApplication


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRole(String role);

}
