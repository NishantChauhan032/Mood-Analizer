package com.capg.JUnit.MoodAnalizer;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalizer {
	
	private static Logger LOG = LogManager.getLogger(MoodAnalizer.class);
	public String analizeMood(String message) {
		if (message.contains("sad")||message.contains("SAD")||message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MoodAnalizer mood = new MoodAnalizer();
		LOG.info("Please enter your mood:");
        String message = sc.nextLine();
		LOG.info(mood.analizeMood(message));
	}
}
