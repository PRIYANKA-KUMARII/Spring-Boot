package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Launcher {
	private Rocket rocket;
	@Autowired
	public void setRocket(Rocket rocket) {
		this.rocket= rocket;
	}
	public void launcher() {
		 rocket.ignite("full");
	}
	

}
