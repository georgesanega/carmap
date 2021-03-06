package org.scoutant.tf.util;

import android.graphics.Color;
import android.graphics.Paint;

public class ColorUtil {
	
//	public static final int GREEN = Color.rgb(0, 206, 0); // ZT Green // 00CE00
	public static final int GREEN = Color.rgb(0, 180, 0);
	public static final int ORANGE = Color.rgb( 253, 129, 38); // FD8126
	public static final int RED = Color.RED; 
	public static final int GRAY = Color.rgb( 192, 192, 192);
	
	// if color negative number?
	public static int color(int color) {
		float r = Color.red(color)+1;
		float g = Color.green(color)+1;
		float b = Color.blue(color)+1;
		if (2*g>=3*r && g/b>=2) return GREEN;
		if (r/g>4 && r/b>4) return RED;
		if (r/b>=3 && g/b>=2 && r>g*1.2) return ORANGE;
		// at Sytadin, yellow stands for 'works', lets consider green
		if (r>150 && g>150 && b<50) return GREEN;		
		if (r/b>0.8 && r/b<1.3 && g/b>0.8 && g/b<1.3) return GRAY;
//		Log.e(tag, "Warn : nok color extraction for: " + color + ". r : " + r +", g : " +g +", b : " + b);
		return Color.BLACK;
	}
	
	public static String toRGB(int color) {
		return "[" + Color.red(color) + " | " +  Color.green(color) + " | " +  Color.blue(color) +  "]";
	}

	public static String toRGB(Paint paint) {
		if (paint==null) return "null";
		return toRGB(paint.getColor());
	}
}

//public static final int GREEN2 = Color.rgb(51, 187, 0); // Google green // 33BB00
// Color.rgb( 158, 11, 11); // Red used by Google
