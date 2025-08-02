import java.util.*;
public class AL {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
    
    }


        
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(10); //O(1)
        list.add(20);
        list.add(30);
        //System.out.println("" + list);
        //int element=list.get(2);
        //System.out.println(element);

        //list.remove(2);
        //System.out.println("" + list);
        //list.set(1,10);
        System.out.println("" + list);
        //System.err.println(""+list.contains(10));
        System.out.println("Size of list: " + list.size());

        //print the array list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        int idx1 = 0;
        int idx2 = 2;
        //swapping numbers in an array list
        swap(list, idx1, idx2);
        System.out.println("\nAfter swapping: " + list);

        Collections.sort(list);
        System.out.println("After sorting: " + list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After sorting in descending order: " + list);

    }
}
