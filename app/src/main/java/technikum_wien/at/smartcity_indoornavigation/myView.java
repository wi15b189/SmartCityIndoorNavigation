
package technikum_wien.at.smartcity_indoornavigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class myView extends View{

    Paint paint;
    Path path;

    public myView(Context context) {
        super(context);
        init();
    }

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public myView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);

        path = new Path();
        path.moveTo(50, 50);
        path.lineTo(50, 500);
        path.lineTo(200, 500);
        path.lineTo(200, 300);
        path.lineTo(350, 300);
        path.lineTo(400, 300);
        path.lineTo(450, 350);
        path.lineTo(500, 350);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);

    }
}
