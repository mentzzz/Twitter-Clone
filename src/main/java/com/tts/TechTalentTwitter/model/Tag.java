package com.tts.TechTalentTwitter.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	public class Tag {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "tag_id")
	    @Getter
	    @Setter
	    private Long id;
	    @Getter
	    @Setter
	    private String phrase;
	    
	    @Getter
	    @Setter
	    @ManyToMany(mappedBy = "tags")
	    private List<Tweet> tweets;

}
