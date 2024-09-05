package com.NFL.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="player")
public class Player {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int player_id;
	
	@Column(name="team_id")
	private int team_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	
}
