package Map;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String,Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        //Extends Hashmap but default Maintain Order of Input
        //It uses double LinkedList
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Gavava",13);
        linkedHashMap.put("Apple",20);

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
        //Jis Order me data insert kiya tha ussi me output mila

        java.util.LinkedHashMap<String,Integer> linkedHashMap1 = new java.util.LinkedHashMap<>(10,0.3f,true);
        //Here Acces Order true Means change order according to user
        linkedHashMap1.put("Orange",10);
        linkedHashMap1.put("Gavava",13);
        linkedHashMap1.put("Apple",20);

        linkedHashMap1.get("Apple");
        linkedHashMap1.get("Orange");

        for (Map.Entry<String,Integer> entry : linkedHashMap1.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
