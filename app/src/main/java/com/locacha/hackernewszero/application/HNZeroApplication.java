package com.locacha.hackernewszero.application;

import android.app.Application;

import com.locacha.hackernewszero.constants.AppConstants;

import timber.log.BuildConfig;
import timber.log.Timber;

/**
 * Created by matt on 2/13/17.
 */

public class HNZeroApplication extends Application
{
    @Override
    public void onCreate()
    {
        if (BuildConfig.DEBUG)
        {

            Timber.plant(new Timber.DebugTree());
            Timber.tag(AppConstants.LOG_TAG);
        }

        super.onCreate();
    }
}
