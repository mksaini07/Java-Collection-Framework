package List;

import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        java.util.concurrent.CopyOnWriteArrayList<Integer> list = new java.util.concurrent.CopyOnWriteArrayList<>();

        List<String> shoppinglist = new java.util.concurrent.CopyOnWriteArrayList<>();
        shoppinglist.add("Milk");
        shoppinglist.add("Egg");
        shoppinglist.add("Bread");
        System.out.println("Intial Shopping List: "+shoppinglist);

        for (String item: shoppinglist){
            System.out.println(item);
            if(item.equals("Egg")){
                shoppinglist.add("Butter");
                System.out.println("Added Butter While Reading ");
            }
        }
        //copyonarraylist phele read krta h phir baad me write krta hai new list banake
        System.out.println("Updated shopping list: "+shoppinglist);

    }
}
