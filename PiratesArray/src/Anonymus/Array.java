package Anonymus;

import java.util.Arrays;

public class Array {
    private int size=0;
    private int[] myArr;
    private int [] newArry;
    private int [] tempArry;
    private int temp;
    private int count1;
    private int reduceCount;

    public Array(){
           this.myArr=new int[0];
            this.count1=0;

    }
    public Array(int n){
        this.size=n;
        this.myArr=new int[this.size];
        this.count1=0;
        this.temp=size;
    }

    public void add(int d){
        try{
        myArr[count1]=d;
        count1++;
        }
        catch(Exception e){
            System.out.println("Array exceeded");
        }
        newArry=myArr;
        this.reduceCount=count1;        // reduceCount is used as a temporary variable for count

    }

    public void add(int d,int index){
        int i;
        int j=0;
        this.temp++;
        this.newArry=new int[temp];
        for(i=0;i<(temp);i++){
            if(i!=index){
                newArry[i]=myArr[j];
                j++;
            }else
                newArry[i]=d;
        }
        myArr=newArry;
        count1++;
        this.reduceCount=count1;        // reduceCount is used as tempary variable for count
    }


    public void replace(int d,int index){
        try{
            newArry[index]=d;
        }
        catch(Exception e){
            System.out.println("Error !");
        }
    }

    public int get(int index){
        int element=newArry[index];
        return element;
    }

    public void remove(int index){
            reduceCount--;
       this.tempArry= new int[reduceCount];
        int j=0;
        int i=0;
        for(i=0;i<reduceCount;i++){
            if(i>=index){
                tempArry[i]=newArry[i+1];
            }else{
                tempArry[i]=newArry[i];
            }

        }
        newArry=tempArry;
    }

    public boolean isEmpty(){
        if(this.count1==0){
            return true;
        }
        return false;
    }

    public int size(){
        int cnt=0;
        for(int p:newArry){
            cnt++;
        }
        return cnt;
    }

    public boolean contains(int d){
        for(int p:newArry){
            if(p==d){
                return true;
            }
        }
        return false;
    }

    public void trimToSize(int size1){
        int [] trimArry= new int[size1];
        for(int k=0;k<size1;k++){
            trimArry[k]=newArry[k];
        }
        newArry=trimArry;
    }

    public void clear(){
        int [] clearArry= new int[0];
        newArry=clearArry;
    }

    @Override
    public String toString() {
        return "Array : " +
                  Arrays.toString(newArry) ;
    }


}