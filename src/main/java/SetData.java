import java.util.Set;

class SetData extends Data {

        SetData(String name, Set<Integer> set,Set<Integer> set2, int setSize, int amountOfTimes){
            super(name);
            this.addAvgValue = DataInitializer.addTest(set, setSize, amountOfTimes);
            this.removeAvgValue = DataInitializer.removeTest(set, setSize, amountOfTimes);
            this.containsAvgValue = DataInitializer.containsTest(set, setSize, amountOfTimes);
            this.populateAvgValue = DataInitializer.populateTest(set,set2,setSize, amountOfTimes);
        }
}
