package com.joshskeen.daggerexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.joshskeen.daggerexample.inject.DaggerExampleApplication;

public abstract class BaseActivityWithInjection extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerExampleApplication.get(this).inject(this);
    }
}
