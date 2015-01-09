package com.joshskeen.daggerexample;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.joshskeen.daggerexample.model.MyRegularOldClassInstance;
import com.joshskeen.daggerexample.model.MySingleton;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SecondActivity extends BaseActivityWithInjection {

    private static final String TAG = "SecondActivity";

    //Dagger injected objects
    @Inject
    MySingleton mMySingleton;
    @Inject
    MyRegularOldClassInstance mMyRegularOldClassInstance;

    //Butterknife "Injected" views (not really 'dependency injection', but dries up code!)
    @InjectView(R.id.activity_text)
    TextView mActivityText;

    @InjectView(R.id.start_activity)
    Button mStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.inject(this);
        Log.d(TAG, "Singleton Instance :" + mMySingleton.toString());
        Log.d(TAG, "Regular Class Instance :" + mMyRegularOldClassInstance);
        mActivityText.setText(Html.fromHtml("mMySingleton: " + mMySingleton.toString() + "<br /><br /> mMyRegularOldClassInstance: " + mMyRegularOldClassInstance.toString()));
        mStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }

}
