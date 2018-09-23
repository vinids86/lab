package br.com.saraiva.codesignal;

/**
 * Created by sara on set, 2018
 */
class AdjacentElementsProduct {

	int execute(int[] inputArray) {
		int bigger = inputArray[0] * inputArray[1];
		for (int i = 1; i < inputArray.length - 1; i++) {
			final int adjacent = inputArray[i] * inputArray[i + 1];
			if (adjacent > bigger) {
				bigger = adjacent;
			}
		}
		return bigger;
	}
}
