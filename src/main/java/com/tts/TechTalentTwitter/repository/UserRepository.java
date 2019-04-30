package com.tts.TechTalentTwitter.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tts.TechTalentTwitter.model.User;

@SpringBootApplication


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
