import java.util.Set;

public class DataPrinter {
    static {
        System.out.printf("%-12s%-6s%-11s%-9s%-11s%-11s%-14s%-6s%n",
                "Name","Add","Contains", "Remove", "Populate", "Iter.add", "Iter.remove","Get");
        System.out.println("----------------------------------------------------------------------------------");
    }

    void printData(Data data){

        if (data instanceof SetData) {
            SetData setData = (SetData) data;
            String s = String.format("%-12s%-8.2f%-11.2f%-10.2f%-10.2f%n",
                    setData.name, setData.addAvgValue, setData.containsAvgValue,
                    setData.removeAvgValue, setData.populateAvgValue);

            System.out.println(s);
        }
        if (data instanceof ListData) {
            ListData listData = (ListData) data;
            String s = String.format("%-12s%-8.2f%-11.2f%-10.2f%-11.2f%-11.2f%-11.2f%-11.2f%n",
                    listData.name, listData.addAvgValue, listData.containsAvgValue,
                    listData.removeAvgValue, listData.populateAvgValue,
                    listData.listIteratorAddAvgValue,
                    listData.listIteratorRemoveAvgValue, listData.getAvgValue);

            System.out.println(s);
        }


    }
}

