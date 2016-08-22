import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Runner {

    private Data hashSetData;
    private Data treeSetData;
    private Data arrayListData;
    private Data linkedListData;

    private static int collectionSize = 20000;

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.getData(collectionSize);
        runner.printData();
        runner.saveData();
    }

    private void saveData() {
        File file = new File("result.txt");
        DataSaver ds = new DataSaver(file,collectionSize);
        ds.saveData(arrayListData);
        ds.saveData(linkedListData);
        ds.saveData(hashSetData);
        ds.saveData(treeSetData);
    }

    private void printData() {

        DataPrinter dp = new DataPrinter(collectionSize);
        dp.printData(arrayListData);
        dp.printData(linkedListData);
        dp.printData(hashSetData);
        dp.printData(treeSetData);

    }

    private void getData(int collectionSize) {

        hashSetData = new SetData("hashSet", new HashSet<Integer>(),
                new HashSet<Integer>(),collectionSize);
        treeSetData = new SetData("treeSet", new TreeSet<Integer>(),
                new TreeSet<Integer>(),collectionSize);
        arrayListData = new ListData("arrayList", new ArrayList<Integer>(),
                new ArrayList<Integer>(), collectionSize);
        linkedListData = new ListData("linkedList", new LinkedList<Integer>(),
                new LinkedList<Integer>(), collectionSize);
    }
}
