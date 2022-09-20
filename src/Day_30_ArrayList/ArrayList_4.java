package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_4 {
    //     addAll() , içerisine başka bir array list tanımlayarak beraber yazdırılır.
//    removeAll(), içeride ne varsa tertemiz eder :)
    public static void main(String[] args) {
        ArrayList<String> position = new ArrayList<>();
        position.add("QA");
        position.add("DEVELOPER");
        position.add("UXDESINGER");
        position.add("DEVEPS ENGINEER");
        position.add("SCRUM MASTER");

        ArrayList<String> tools = new ArrayList<>();
        tools.add("SELENIUM");
        tools.add("JAVA");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");

        position.addAll(tools);
        System.out.println("position = " + position);

        tools.addAll(position);
        System.out.println("tools = " + tools);

//        ArrayList<String> other = new ArrayList<>();
//        other.add("PRODUCT OWNER");
//        System.out.println("tools.removeAll(other) = " + tools.removeAll(other));
//        BULAMAZSA BOOLEEN DEĞER OLAN FALSE  DÖNDÜRÜR. EŞELEŞME YOK.


        tools.removeAll(position);
        System.out.println("tools = " + tools);
    }
}
