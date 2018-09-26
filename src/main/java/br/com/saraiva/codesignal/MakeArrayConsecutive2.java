package br.com.saraiva.codesignal;

import java.util.Arrays;

/**
 * Created by sara on set, 2018
 */
class MakeArrayConsecutive2 {

	int execute(int[] statues) {
		Arrays.sort(statues);
		return statues[statues.length - 1] - statues[0] + 1 - statues.length;
	}
}
