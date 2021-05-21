package exceptionHandel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	 public void giveNullMoodShouldThrowException(){
      MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.analyserMood();
	}}
