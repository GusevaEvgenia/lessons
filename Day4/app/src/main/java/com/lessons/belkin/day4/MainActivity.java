package com.lessons.belkin.day4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoView = (TextView) findViewById(R.id.textView);

        Button yellowButton = (Button)findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                //onClickButton(v.getId());
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRedButtonClick(View view) {
        mInfoView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
        //onClickButton(view.getId());
    }

    public void onGreenButtonClick(View view) {
        mInfoView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
        //onClickButton(view.getId());
    }

   /* private void onClickButton(int button){
        int text = R.string.red;
        int color = R.color.redColor;
        switch(button){
            case R.id.buttonRed:
                text= R.string.red;
                color = R.color.redColor;
                break;
            case R.id.buttonYellow:
                text= R.string.yellow;
                color = R.color.yellowColor;
                break;
            case R.id.buttonGreen:
                text= R.string.green;
                color = R.color.greenColor;
                break;
        }
        mInfoView.setText(text);
        mRelativeLayout.setBackgroundColor(getResources().getColor(color));
    }*/
}
