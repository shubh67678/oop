import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Collection<Integer> new_list = new ArrayList<Integer>();
        Collection<Integer> new_list = new ArrayList();

        new_list.add(1);
        System.out.println("For each loop:");
        for (Object i : new_list) { // for each loop
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Iterator:");
        Iterator itereable = new_list.iterator();

        while (itereable.hasNext()) {
            System.out.println(itereable.next());
        }
    }
}
