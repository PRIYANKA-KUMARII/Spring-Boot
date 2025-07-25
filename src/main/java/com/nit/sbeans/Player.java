package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("player")


public class Player {
	@Value("${player.id}")
	private Integer playerId;
	@Value("${player.name}")
	private String Name;
	@Value("${player.yearsNumber}")
	private int year;
	@Value("${player.teamName}")
	private String teamName;
	
	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", Name=" + Name + ", year=" + year + ", teamName=" + teamName + "]";
	}
	
	
	}
	
