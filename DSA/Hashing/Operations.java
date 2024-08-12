import java.util.*;

public class Operations {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        System.out.println(hm);

        //get
        int population=hm.get("India");
        System.out.println(population);

        System.out.println("Pakistan");
        
        //ContainsKey 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pakistan"));

        //Remove 
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //IsEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}