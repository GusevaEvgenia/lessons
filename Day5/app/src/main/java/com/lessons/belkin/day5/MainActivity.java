package com.lessons.belkin.day5;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText mWhom;
    private EditText mDescription;
    private EditText mSender;
    private TextView answer_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickSecondActivity(View view) {
        mWhom = (EditText)findViewById(R.id.whom_editText);
        mDescription = (EditText)findViewById(R.id.descr_editText);
        mSender = (EditText)findViewById(R.id.sender_editText);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(SecondActivity.USER, mWhom.getText().toString());
        intent.putExtra(SecondActivity.DESCR, mDescription.getText().toString());
        intent.putExtra(SecondActivity.SENDER, mSender.getText().toString());
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        answer_TextView = (TextView) findViewById(R.id.answer_textView);

        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                String thiefname = data.getStringExtra(SecondActivity.THIEF);
                answer_TextView.setText(thiefname);
            }else {
                answer_TextView.setText(""); // стираем текст
            }
        }
    }
}
