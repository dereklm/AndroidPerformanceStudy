package com.gmail.dleemcewen.isandroidperformancestudyactivity.ExpandableList;

import java.util.ArrayList;

public class ExpandableListGroup {

    private String name;
    private ArrayList<ExpandableListChild> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ExpandableListChild> getItems() {
        return items;
    }

    public void setItems(ArrayList<ExpandableListChild> items) {
        this.items = items;
    }
}
