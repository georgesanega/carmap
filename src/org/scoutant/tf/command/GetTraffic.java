package org.scoutant.tf.command;

import java.io.InputStream;

import org.scoutant.tf.model.LatLng;
import org.scoutant.tf.model.Pixel;
import org.scoutant.tf.model.Polyline;
import org.scoutant.tf.model.Road;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class GetTraffic extends HttpGetCommand {
	
	private static final String tag = "http";
	private Bitmap bitmap;

	@Override
	public void execute() {
		InputStream is = doGet ("http://www.bison-fute.equipement.gouv.fr/asteccli/servlet/clientleger?format=png&source0=cigt_grenoble&source1=cir&raster=grenoble");
		bitmap = BitmapFactory.decodeStream(is);
		Log.d(tag, "width : " + bitmap.getWidth() +", height : " + bitmap.getHeight());

		Log.d(tag, "orange : " + bitmap.getPixel(133, 149));
		Log.d(tag, "green  : " + bitmap.getPixel(88, 94));
		Log.d(tag, "red    : " + bitmap.getPixel(82, 106));
		Log.d(tag, "grey   : " + bitmap.getPixel(370, 144));

	
		Log.d(tag, "orange : " + bitmap.getPixel(143, 276));
		Log.d(tag, "green  : " + bitmap.getPixel(129, 384));
		Log.d(tag, "red    : " + bitmap.getPixel(238, 318));
		Log.d(tag, "grey   : " + bitmap.getPixel(290, 404));

//		public static final Polyline GrenobleSO = new Polyline("45.24109,5.85026|45.24071,5.84896|45.23975,5.84612|45.23887,5.84388|45.2382,5.84239|45.2373,5.84052|45.23626,5.83857|45.23483,5.8362|45.23322,5.83377|45.23145,5.83134|45.22989,5.82933|45.22624,5.82507|45.22442,5.82318|45.22295,5.82174|45.21997,5.81899|45.21814,5.81722|45.2169,5.81597|45.21573,5.81467|45.2147,5.81339|45.21367,5.81196|45.21244,5.81005|45.21152,5.80839|45.21064,5.80665|45.20959,5.80422|45.2092,5.8032|45.20818,5.80026|45.20738,5.79743|45.20605,5.79175|45.20546,5.78802|45.20542,5.78717|45.20581,5.78548|45.20586,5.78499|45.2058,5.7845|45.20571,5.78421|45.2054,5.78372|45.20512,5.78348|45.2019,5.7817|45.20187,5.78164|45.2002,5.78073|45.19986,5.7806|45.19918,5.78051|45.19859,5.78058|45.19775,5.78089|45.19599,5.78165|45.19548,5.78182|45.19466,5.78199|45.19368,5.78205|45.18955,5.78193|45.18745,5.78166|45.18628,5.78134|45.18515,5.7809|45.18456,5.78059|45.18315,5.77967|45.1822,5.77887|45.1813,5.77793|45.18056,5.77702|45.17958,5.77564|45.17868,5.77409|45.17666,5.77003|45.17551,5.76792|45.17477,5.76672|45.17395,5.76553|45.17341,5.76478|45.1726,5.76378|45.17113,5.76214|45.16993,5.76097|45.16642,5.75796|45.16473,5.75629|45.15705,5.74799|45.15621,5.74698|45.15554,5.74607|45.15459,5.74454|45.1534,5.74228|45.15261,5.74041|45.15178,5.73789|45.15136,5.73616|45.15094,5.73363|45.15075,5.73138|45.15072,5.72872|45.15087,5.72641|45.15115,5.72449|45.1519,5.72082|45.15219,5.71887|45.15237,5.7182|45.15273,5.71731|45.15295,5.7169|45.15335,5.71634|45.15499,5.71453|45.15595,5.71361|45.15659,5.71312|45.15727,5.71238|45.15785,5.71145|45.15806,5.71103|45.15837,5.7102|45.1586,5.70927|45.15872,5.70832|45.15875,5.70579|45.15868,5.70337|45.15884,5.70283|45.15956,5.70141");
		
		
		Road road = new Road( Road.ROCADE);
		road.add( new Pixel(367, 124 , 45.19859,5.78058));
		road.add( new Pixel( 369,159, 45.18745,5.78166));
		road.add( new Pixel( 357, 188, 45.18056,5.77702));
		road.add( new Pixel( 330, 222, 45.17341,5.76478));
		road.add( new Pixel( 293, 280, 45.15705,5.74799));
		
		for (Pixel pixel : road.pixels()) {
			int color = bitmap.getPixel(pixel.x, pixel.y);
			pixel.color = color;
			LatLng point = Polyline.GrenobleSO.point( pixel.lat, pixel.lng);
			if (point!=null) {
				point.color = color;
				Log.d(tag, "found : " + point);
			}
		}
	}

	public static int[][] ROCADE = { 
		{ 367, 124},
		{ 369,134 },
		{ 370,147 },
		{ 369,159 },
		{ 366, 170},
		{ 361,180 },
		{ 357, 188},
		{ 347, 200},
		{ 337, 211},
		{ 330, 222},
		{ 322, 234},
		{ 316, 245},
		{ 311, 250},
		{ 304, 263},
		{ 299, 272},
		{ 293, 280},
		{ 286, 289},
		{ 282, 295},
		{ 273, 302},
		{ 260, 311},
		{ 245, 316},
		{ 234, 318},
		{ 221, 319},
};	

}