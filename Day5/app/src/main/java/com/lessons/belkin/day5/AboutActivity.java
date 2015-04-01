package com.lessons.belkin.day5;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Belkin on 01.04.2015.
 */
public class AboutActivity extends Activity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
