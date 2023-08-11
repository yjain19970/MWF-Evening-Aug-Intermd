package polymorphism.compiletime;

import java.util.List;

public class Calculator {


    public int add(int x , int y){
        return x+y;
    }

    public void add(double x, int y){

    }

    public int add(int x , int y, int z){
        return x+y+z;
    }

    public int add(List<Integer>list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
