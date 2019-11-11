package echelon.util;

import java.util.Random;

public class RankUtils {
	
	public Integer randomInt(Integer min, Integer max) {
		if(min == null) min = 0;
		if(max == null) max = 1;
		
		if(max < min) {
			int aux = min;
			min = max;
			max = aux;
		}
		
		Random r = new Random();
		return (r.nextInt(max - min) + 1) + min;
	}
	
}
