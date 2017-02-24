package com.gmail.dleemcewen.isandroidperformancestudyactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListAdapter;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListChild;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListGroup;

import java.util.ArrayList;

public class LowHiActivity extends AppCompatActivity {

    private ExpandableListAdapter ela;
    private ArrayList<ExpandableListGroup> groups;
    private ArrayList<ExpandableListView> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_hi);

        lists.add((ExpandableListView) findViewById(R.id.ex1));
        lists.add((ExpandableListView) findViewById(R.id.ex2));
        lists.add((ExpandableListView) findViewById(R.id.ex3));
        lists.add((ExpandableListView) findViewById(R.id.ex4));
        lists.add((ExpandableListView) findViewById(R.id.ex5));

        for (int i = 0; i < 5; i++) {
            groups.add(new ExpandableListGroup());

            ArrayList<ExpandableListChild> children = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                ExpandableListChild ec = new ExpandableListChild();
                ec.setName("child item " + j);
                ec.setTag(j + "");
                children.add(ec);
            }
            groups.get(i).setItems(children);
        }

        ela = new ExpandableListAdapter(LowHiActivity.this, groups);
        for (ExpandableListView ev : lists) {
            ev.setAdapter(ela);
        }

    }
}
