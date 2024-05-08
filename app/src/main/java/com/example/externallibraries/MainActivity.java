package com.example.externallibraries;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mackhartley.dashedview.DashColorGenerator;
import com.mackhartley.dashedview.DashedView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DashedView dash1 = findViewById(R.id.dashed);

        dash1.setDashColorGenerator(new DashColorGenerator() {
            @Override
            public int getPaintColor(int curIndex, int numDashes) {
                float alphaValue = 255 * ((curIndex + 1) / (float) (numDashes + 1));
                int gradientAppliedColor = Color.argb((int) alphaValue, 255, 0, 255);
                return gradientAppliedColor;
            }
        });
    }
}
