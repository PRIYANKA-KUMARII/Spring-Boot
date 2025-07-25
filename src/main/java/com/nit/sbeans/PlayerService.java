package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService {
	private final Player player;
	@Autowired
	public PlayerService(Player player) {
		 this.player=player;
	}

	public void displayPlayerInfo() {
		 System.out.println("Player Information");
		 System.out.println("Id:" +player.getPlayerId());
		 System.out.println("Name:"+player.getName());
		 System.out.println("YearsNumber :"+player.getYear());
		 System.out.println("TeamName:"+player.getName());
		 
	}
}
