package com.lessons.belkin.day5;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {

    public final static String USER = "com.lessons.belkin.day5.user";
    public final static String DESCR = "com.lessons.belkin.day5.descr";
    public final static String SENDER = "com.lessons.belkin.day5.sender";

    public final static String THIEF = "ru.alexanderklimov.sherlock.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String user = "ЖЫвотное";
        String gift = "дырку от бублика";

        user = getIntent().getExtras().getString(USER);
        gift = getIntent().getStringExtra(DESCR);
        String sender = getIntent().getStringExtra(SENDER);

        TextView infoTextView = (TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText(user + " , вам передали " + gift + ", от " + sender);

        Intent answerInent = new Intent();
        answerInent.putExtra(THIEF, "Сообщение получено!");
        setResult(RESULT_OK, answerInent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
