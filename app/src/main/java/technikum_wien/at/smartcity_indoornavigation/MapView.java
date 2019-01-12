package technikum_wien.at.smartcity_indoornavigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedList;
import java.util.List;

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
        paint.setStrokeWidth(6);
        paint.setStyle(Paint.Style.STROKE);
        GridPoint gp1 = new GridPoint("2", "200","200");
        GridPoint gp2 = new GridPoint("3", "700","200");
        GridPoint gp3 = new GridPoint("4", "700","500");
        GridPoint gp4 = new GridPoint("5", "500","500");

        /*GridPoint gp3 = new GridPoint("4", "100","70");
        GridPoint gp4 = new GridPoint("5", "100","300");
        GridPoint gp5 = new GridPoint("6", "700","300");
*/
        List<GridPoint> gps = new LinkedList<>();
        gps.add(gp1);
        gps.add(gp2);
        gps.add(gp3);
        gps.add(gp4);

/*        gps.add(gp5);
        gps.add(gp6);
        gps.add(gp7);
        gps.add(gp8);
        gps.add(gp9);*/

        path = new Path();

        drawPath(gps);

/*        path.lineTo(500, 500);
        path.lineTo(200, 500);
        path.lineTo(200, 300);
        path.lineTo(0, 0);
        path.lineTo(1, 300);
        path.lineTo(1, 550);
        path.lineTo(1180, 550);
        path.lineTo(1181, 560);*/



    }

    private void drawPath(List<GridPoint> gps) {

        if(gps.size() > 1) {
            int x = Integer.parseInt(gps.get(0).getPosX());
            int y = Integer.parseInt(gps.get(0).getPosY());

            path.moveTo(x,y);

            //drawCircle(x,y );
            //path.addCircle(x,y,5, null);
            gps.remove(0);

            for (GridPoint gp : gps) {
                path.lineTo(Integer.parseInt(gp.getPosX()), Integer.parseInt(gp.getPosY()));
            }


        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);

    }

}