package com.gmail.dleemcewen.isandroidperformancestudyactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListAdapter;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.Utils.ExpandableListGen;

import java.util.ArrayList;

public class LowHiActivity extends AppCompatActivity {

    private ExpandableListAdapter ela;
    private ArrayList<ExpandableListView> lists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_hi);

        lists.add((ExpandableListView) findViewById(R.id.ex1));
        lists.add((ExpandableListView) findViewById(R.id.ex2));
        lists.add((ExpandableListView) findViewById(R.id.ex3));
        lists.add((ExpandableListView) findViewById(R.id.ex4));
        lists.add((ExpandableListView) findViewById(R.id.ex5));

        ela = new ExpandableListAdapter(LowHiActivity.this, ExpandableListGen.gen());
        for (ExpandableListView ev : lists) {
            ev.setAdapter(ela);
        }

    }
}
