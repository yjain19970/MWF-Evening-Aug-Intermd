package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;

    public Sorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("call ThreadName: " + Thread.currentThread().getName());
        // S1: Base Case
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        // s2 create left and right array.

        List<Integer> leftArray = new ArrayList<>();
        for(int i=0; i<mid;++i){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid; i<arrayToSort.size();++i){
            rightArray.add(arrayToSort.get(i));
        }

        // s3 HOW DO WE CALL the MERGE SORT?
        Sorter leftSorter = new Sorter(leftArray);
        Sorter rightSorter = new Sorter(rightArray);


        //ExecutorService ee = Executors.newCachedThreadPool();
        List<Integer> leftSortedArray = leftSorter.call();
        List<Integer> rightSortedArray = rightSorter.call();

        // WE have gotten the sorted arrays. We need to merge them Now

        List<Integer> sortedArray = new ArrayList<>();
        // s4 USING TWO POINTERS

        int i=0, j=0;

        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }else{
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        // s5 WHAT ELSE? --> check for remaining half
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i)); i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j)); j++;
        }

        // s6 now return --> LEts go to CLIENT
        return sortedArray;
    }
}
