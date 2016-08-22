import java.util.List;

class ListData extends Data{

    double   listIteratorAddAvgValue;
    double  listIteratorRemoveAvgValue;
    double getAvgValue;

    ListData(String name, List<Integer> list, List<Integer> list2, int listSize){
        super(name);
        this.addAvgValue = DataInitializer.addTest(list, listSize);
        this.removeAvgValue = DataInitializer.removeTest(list, listSize);
        this.containsAvgValue = DataInitializer.containsTest(list, listSize);
        this.populateAvgValue = DataInitializer.populateTest(list,list2,listSize);
        this.listIteratorAddAvgValue = DataInitializer.listIteratorAddTest(list,listSize);
        this.listIteratorRemoveAvgValue = DataInitializer.listIteratorRemoveTest(list, listSize);
        this.getAvgValue = DataInitializer.getTest(list, listSize);

    }
}
