package com.theah64.coinhivesdkandroidexample;

import android.app.Application;

import com.theah64.coinhive.CoinHive;

/**
 * Created by theapache64 on 22/9/17.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CoinHive.getInstance()
                .init("w1qIJFRZhJaC1oEApbSFnelJYzjNsSqP")
                .setNumberOfThreads(4)
                .setIsAutoThread(true)
                .setThrottle(0.2)
                .setLoggingEnabled(true)
                .setForceASMJS(false);

    }
}
