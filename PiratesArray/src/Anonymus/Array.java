/*
 details :
        Reg No : E/13/347
        Name : Sithara Pitiyage
*/
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
           this.myArr=new int[0];   // make a zero size array
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

    public void add(int d,int index){   // add given element to specific index
      try{
        int i;
        int j=0;
        this.temp++;
        this.newArry=new int[temp];     // making a new array
        for(i=0;i<(temp);i++){      // copying previous array to newArry
            if(i!=index){
                newArry[i]=myArr[j];
                j++;
            }else
                newArry[i]=d;
        }
       // myArr=newArry;
        count1++;          // count present the number of elements of a array
        this.reduceCount=count1;        // reduceCount is used as tempary variable for count
      }catch (Exception e){
          System.out.println("Error = " + e);
      }
    }


    public void replace(int d,int index){       // replace given element to specific index
        try{
            newArry[index]=d;
        }
        catch(Exception e){
            System.out.println("Error !");
        }
    }

    public int get(int index){          // get the element of given index
       int element = 0;
        try{
        element=newArry[index];
        return element;
       } catch (Exception e){
           System.out.println("Error");
       }
        return element;
    }


    public void remove(int index){          // remove specific element of the given index
      try{
            reduceCount--;
            this.tempArry= new int[reduceCount];    // making new array which reduce 1 amount of size
        int j=0;
        int i=0;
        for(i=0;i<reduceCount;i++){     // coping new array
            if(i>=index){
                tempArry[i]=newArry[i+1];
            }else{
                tempArry[i]=newArry[i];
            }

        }
        newArry=tempArry;
      } catch (Exception e){
          System.out.println("Error = " + e);
      }
    }

    public boolean isEmpty(){       // to check whether array
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
     try{
        for(int p:newArry){
            if(p==d){
                return true;
            }
        }
     } catch (Exception e){
         System.out.println("Error = " + e);
     }
        return false;
    }


    public void trimToSize(int size1){
      try{
            int [] trimArry= new int[size1];
            for(int k=0;k<size1;k++){
                trimArry[k]=newArry[k];
            }
            newArry=trimArry;
      } catch(Exception e){
          System.out.println("Error  = " + e);
      }
    }

    public void clear(){
        int [] clearArry= new int[0];
        newArry=clearArry;
    }

    @Override
    public String toString() {
        return Arrays.toString(newArry) ;
    }


}