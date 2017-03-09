package com.gmail.dleemcewen.view;

import android.app.Application;

import mortar.MortarScope;

public class ViewApplication extends Application {
    private MortarScope rootScope;

    @Override
    public Object getSystemService(String name) {
        if (rootScope == null) rootScope = MortarScope.buildRootScope().build("Root");

        return rootScope.hasService(name) ? rootScope.getService(name) : super.getSystemService(name);
    }
}
