/**
 * 15 nov. 2012 15:06:16 
 */
package com.isen.tp.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.isen.tp.bach.Regex;

/**
 * @author isen
 *
 */
public class RegexTest {

	/**
	 * Test method for {@link com.isen.tp.bach.Regex#ReadRegEx(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testReadRegEx() {
		Regex test1 = new Regex();
		
		 Assert.assertTrue(test1.readRegEx("test.txt", "\"*.*\""));
		
	}

}
