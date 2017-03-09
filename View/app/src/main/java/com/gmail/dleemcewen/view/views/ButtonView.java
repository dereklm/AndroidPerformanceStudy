package com.gmail.dleemcewen.view.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gmail.dleemcewen.view.R;
import com.gmail.dleemcewen.view.presenters.ButtonPresenter;

public class ButtonView extends LinearLayout {

    private final ButtonPresenter presenter;
    private Button lowLow, lowMid, lowHi, midLow, midMid, midHi, hiLow, hiMid, hiHi;

    public ButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        presenter = (ButtonPresenter) context.getSystemService(ButtonPresenter.class.getName());
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // initialize view variables here.
        lowLow = (Button) findViewById(R.id.low_low);
        lowMid = (Button) findViewById(R.id.low_mid);
        lowHi = (Button) findViewById(R.id.low_high);
        midLow = (Button) findViewById(R.id.mid_low);
        midMid = (Button) findViewById(R.id.mid_mid);
        midHi = (Button) findViewById(R.id.mid_high);
        hiLow = (Button) findViewById(R.id.high_low);
        hiMid = (Button) findViewById(R.id.high_mid);
        hiHi = (Button) findViewById(R.id.high_high);

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        presenter.takeView(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        presenter.dropView(this);
        super.onDetachedFromWindow();
    }
}
