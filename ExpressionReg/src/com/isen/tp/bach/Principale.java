/**
 * 13 nov. 2012 16:56:06 
 */
package com.isen.tp.bach;

/**
 * @author isen
 * 
 */
public class Principale {

	/**
	 * @param args
	 *            isen 13 nov. 2012
	 *   Classe principale, Lis le contenu d'un fichier ligne par ligne
	 *   et vérifie si la ligne match l'expression réguliére passée en paramétre.
	 *   
	 */

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		Regex file = new Regex();
		file.readRegEx("test.txt","\"*.*\"");
	}

}
