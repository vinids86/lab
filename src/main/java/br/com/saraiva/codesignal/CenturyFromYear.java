package br.com.saraiva.codesignal;

/**
 * Created by sara on set, 2018
 */
class CenturyFromYear {

	int centuryFromYear(int year) {
		return year % 100 == 0 ? year / 100 : year / 100 + 1;
	}
}
