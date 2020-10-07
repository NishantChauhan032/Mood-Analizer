package com.capg.JUnit.MoodAnalizer;

public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	ExceptionType type;

	MoodAnalysisException(ExceptionType type, String ss) {
		super(ss);
		this.type = type;
	}

}
