package com.java.StringTest;
import org.junit.Test;
import static org.junit.Assert.*;
import com.java.String.StringFirstNonRepeatedChar;

public class StringFirstNonRepeatedCharTest {

	@Test
	public void testgetFirstNonRepeatedChar(){
		assertEquals('b', StringFirstNonRepeatedChar.getFirstNonRepeatedCharOne("abcdefghija"));
		assertEquals('i', StringFirstNonRepeatedChar.getFirstNonRepeatedCharOne("simplest"));
	}
}
