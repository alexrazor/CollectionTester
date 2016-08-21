import java.util.Set;

public class SetData extends Data {

        public SetData(String name, Set<Integer> set,Set<Integer> set2, int setSize){
            super(name);
            this.addAvgValue = DataInitializer.addTest(set, setSize);
            this.removeAvgValue = DataInitializer.removeTest(set, setSize);
            this.containsAvgValue = DataInitializer.containsTest(set, setSize);
            this.populateAvgValue = DataInitializer.populateTest(set,set2,setSize);
        }
}
