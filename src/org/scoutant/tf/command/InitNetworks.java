package org.scoutant.tf.command;

import org.scoutant.tf.model.Country;
import org.scoutant.tf.model.Model;
import org.scoutant.tf.model.Network;
import org.scoutant.tf.model.Pixel;
import org.scoutant.tf.model.Road;

import android.util.Log;

/**
 * During dev may use http://blog.scoutant.org/assets/markers.html
 *
 */
public class InitNetworks implements Command {
	private static final String tag = "command";
	Country country = Model.model().country;

	@Override
	public void execute() {
		Log.d(tag, "***************************************************************************************");

		country.add( new Network("Grenoble")
			.add( new Road("GrenobleSO")
				.set( "45.20512,5.78348|45.2019,5.7817|45.20187,5.78164|45.2002,5.78073|45.19986,5.7806|45.19918,5.78051|45.19859,5.78058|45.19775,5.78089|45.19599,5.78165|45.19548,5.78182|45.19466,5.78199|45.19368,5.78205|45.18955,5.78193|45.18745,5.78166|45.18628,5.78134|45.18515,5.7809|45.18456,5.78059|45.18315,5.77967|45.1822,5.77887|45.1813,5.77793|45.18056,5.77702|45.17958,5.77564|45.17868,5.77409|45.17666,5.77003|45.17551,5.76792|45.17477,5.76672|45.17395,5.76553|45.17341,5.76478|45.1726,5.76378|45.17113,5.76214|45.16993,5.76097|45.16642,5.75796|45.16473,5.75629|45.15705,5.74799|45.15621,5.74698|45.15554,5.74607|45.15459,5.74454|45.1534,5.74228|45.15261,5.74041|45.15178,5.73789|45.15136,5.73616|45.15094,5.73363|45.15075,5.73138|45.15072,5.72872|45.15087,5.72641|45.15115,5.72449|45.1519,5.72082|45.15219,5.71887|45.15237,5.7182|45.15273,5.71731|45.15295,5.7169|45.15335,5.71634|45.15499,5.71453|45.15595,5.71361|45.15659,5.71312|45.15727,5.71238|45.15785,5.71145|45.15806,5.71103|45.15837,5.7102|45.1586,5.70927|45.15872,5.70832|45.15875,5.70579|45.15868,5.70337|45.15884,5.70283|45.15956,5.70141")
				.add( new Pixel( 370, 140, 45.20187,5.78164))
				.add( new Pixel( 369, 159, 45.18745,5.78166))
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
			)
			.add( new Road("GrenobleSE")
				.set( "45.15757,5.70092|45.15805,5.70221|45.15835,5.7028|45.15859,5.70383|45.15866,5.70508|45.15864,5.70817|45.15847,5.70949|45.1582,5.71047|45.15784,5.7113|45.15727,5.71215|45.15633,5.71307|45.15529,5.71395|45.15484,5.71442|45.15344,5.71599|45.1529,5.71672|45.15255,5.71733|45.15232,5.71785|45.15204,5.71883|45.15114,5.72364|45.15084,5.72559|45.15064,5.72825|45.15061,5.73067|45.15068,5.73198|45.15086,5.7338|45.15127,5.73623|45.15173,5.73818|45.1525,5.74058|45.15308,5.742|45.15369,5.74327|45.15426,5.74431|45.15536,5.74609|45.1561,5.74713|45.15764,5.74884|45.16016,5.75152|45.16218,5.75378|45.16544,5.75722|45.17091,5.76214|45.17163,5.76288|45.17335,5.76493|45.1744,5.76636|45.17582,5.76866|45.17867,5.77428|45.17948,5.7757|45.18034,5.77695|45.18144,5.77826|45.18218,5.77901|45.183,5.77971|45.18363,5.78019|45.1841,5.78048|45.18554,5.78122|45.18709,5.78172|45.18803,5.78192|45.18968,5.78209|45.19385,5.78215|45.19464,5.7821|45.19542,5.78197|45.19616,5.78176|45.19833,5.7808|45.19885,5.78068|45.19961,5.78071|45.20022,5.7809|45.20183,5.78177|45.20186,5.78183|45.20323,5.78272|45.20363,5.78306|45.2038,5.78327|45.20422,5.78408")
				.add( new Pixel(154, 308 , 45.15757,5.70092))
				.add( new Pixel( 164, 306, 45.15864,5.70817))
				.add( new Pixel( 187, 321, 45.1529,5.71672))
				.add( new Pixel( 198, 324, 45.15204,5.71883))
				.add( new Pixel(231, 325, 45.15064,5.72825))
				.add( new Pixel(248, 322, 45.15127,5.73623))
				.add( new Pixel(270, 312, 45.15536,5.74609))
				.add( new Pixel(290, 296, 45.16016,5.75152))
				.add( new Pixel(303, 279, 45.16544,5.75722))
				.add( new Pixel(320, 248, 45.17163,5.76288))
				.add( new Pixel(346, 209, 45.17867,5.77428))
				.add( new Pixel(366, 186, 45.1841,5.78048))
				.add( new Pixel(374, 166, 45.18968,5.78209))
				.add( new Pixel(376, 142, 45.19542,5.78197))
				.add( new Pixel(372, 122, 45.20422,5.78408))
			)
			.add( new Road("A480S")
				.set( "45.23864,5.66103|45.23695,5.662|45.2327,5.66417|45.23135,5.66497|45.22961,5.66612|45.22257,5.67134|45.22123,5.67238|45.22001,5.67345|45.21852,5.67513|45.21773,5.67633|45.21688,5.67785|45.2148,5.68195|45.21426,5.68283|45.21379,5.68343|45.21303,5.68416|45.21216,5.68474|45.20949,5.68606|45.20863,5.68657|45.20768,5.68728|45.20708,5.68786|45.20656,5.68844|45.2056,5.68971|45.19853,5.69983|45.19789,5.70067|45.19728,5.70131|45.19664,5.70182|45.1961,5.70216|45.19513,5.70258|45.19439,5.70275|45.19373,5.70282|45.19243,5.70282|45.18749,5.70253|45.18096,5.70239|45.1785,5.70229|45.17584,5.70211|45.16318,5.70155|45.16082,5.70149|45.15956,5.70141|45.15914,5.70133|45.15866,5.70116|45.15818,5.70091|45.15652,5.69972|45.15558,5.69918|45.14173,5.69259|45.13903,5.69133|45.13815,5.691|45.13733,5.69074|45.13633,5.6905|45.1338,5.69005|45.13303,5.69|45.13233,5.69002|45.13147,5.69018|45.1295,5.69081|45.12884,5.69097|45.12838,5.69102|45.12754,5.69101|45.12719,5.69094|45.12604,5.69051|45.12348,5.68906|45.11934,5.68633|45.11484,5.68344|45.11389,5.68291|45.11193,5.68201|45.11136,5.68167|45.11056,5.68109|45.10858,5.6793|45.1076,5.6786|45.09996,5.67464|45.09915,5.67407|45.09872,5.67371|45.09697,5.67193|45.09638,5.6714|45.09548,5.67075|45.09443,5.67018|45.09395,5.67|45.09165,5.66922|45.09054,5.66891|45.0901,5.66888")
				.add( new Pixel( 30, 31, 45.23864,5.66103))
				.add( new Pixel( 45, 56, 45.22961,5.66612))
				.add( new Pixel( 56, 72, 45.22001,5.67345))
				.add( new Pixel( 70, 92, 45.21688,5.67785))
				.add( new Pixel( 96, 122, 45.2056,5.68971))
				.add( new Pixel(134, 152, 45.19789,5.70067))
				.add( new Pixel( 144, 163, 45.19243,5.70282))
				.add( new Pixel(142, 292, 45.16082,5.70149))
				.add( new Pixel(144, 303, 45.15866,5.70116))
				.add( new Pixel(124, 354, 45.14173,5.69259))
				.add( new Pixel(122, 371, 45.13633,5.6905))
				.add( new Pixel(121, 389, 45.12604,5.69051))
				.add( new Pixel(117, 406, 45.11934,5.68633))
				.add( new Pixel(101, 436, 45.09395,5.67))
				.add( new Pixel(98, 446, 45.0901,5.66888))
			)
			.add( new Road("A480N")
				.set( "45.09041,5.66918|45.09114,5.66933|45.09354,5.67009|45.09444,5.67043|45.09518,5.67081|45.0964,5.67169|45.0986,5.6739|45.09955,5.67464|45.10131,5.67563|45.10741,5.67876|45.10814,5.67924|45.11037,5.6812|45.11104,5.6817|45.11172,5.6821|45.11395,5.68311|45.11455,5.68346|45.11872,5.68614|45.12206,5.68846|45.12285,5.68894|45.1258,5.69051|45.12657,5.69086|45.12721,5.69105|45.12861,5.69115|45.12933,5.691|45.13097,5.69047|45.13176,5.69028|45.13279,5.69019|45.13387,5.69028|45.13777,5.691|45.1393,5.69161|45.1415,5.69263|45.15512,5.69911|45.15629,5.69971|45.15822,5.70109|45.15894,5.70143|45.1594,5.70154|45.16022,5.70161|45.17637,5.70226|45.18013,5.70251|45.18856,5.70275|45.19237,5.70297|45.19372,5.70297|45.19457,5.70287|45.19516,5.70273|45.19616,5.70232|45.19696,5.70179|45.19797,5.7008|45.20567,5.68982|45.20662,5.68856|45.20714,5.68799|45.20767,5.68747|45.20868,5.6867|45.2102,5.68586|45.2122,5.68488|45.21311,5.68429|45.21389,5.68353|45.21434,5.68294|45.21488,5.68206|45.21679,5.67823|45.21786,5.67636|45.21883,5.67503|45.21948,5.67425|45.22056,5.67319|45.2227,5.67149|45.23033,5.6659|45.23154,5.66512|45.23349,5.66399|45.23669,5.66237|45.23794,5.66167")
				.add( new Pixel( 104, 458, 45.09041,5.66918))
				.add( new Pixel( 105, 444, 45.0964,5.67169))
				.add( new Pixel( 114, 426, 45.10741,5.67876))
				.add( new Pixel( 124, 408, 45.1258,5.69051))
				.add( new Pixel( 128, 396, 45.12861,5.69115))
				.add( new Pixel( 128, 368, 45.13387,5.69028))
				.add( new Pixel( 131, 354, 45.1393,5.69161))
				.add( new Pixel( 142, 324, 45.15512,5.69911))
				.add( new Pixel( 150, 306, 45.15894,5.70143))
				.add( new Pixel( 148, 244, 45.17637,5.70226))
				.add( new Pixel( 152, 170, 45.19237,5.70297))
				.add( new Pixel( 150, 158, 45.19797,5.7008))
				.add( new Pixel( 110, 124, 45.20567,5.68982))
				.add( new Pixel(  89, 105, 45.2122,5.68488))
				.add( new Pixel(  69,  82, 45.21786,5.67636))
				.add( new Pixel(  52,  57, 45.23033,5.6659))
				.add( new Pixel(  36,  29, 45.23794,5.66167))
			)
			.add( new Road("GrenobleBastilleE")
				.set( "45.21244,5.68565|45.21204,5.68708|45.21154,5.68946|45.21092,5.69346|45.2106,5.69518|45.21023,5.69687|45.20964,5.69893|45.20906,5.70062|45.20607,5.70806|45.20523,5.71056|45.20483,5.71138|45.20435,5.71206|45.20184,5.71525|45.20115,5.71587|45.20081,5.71609|45.20023,5.71634|45.19984,5.71641|45.19951,5.71641|45.19873,5.71629|45.19721,5.71586|45.19652,5.71586|45.19577,5.71607|45.19509,5.71645|45.19454,5.71688|45.19405,5.71752|45.19384,5.71799")
				.add( new Pixel( 88, 98, 45.21244,5.68565))
				.add( new Pixel( 101, 93, 45.2106,5.69518))
				.add( new Pixel( 119, 102, 45.20964,5.69893))
				.add( new Pixel( 140, 109, 45.20607,5.70806))
				.add( new Pixel( 160, 113, 45.20184,5.71525))
				.add( new Pixel( 174, 120, 45.19951,5.71641))
				.add( new Pixel( 182, 138, 45.19577,5.71607))
				.add( new Pixel( 185, 151, 45.19384,5.71799))
			)
			.add( new Road("GrenobleBastilleO")
				.set( "45.19401,5.71788|45.19412,5.71756|45.19449,5.71705|45.19473,5.71681|45.19546,5.71631|45.19616,5.71604|45.19671,5.71596|45.1972,5.71598|45.19871,5.71643|45.19952,5.71658|45.20026,5.71651|45.20049,5.71644|45.20102,5.71617|45.20148,5.71582|45.20213,5.71516|45.20443,5.71218|45.20491,5.71148|45.20532,5.71064|45.20635,5.70765|45.20915,5.70069|45.21022,5.69766|45.211,5.6949|45.21232,5.68886|45.21292,5.68688|45.21346,5.68546")
				.add( new Pixel( 191, 154, 45.19401,5.71788))
				.add( new Pixel( 183, 148, 45.19546,5.71631))
				.add( new Pixel( 180, 130, 45.19871,5.71643))
				.add( new Pixel( 172, 119, 45.20102,5.71617))
				.add( new Pixel( 161, 112, 45.20532,5.71064))
				.add( new Pixel( 143, 110, 45.20915,5.70069))
				.add( new Pixel( 110, 96, 45.211,5.6949))
				.add( new Pixel( 82, 92, 45.21346,5.68546))
				.set( "45.19401,5.71788|45.19412,5.71756|45.19449,5.71705|45.19473,5.71681|45.19546,5.71631|45.19616,5.71604|45.19671,5.71596|45.1972,5.71598|45.19871,5.71643|45.19952,5.71658|45.20026,5.71651|45.20049,5.71644|45.20102,5.71617|45.20148,5.71582|45.20213,5.71516|45.20443,5.71218|45.20491,5.71148|45.20532,5.71064|45.20635,5.70765|45.20915,5.70069|45.21022,5.69766|45.211,5.6949|45.21232,5.68886|45.21292,5.68688|45.21346,5.68546")
			)
		);

		Log.d(tag, ""+country);
	}
}


