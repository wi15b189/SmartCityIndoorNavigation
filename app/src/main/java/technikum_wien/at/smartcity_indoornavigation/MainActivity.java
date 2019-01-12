package technikum_wien.at.smartcity_indoornavigation;

import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageButton;

import technikum_wien.at.smartcity_indoornavigation.Service.NavigationAppNavigateService;

public class MainActivity extends Activity {

    //global variables for zooming
    //private ScaleGestureDetector mScaleGestureDetector;
    //private float mScaleFactor = 1.0f;
    //private MapView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for zooming
        //mImageView=findViewById(R.id.navView);
        //mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
    }

    @Override
    protected void onResume(){
        super.onResume();
        //main activity

        final ImageButton button1 = findViewById(R.id.stand1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1
                //NavigationAppNavigateService.Navigate(1, SPScanner.Scan());
            }
        });
        final ImageButton button2 = findViewById(R.id.stand2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1

            }
        });
        final ImageButton button3 = findViewById(R.id.stand3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1

            }
        });
        final ImageButton button4 = findViewById(R.id.stand4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand4

            }
        });
        final ImageButton button5 = findViewById(R.id.stand5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1

            }
        });
        final ImageButton button6 = findViewById(R.id.stand6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1

            }
        });
        final ImageButton button7 = findViewById(R.id.stand7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // start navigation to stand1

            }
        });

    }

    //for zooming
    //@Override
    //public boolean onTouchEvent(MotionEvent motionEvent) {
    //    mScaleGestureDetector.onTouchEvent(motionEvent);
    //    return true;
    //}

    //for zooming
    //private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    //    @Override
    //    public boolean onScale(ScaleGestureDetector scaleGestureDetector){
    //        mScaleFactor *= scaleGestureDetector.getScaleFactor();
    //        mScaleFactor = Math.max(0.1f,
    //                Math.min(mScaleFactor, 10.0f));
    //        mImageView.setScaleX(mScaleFactor);
    //        mImageView.setScaleY(mScaleFactor);
    //        return true;
    //    }
    //}
}
