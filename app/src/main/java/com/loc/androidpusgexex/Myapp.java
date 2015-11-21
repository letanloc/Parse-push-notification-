package com.loc.androidpusgexex;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by loc on 21/11/2015.
 */
public class Myapp extends Application {

    public static String APPLICATION = "WcnGvFQtgR8iqmCVoodlEQF4A2pR1BOgAqsr0jdG";
    public static String CLIEN_ID = "Z3UR0Ju4r0BPrqzcpEckWNMLkPD7jYH8MrNbVsGH";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, APPLICATION,CLIEN_ID);
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
