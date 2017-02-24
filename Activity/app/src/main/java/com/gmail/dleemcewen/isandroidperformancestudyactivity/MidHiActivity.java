package com.gmail.dleemcewen.isandroidperformancestudyactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListAdapter;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.Utils.ExpandableListGen;

import java.util.ArrayList;

public class MidHiActivity extends AppCompatActivity {

    private ExpandableListAdapter ela;
    private ArrayList<ExpandableListView> lists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_hi);

        lists.add((ExpandableListView) findViewById(R.id.ex1));
        lists.add((ExpandableListView) findViewById(R.id.ex2));
        lists.add((ExpandableListView) findViewById(R.id.ex3));
        lists.add((ExpandableListView) findViewById(R.id.ex4));
        lists.add((ExpandableListView) findViewById(R.id.ex5));
        lists.add((ExpandableListView) findViewById(R.id.ex6));
        lists.add((ExpandableListView) findViewById(R.id.ex7));
        lists.add((ExpandableListView) findViewById(R.id.ex8));
        lists.add((ExpandableListView) findViewById(R.id.ex9));
        lists.add((ExpandableListView) findViewById(R.id.ex10));
        lists.add((ExpandableListView) findViewById(R.id.ex11));
        lists.add((ExpandableListView) findViewById(R.id.ex12));
        lists.add((ExpandableListView) findViewById(R.id.ex13));
        lists.add((ExpandableListView) findViewById(R.id.ex14));
        lists.add((ExpandableListView) findViewById(R.id.ex15));
        lists.add((ExpandableListView) findViewById(R.id.ex16));
        lists.add((ExpandableListView) findViewById(R.id.ex17));
        lists.add((ExpandableListView) findViewById(R.id.ex18));
        lists.add((ExpandableListView) findViewById(R.id.ex19));
        lists.add((ExpandableListView) findViewById(R.id.ex20));

        ela = new ExpandableListAdapter(MidHiActivity.this, ExpandableListGen.gen());
        for (ExpandableListView ev : lists) {
            ev.setAdapter(ela);
        }

    }
}
