package com.app;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;


class DataInitializer {

    static double addTest(Collection<Integer> c, int collectionSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes;amount++){

            long start = System.currentTimeMillis();
            for (int i=0; i<collectionSize; i++){
                c.add(i);
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            c.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double removeTest(Collection<Integer> c, int collectionSize, int amountOfTimes){
        long totalTime = 0;

        for (int amount=0; amount<amountOfTimes; amount++){
            for (int i=0; i<collectionSize; i++){
                c.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i=0;i<c.size();i++){
                c.remove(i);
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            c.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double containsTest(Collection<Integer> c, int collectionSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes; amount++){
            for (int i=0; i<collectionSize; i++){
                c.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i=0;i<c.size();i++){
                c.contains(i);
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            c.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double populateTest(Collection<Integer> c,Collection<Integer> d, int collectionSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes; amount++){
            for (int i=0; i<collectionSize; i++){
                c.add(i);
                d.add(i);
            }
            long start = System.currentTimeMillis();
            c.addAll(d);
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            c.clear();
            d.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double listIteratorAddTest(List<Integer> list, int listSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes; amount++){
            ListIterator<Integer> iterator = list.listIterator();
            long start = System.currentTimeMillis();
            for (int i=0; i<listSize; i++){
                iterator.add(i);
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            list.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double listIteratorRemoveTest(List<Integer> list, int listSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes; amount++){
            for (int i=0; i<listSize; i++){
                list.add(i);
            }
            ListIterator<Integer> iterator = list.listIterator();
            long start = System.currentTimeMillis();
            while (iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            list.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }

    static double getTest(List<Integer> list, int listSize, int amountOfTimes){
        long totalTime=0;

        for (int amount=0; amount<amountOfTimes; amount++){
            for (int i=0; i<listSize; i++){
                list.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i=0; i<list.size(); i++){
                list.get(i);
            }
            long finish = System.currentTimeMillis()-start;
            totalTime+=finish;
            list.clear();
        }
        return ((totalTime*1.0d)/amountOfTimes)/(1000*1.0d);
    }
}
