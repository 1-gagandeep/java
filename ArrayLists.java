import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add elements
        list.add(50);
        list.add(72);
        list.add(13);

        System.out.println(list);

        // get elaments
        int element = list.get(0);
        System.out.println(element);

        //add elements in between
        list.add(1,55);
        System.out.println(list);

        // set elements
        list.set(0,65);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
