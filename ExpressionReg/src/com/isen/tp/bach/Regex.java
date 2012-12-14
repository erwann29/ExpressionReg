/**
 * 13 nov. 2012 16:42:33 
 */
package com.isen.tp.bach;

import java.io.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author isen
 * 
 */
public class Regex {

	//private final int test = 5;

	/**
	 * @param RegEx
	 *            Fonction RegEx
	 */
	public final boolean readRegEx(final String filename, final String expReg) {
		final String fichier = filename;

		// lecture du fichier texte
		try {
			final InputStream ips = new FileInputStream(fichier);
			final InputStreamReader ipsr = new InputStreamReader(ips);
			final BufferedReader buffr = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = buffr.readLine()) != null) {

				final Pattern patt = Pattern.compile(expReg);
				final Matcher match = patt.matcher(ligne);
				final boolean result = match.matches();

				Logger.getLogger("Valeur de result : " + result);
				if (result) {
					Logger.getLogger(ligne + "\n");

				} else {
					Logger.getLogger("RegEx doesn't match with the line \n");

				}

			}

			buffr.close();
		} catch (Exception e) {
			Logger.getLogger(e.toString());
		}
		return true;

	}

}
