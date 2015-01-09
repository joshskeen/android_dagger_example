package com.joshskeen.daggerexample.inject;

import android.app.Application;
import android.content.Context;

import com.joshskeen.daggerexample.model.DaggerExampleAppModule;
import dagger.ObjectGraph;

public class DaggerExampleApplication extends Application {

    private ObjectGraph mObjectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        mObjectGraph = ObjectGraph.create(new DaggerExampleAppModule(this));
    }

    public static DaggerExampleApplication get(Context context) {
        return (DaggerExampleApplication) context.getApplicationContext();
    }

    public final void inject(Object object) {
        mObjectGraph.inject(object);
    }

}
