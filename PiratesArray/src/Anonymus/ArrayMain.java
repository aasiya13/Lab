package Anonymus;

/**
 * Created by mbg on 12/07/16.
 */
public class ArrayMain {
    public static void main(String args[]){
        Array ar= new Array(5);

           ar.add(5);
            ar.add(2);
            ar.add(6);
            ar.add(3);
            ar.add(4);
            ar.add(2,4);
        ar.replace(100,0);
        System.out.println(ar.get(1));
          //  ar.remove(1);
        ///System.out.println("3rd element :"+ar.get(3));
      //  System.out.println(ar.contains(10));
        //ar.remove(2);
      //  ar.remove(1);
       // ar.clear();
        System.out.println(ar.toString());

    }
}
