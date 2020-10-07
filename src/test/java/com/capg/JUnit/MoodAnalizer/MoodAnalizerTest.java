package com.capg.JUnit.MoodAnalizer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {

	private String Null;

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalizer myMood = new MoodAnalizer("I am in Sad Mood");
		String theMood = null;
		try {
			theMood = myMood.analizeMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", theMood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnSad() {
		MoodAnalizer myMood = new MoodAnalizer("I am in any Mood");
		String theMood = null;
		try {
			theMood = myMood.analizeMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", theMood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowException() {
		try {
			MoodAnalizer myMood = new MoodAnalizer(null);
			myMood.analizeMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
			Assert.assertEquals("Please Enter Proper Input", e.getMessage());
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowException() {
		try {
			MoodAnalizer myMood = new MoodAnalizer("");
			myMood.analizeMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
			Assert.assertEquals("Please Enter Proper Input", e.getMessage());
		}
	}
}