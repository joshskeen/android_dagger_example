package com.joshskeen.daggerexample.model;

import com.joshskeen.daggerexample.inject.DaggerExampleApplication;
import com.joshskeen.daggerexample.MainActivity;
import com.joshskeen.daggerexample.SecondActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = {
        MainActivity.class,
        SecondActivity.class,
}, complete = true)

public class DaggerExampleAppModule {

    private final DaggerExampleApplication mDaggerExampleApplication;

    public DaggerExampleAppModule(DaggerExampleApplication daggerExampleApplication) {
        mDaggerExampleApplication = daggerExampleApplication;
    }

    @Provides
    @Singleton
    public MySingleton provideMySingleton() {
        return new MySingleton(mDaggerExampleApplication.getApplicationContext(), "FOOBAR!");
    }

    @Provides
    public MyRegularOldClassInstance provideMyRegularOldClassInstance() {
        return new MyRegularOldClassInstance();
    }

}