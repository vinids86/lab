package br.com.saraiva.codesignal;

/**
 * Created by sara on set, 2018
 */
class CheckPalindrome {

	boolean execute(String inputString) {
		StringBuilder reverse = new StringBuilder();
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverse.append(inputString.charAt(i));
		}
		return reverse.toString().equals(inputString);
	}
}
