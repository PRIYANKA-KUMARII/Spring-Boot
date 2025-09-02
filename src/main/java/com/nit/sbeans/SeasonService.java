package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class SeasonService {
	 public String getSeason(int month) {
	        if (month < 1 || month > 12) {
	            return "Invalid month! Please enter 1–12.";
	        }

	        return switch (month) {
	            case 12, 1, 2 -> "Winter";
	            case 3, 4, 5 -> "Spring";
	            case 6, 7, 8 -> "Summer";
	            case 9, 10, 11 -> "Autumn";
	            default -> "Invalid month! Please enter 1–12.";
	        };
	    }
	}