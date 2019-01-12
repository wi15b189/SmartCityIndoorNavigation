package technikum_wien.at.smartcity_indoornavigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

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
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(6);
        paint.setStyle(Paint.Style.STROKE);

        path = new Path();
        path.moveTo(500, 100);
        path.lineTo(500, 500);
        path.lineTo(200, 500);
        path.lineTo(200, 300);
        path.lineTo(350, 300);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);

    }


}