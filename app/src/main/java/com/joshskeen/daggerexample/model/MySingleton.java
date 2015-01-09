package com.joshskeen.daggerexample.model;

import android.content.Context;

/**
 * Created by joshskeen on 7/29/14.
 */
public class MySingleton {

    private Context mContext;
    private String mDummyString;

    public MySingleton(Context context, String dummyString) {
        mContext = context;
        mDummyString = dummyString;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "mContext=" + mContext +
                ", mDummyString='" + mDummyString + '\'' +
                ", hashCode= " + hashCode() +
                '}';
    }
}
