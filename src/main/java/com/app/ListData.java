package com.app;

import java.util.List;

class ListData extends Data{

    double   listIteratorAddAvgValue;
    double   listIteratorRemoveAvgValue;
    double   getAvgValue;

    ListData(String name, List<Integer> list, List<Integer> list2, int listSize, int amountOfTimes){
        super(name);

        this.addAvgValue = DataInitializer.addTest(list, listSize, amountOfTimes);
        this.removeAvgValue = DataInitializer.removeTest(list, listSize, amountOfTimes);
        this.containsAvgValue = DataInitializer.containsTest(list, listSize,amountOfTimes);
        this.populateAvgValue = DataInitializer.populateTest(list,list2,listSize, amountOfTimes);
        this.listIteratorAddAvgValue = DataInitializer.listIteratorAddTest(list,listSize,amountOfTimes);
        this.listIteratorRemoveAvgValue = DataInitializer.listIteratorRemoveTest(list, listSize, amountOfTimes);
        this.getAvgValue = DataInitializer.getTest(list, listSize, amountOfTimes);

    }
}
