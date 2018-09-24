package br.com.saraiva.codesignal;

/**
 * Created by sara on set, 2018
 */
class ShapeArea {

	int execute(int n) {
		int area = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0)
				area += 1;
			else
				area += i * 4;
		}
		return area;
	}
}
