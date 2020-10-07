package com.capg.JUnit.MoodAnalizer;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;

public class MoodAnalizerTest {
	static MoodAnalizer theMood = null ;
   
	@BeforeClass
	public static void setUp() {
		theMood = new MoodAnalizer();
	}
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String myMood = theMood.analizeMood("I am in sad Mood");
		Assert.assertEquals("SAD", myMood);
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnSad() {
		String myMood = theMood.analizeMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", myMood);
	}
}
