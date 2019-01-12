package technikum_wien.at.smartcity_indoornavigation;

import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

public class MainActivity extends Activity {

    //global variables for zooming
    private ScaleGestureDetector mScaleGestureDetector;
    private float mScaleFactor = 1.0f;
    private MapView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for zooming
        mImageView=findViewById(R.id.navView);
        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
    }

    //for zooming
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        mScaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    //for zooming
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector){
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f,
                    Math.min(mScaleFactor, 10.0f));
            mImageView.setScaleX(mScaleFactor);
            mImageView.setScaleY(mScaleFactor);
            return true;
        }
    }
}
