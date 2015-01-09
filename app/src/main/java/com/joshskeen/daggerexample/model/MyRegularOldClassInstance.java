package com.joshskeen.daggerexample.model;

public class MyRegularOldClassInstance {
    private final int mId;

    public MyRegularOldClassInstance() {
        mId = hashCode();
    }


    @Override
    public String toString() {
        return "MyRegularOldClassInstance{" +
                "mId=" + mId + '}';
    }
}