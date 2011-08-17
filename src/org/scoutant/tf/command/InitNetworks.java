package org.scoutant.tf.command;

import org.scoutant.tf.model.Country;
import org.scoutant.tf.model.Model;
import org.scoutant.tf.model.Network;
import org.scoutant.tf.model.Pixel;
import org.scoutant.tf.model.Road;

import android.util.Log;

public class InitNetworks implements Command {

	private static final String tag = "command";
	// TODO refactor to List<Network> to target mores cities...
	Country country = Model.model().country;

	@Override
	public void execute() {
		Log.d(tag, "***************************************************************************************");

		country.add( new Network("Grenoble")
			.add( new Road("GrenobleSO")
				.set( "45.24109,5.85026|45.24071,5.84896|45.23975,5.84612|45.23887,5.84388|45.2382,5.84239|45.2373,5.84052|45.23626,5.83857|45.23483,5.8362|45.23322,5.83377|45.23145,5.83134|45.22989,5.82933|45.22624,5.82507|45.22442,5.82318|45.22295,5.82174|45.21997,5.81899|45.21814,5.81722|45.2169,5.81597|45.21573,5.81467|45.2147,5.81339|45.21367,5.81196|45.21244,5.81005|45.21152,5.80839|45.21064,5.80665|45.20959,5.80422|45.2092,5.8032|45.20818,5.80026|45.20738,5.79743|45.20605,5.79175|45.20546,5.78802|45.20542,5.78717|45.20581,5.78548|45.20586,5.78499|45.2058,5.7845|45.20571,5.78421|45.2054,5.78372|45.20512,5.78348|45.2019,5.7817|45.20187,5.78164|45.2002,5.78073|45.19986,5.7806|45.19918,5.78051|45.19859,5.78058|45.19775,5.78089|45.19599,5.78165|45.19548,5.78182|45.19466,5.78199|45.19368,5.78205|45.18955,5.78193|45.18745,5.78166|45.18628,5.78134|45.18515,5.7809|45.18456,5.78059|45.18315,5.77967|45.1822,5.77887|45.1813,5.77793|45.18056,5.77702|45.17958,5.77564|45.17868,5.77409|45.17666,5.77003|45.17551,5.76792|45.17477,5.76672|45.17395,5.76553|45.17341,5.76478|45.1726,5.76378|45.17113,5.76214|45.16993,5.76097|45.16642,5.75796|45.16473,5.75629|45.15705,5.74799|45.15621,5.74698|45.15554,5.74607|45.15459,5.74454|45.1534,5.74228|45.15261,5.74041|45.15178,5.73789|45.15136,5.73616|45.15094,5.73363|45.15075,5.73138|45.15072,5.72872|45.15087,5.72641|45.15115,5.72449|45.1519,5.72082|45.15219,5.71887|45.15237,5.7182|45.15273,5.71731|45.15295,5.7169|45.15335,5.71634|45.15499,5.71453|45.15595,5.71361|45.15659,5.71312|45.15727,5.71238|45.15785,5.71145|45.15806,5.71103|45.15837,5.7102|45.1586,5.70927|45.15872,5.70832|45.15875,5.70579|45.15868,5.70337|45.15884,5.70283|45.15956,5.70141")
				.add( new Pixel(367, 124 , 45.19859,5.78058))
				.add( new Pixel( 370,140, 45.19599,5.78165))
				.add( new Pixel( 369,159, 45.18745,5.78166))
				.add( new Pixel( 357, 188, 45.18056,5.77702))
				.add( new Pixel( 341, 205, 45.17958,5.77564))
				.add( new Pixel( 330, 220, 45.17341,5.76478))
				.add( new Pixel( 293, 280, 45.15705,5.74799))
				.add( new Pixel( 274, 302, 45.15459,5.74454))
				.add( new Pixel( 254, 315, 45.15178,5.73789))
				.add( new Pixel( 228, 320, 45.15075,5.73138))
				.add( new Pixel( 200, 320, 45.1519,5.72082))
				.add( new Pixel( 180, 317, 45.15273,5.71731))
				.add( new Pixel( 154, 302, 45.15837,5.7102))
				.add( new Pixel( 143, 302, 45.15868,5.70337))
			)
			// TODO cut end of polyline...
			.add( new Road("GrenobleSE")
				.set( "45.15757,5.70092|45.15805,5.70221|45.15835,5.7028|45.15859,5.70383|45.15866,5.70508|45.15864,5.70817|45.15847,5.70949|45.1582,5.71047|45.15784,5.7113|45.15727,5.71215|45.15633,5.71307|45.15529,5.71395|45.15484,5.71442|45.15344,5.71599|45.1529,5.71672|45.15255,5.71733|45.15232,5.71785|45.15204,5.71883|45.15114,5.72364|45.15084,5.72559|45.15064,5.72825|45.15061,5.73067|45.15068,5.73198|45.15086,5.7338|45.15127,5.73623|45.15173,5.73818|45.1525,5.74058|45.15308,5.742|45.15369,5.74327|45.15426,5.74431|45.15536,5.74609|45.1561,5.74713|45.15764,5.74884|45.16016,5.75152|45.16218,5.75378|45.16544,5.75722|45.17091,5.76214|45.17163,5.76288|45.17335,5.76493|45.1744,5.76636|45.17582,5.76866|45.17867,5.77428|45.17948,5.7757|45.18034,5.77695|45.18144,5.77826|45.18218,5.77901|45.183,5.77971|45.18363,5.78019|45.1841,5.78048|45.18554,5.78122|45.18709,5.78172|45.18803,5.78192|45.18968,5.78209|45.19385,5.78215|45.19464,5.7821|45.19542,5.78197|45.19616,5.78176|45.19833,5.7808|45.19885,5.78068|45.19961,5.78071|45.20022,5.7809|45.20183,5.78177|45.20186,5.78183|45.20323,5.78272|45.20363,5.78306|45.2038,5.78327|45.20422,5.78408|45.2045,5.78509|45.20474,5.78617|45.20546,5.79006|45.20608,5.793|45.20715,5.79745|45.20763,5.7991|45.2087,5.80241|45.20885,5.80259|45.20957,5.80454|45.21058,5.80684|45.21204,5.80962|45.2131,5.81134|45.21398,5.81264|45.21528,5.81431|45.21651,5.81572|45.21827,5.81751|45.22184,5.8209|45.22429,5.82331|45.22726,5.82647|45.22897,5.82843|45.23039,5.83018|45.23245,5.83291|45.23479,5.83638|45.23586,5.83816|45.23728,5.84081|45.23837,5.84313|45.23921,5.84516|45.2397,5.84645|45.24054,5.84892|45.24315,5.85802")
				.add( new Pixel(154, 308 , 45.15757,5.70092))
				.add( new Pixel( 164, 306, 45.15864,5.70817))
				.add( new Pixel( 187, 321, 45.1529,5.71672))
				.add( new Pixel( 198, 324, 45.15204,5.71883))
			)
		);
		
		Log.d(tag, ""+country);
	}
}


