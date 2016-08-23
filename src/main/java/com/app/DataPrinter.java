package com.app;

class DataPrinter {

    DataPrinter(int collectionSize, int amountOfTimes) {
        System.out.printf("Collection size: %d, amount of times: %d%n", collectionSize, amountOfTimes);
        System.out.printf("%-13s%-6s%-11s%-9s%-11s%-11s%-14s%-6s%n",
                          "Name","Add","Contains", "Remove", "Populate", "Iter.add", "Iter.remove","Get");
        System.out.println("-----------------------------------" +
                           "-----------------------------------------------");
    }

    void printData(Data data){
        String toPrint = "Data not found";

        if (data instanceof SetData) {
            SetData setData = (SetData) data;
            toPrint = String.format("%-12s%-8.3f%-11.3f%-10.3f%-10.3f%n",
                                    setData.name, setData.addAvgValue, setData.containsAvgValue,
                                    setData.removeAvgValue, setData.populateAvgValue);

        }
        if (data instanceof ListData) {
            ListData listData = (ListData) data;
            toPrint = String.format("%-12s%-8.3f%-11.3f%-10.3f%-11.3f%-11.3f%-11.3f%-11.3f%n",
                                    listData.name, listData.addAvgValue, listData.containsAvgValue,
                                    listData.removeAvgValue, listData.populateAvgValue,
                                    listData.listIteratorAddAvgValue,
                                    listData.listIteratorRemoveAvgValue, listData.getAvgValue);

        }
        System.out.println(toPrint);
    }
}

