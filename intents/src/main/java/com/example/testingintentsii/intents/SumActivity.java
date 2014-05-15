package com.example.testingintentsii.intents;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SumActivity extends ActionBarActivity {
    private static String TAG = SumActivity.class.getSimpleName();

    private TextView tvResults = null;
    private TextView tvSum = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        //Check for Intents
        if (getIntent().getExtras() !=null) {
            Intent intent = getIntent();
            String randNum = intent.getStringExtra(MainActivity.RANDOM_NUM);

            //Use the Received Intent as the results
            TextView tvSum = new TextView(this);
            tvSum.setText(randNum);

        }
        else {
            TextView tvSum = new TextView(this);
            tvSum.setText("The sum of x.x and y.y is z.z");
        }

        //Setup Views
        setupViews();
    }

    // Views
    private void setupViews(){
        tvResults = (TextView)findViewById(R.id.tvResults);
        tvSum = (TextView)findViewById(R.id.tvSum);
    }




}
