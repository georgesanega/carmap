package org.scoutant.tf.overlay;

import org.scoutant.tf.model.LatLng;
import org.scoutant.tf.model.Model;
import org.scoutant.tf.model.Polyline;
import org.scoutant.tf.util.MapUtils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.Projection;

public class TrafficOverlay extends Overlay {
	
	public static final int green = Color.rgb( 51, 187, 0);
	private static final String tag = "overlay";

	private Paint paint = new Paint();

	public TrafficOverlay() {
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(5.5f);
		paint.setColor( Color.MAGENTA);
	}
	
	private void drawTracks(Canvas canvas, MapView map) {
		Polyline track = Model.model().polyline;
		if (track==null || track.size()==0) return;
		Projection pj = map.getProjection();
		Rect viewRect = MapUtils.toRectx2(map);
		Point last = null;
		Point lastNormal=null;
		int q=0;
		
		for (LatLng f : track.points()) {
			boolean visible = viewRect.contains(f.getLongitudeE6(), f.getLatitudeE6());
			if (visible) {
				Point p = new Point();
				pj.toPixels(f, p);
				if (last!=null) {
					Point o = MapUtils.offset(lastNormal, p, 6);
					if (o!=null) {
						lastNormal = new Point(p);
						p.offset(o.x, o.y);
//						paint.setColor( q%2==0 ? green : Color.RED);
						paint.setColor( green);
						q++;
						canvas.drawLine(last.x, last.y, p.x, p.y, paint);
						last = p;
					}
				} else {
					lastNormal = new Point(p);
					last = p;
				}
			}
		}
	}
	
	@Override
	public void draw(Canvas canvas, MapView mapView, boolean shadow) {
		if (shadow) return;
		drawTracks(canvas, mapView);
		super.draw(canvas, mapView, shadow);
	}
	
	@Override
	public boolean onTap(GeoPoint p, MapView mapView) {
		mapView.getController().zoomIn();
		return super.onTap(p, mapView);
	}
}
