package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wf")
public class WeekDayFinder {
	@Autowired
	private LocalDate date;
	public WeekDayFinder() {
		System.out.println("WeekDayFinder::0-param constructor");
	
	} 
	public  String showGreestMessage(String name) {
		 System.out.println("WeekDayFinder.showGreestMessage()");
		 int week= date.getDayOfWeek().getValue();
		 if(week!=6 && week!=7)
			 return "Happy Working Day, Working is Worshiping::"+name;
		 else
			 return "Happy Weekend , Enjoy your Paid Holiday"+name;

}
}
