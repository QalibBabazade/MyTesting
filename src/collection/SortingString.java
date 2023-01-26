package collection;

import java.util.HashMap;
import java.util.Set;

public class SortingString {


    public static void main(String[] args) {

        String str = "Babazade";

        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0 ; i < str.length(); i++){

            int value = 1;
            String key = String.valueOf(str.charAt(i));

            if(map.containsKey(key)) {
                value = map.get(key) + value;
                map.put(key,value);
            }else{
                map.put(key,value);
            }
        }
       /***************************************************************/


       map.forEach((String key, Integer value) -> {
           System.out.println(key + " === "+ value);
       }) ;



      /*  for(String key: map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " - "+ value);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Set<String> set = map.keySet();
        set.forEach(key -> {
            System.out.println(key + " == " + map.get(key));
        });*/
    }
}
