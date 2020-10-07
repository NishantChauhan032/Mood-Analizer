package com.capg.JUnit.MoodAnalizer;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.capg.JUnit.MoodAnalizer.MoodAnalysisException.ExceptionType;

public class MoodAnalizer {
	String message;

	public MoodAnalizer() {

	}

	public MoodAnalizer(String message) {
		this.message = message;
	}

	private static Logger LOG = LogManager.getLogger(MoodAnalizer.class);

	public String analizeMood() throws MoodAnalysisException {
		try {
			if (message.contains("sad") || message.contains("SAD") || message.contains("Sad")) {
				return "SAD";
			} else if (message.length() == 0) {
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "Please Enter Proper Input");
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "Please Enter Proper Input");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Please enter your mood:");
		String message = sc.nextLine();
		MoodAnalizer mood = new MoodAnalizer(message);
		try {
			LOG.info(mood.analizeMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
