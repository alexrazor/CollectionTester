import java.util.Collection;
import java.util.List;
import java.util.ListIterator;


public class DataInitializer {

    static double addTest(Collection<Integer> c, int amount){

        long start = System.currentTimeMillis();
        for (int i=0; i<amount; i++){
            c.add(i);
        }
        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }

    static double removeTest(Collection<Integer> c, int amount){

        for (int i=0; i<amount; i++){
            c.add(i);
        }
        long start = System.currentTimeMillis();
       for (int i=0;i<c.size();i++){
           c.remove(i);
       }
        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
    static double containsTest(Collection<Integer> c, int amount){

        for (int i=0; i<amount; i++){
            c.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i=0;i<c.size();i++){
            c.contains(i);
        }
        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
    static double populateTest(Collection<Integer> c,Collection<Integer> d, int amount){

        for (int i=0; i<amount; i++){
            c.add(i);
            d.add(i);

        }
        long start = System.currentTimeMillis();
            c.addAll(d);
        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
    static double listIteratorAddTest(List<Integer> list, int amount){
        ListIterator<Integer> iterator = list.listIterator();
        long start = System.currentTimeMillis();
        for (int i=0; i<amount; i++){
            iterator.add(i);

        }

        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
    static double listIteratorRemoveTest(List<Integer> list, int amount){

        for (int i=0; i<amount; i++){
            list.add(i);
        }
        ListIterator<Integer> iterator = list.listIterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();

        }

        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
    static double getTest(List<Integer> list, int amount){

        for (int i=0; i<amount; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i=0; i<list.size(); i++){
            list.get(i);
        }

        return (double) (System.currentTimeMillis()-start)/(1000*1.0d);
    }
}
