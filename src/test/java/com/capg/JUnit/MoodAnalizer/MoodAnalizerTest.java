package com.capg.JUnit.MoodAnalizer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {
   
	private String Null;
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalizer myMood = new MoodAnalizer("I am in Sad Mood");
		String theMood = myMood.analizeMood();
		Assert.assertEquals("SAD", theMood);
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnSad() {
		MoodAnalizer myMood = new MoodAnalizer("I am in Happy Mood");
		String theMood = myMood.analizeMood();
		Assert.assertEquals("HAPPY", theMood);
	}
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalizer myMood = new MoodAnalizer(null);
		String theMood = myMood.analizeMood();
		Assert.assertEquals("HAPPY", theMood);
	}
	
}
