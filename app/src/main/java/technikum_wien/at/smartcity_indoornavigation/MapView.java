package technikum_wien.at.smartcity_indoornavigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import java.util.HashSet;
import java.util.Set;

import technikum_wien.at.smartcity_indoornavigation.Entities.GridPoint;

public class MapView extends View {

    Paint paint;
    Path path;

    public MapView(Context context) {
        super(context);
        init();
        //super.setBackgroundColor(Color.TRANSPARENT);
    }

    public MapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MapView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        GridPoint gp1 = new GridPoint("2", "20","30");
        GridPoint gp2 = new GridPoint("3", "20","70");
        /*GridPoint gp3 = new GridPoint("4", "100","70");
        GridPoint gp4 = new GridPoint("5", "100","300");
        GridPoint gp5 = new GridPoint("6", "700","300");
*/
        Set<GridPoint> gps = new HashSet<GridPoint>();
        gps.add(gp1);
        gps.add(gp2);




        path = new Path();

        for (GridPoint gp:gps) {
            path.lineTo(Integer.parseInt(gp.getPosX()),Integer.parseInt(gp.getPosY()));
        };

/*        path.lineTo(500, 500);
        path.lineTo(200, 500);
        path.lineTo(200, 300);
        path.lineTo(0, 0);
        path.lineTo(1, 300);
        path.lineTo(1, 550);
        path.lineTo(1180, 550);
        path.lineTo(1181, 560);*/


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);

    }

}