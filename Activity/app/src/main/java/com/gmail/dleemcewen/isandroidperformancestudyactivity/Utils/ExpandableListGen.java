package com.gmail.dleemcewen.isandroidperformancestudyactivity.Utils;


import android.widget.ExpandableListView;

import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListChild;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList.ExpandableListGroup;
import com.gmail.dleemcewen.isandroidperformancestudyactivity.R;

import java.util.ArrayList;

public class ExpandableListGen {

    public static ArrayList<ExpandableListGroup> gen() {

        ArrayList<ExpandableListGroup> groups = new ArrayList<>();

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
        return groups;
    }

}
