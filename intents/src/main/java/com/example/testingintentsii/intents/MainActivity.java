package com.example.testingintentsii.intents;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public final static String RANDOM_NUM = "com.example.testingintentsii.intents.NUMBER";
    private static String TAG = MainActivity.class.getSimpleName();

    private TextView tvInit = null;
    private Button btnGetSum = null;
    private Button btnGetRandom = null;
    private View.OnClickListener onClickCalculate = null;
    private View.OnClickListener onClickRandom = null;

    double x = Math.random();
    double y = Math.random();
    String z = String.valueOf(x+y);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
    }

    private void setupViews(){
        tvInit = (TextView)findViewById(R.id.tvInit);
        //btnGetSum = (Button)findViewById(R.id.btnGetSum);
        //btnGetSum.setOnClickListener(onClickCalculate);
        //btnGetRandom = (Button)findViewById(R.id.btnGetRandom);
        //btnGetRandom.setOnClickListener(onClickRandom);
    }

    public void onClickCalculate(View view){
        Intent sumIntent = new Intent(this, SumActivity.class);
        startActivity(sumIntent);
    }

    public void onClickRandom(View view){
        Intent randIntent = new Intent(this, SumActivity.class);
        randIntent.putExtra(RANDOM_NUM,z);
        startActivity(randIntent);

    }
}
