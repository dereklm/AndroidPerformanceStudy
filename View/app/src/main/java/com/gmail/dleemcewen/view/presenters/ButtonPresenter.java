package com.gmail.dleemcewen.view.presenters;

import android.os.Bundle;

import com.gmail.dleemcewen.view.views.ButtonView;

import mortar.ViewPresenter;

public class ButtonPresenter extends ViewPresenter<ButtonView> {

    private int serial = -1;

    @Override
    protected void onLoad(Bundle savedInstanceState) {
        if (savedInstanceState != null && serial == -1) serial = savedInstanceState.getInt("serial");
    }

    @Override
    protected void onSave(Bundle outState) {
        outState.putInt("serial", serial);
    }

}
