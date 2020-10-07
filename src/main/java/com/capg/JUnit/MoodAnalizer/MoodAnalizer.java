package com.capg.JUnit.MoodAnalizer;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalizer {
	String message;
	
	public MoodAnalizer() {
		
	}
	public MoodAnalizer(String message) {
		this.message=message;
	}
	private static Logger LOG = LogManager.getLogger(MoodAnalizer.class);
	public String analizeMood() {
		try {
		if (message.contains("sad")||message.contains("SAD")||message.contains("Sad")) 
			return "SAD";
		 else 
			return "HAPPY";
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Please enter your mood:");
        String message = sc.nextLine();
        MoodAnalizer mood = new MoodAnalizer(message);
		LOG.info(mood.analizeMood());
	}
}
