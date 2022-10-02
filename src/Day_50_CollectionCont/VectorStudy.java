package Day_50_CollectionCont;

import java.util.Arrays;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec = " + vec);
//        addAll
        vec.addAll(Arrays.asList("aa", "bb", "cc", "dd", "ee"));
        System.out.println("vec = " + vec);

//        addElement()

        vec.addElement("tc");
        System.out.println("vec = " + vec);

        // capasity()
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec.capacity() = " + vec.capacity());


        // clear()

       /* vec.clear();
        System.out.println("vec = " + vec);

        */

        // clone()

        vec.clone();
        System.out.println("vec = " + vec);
        //a listedeki elemanların aynısıı clone eder.

        // contains

        System.out.println("vec.contains() = " + vec.contains("nn"));

        // containsAll

        System.out.println("vec.containsAll(Arrays.asList(\"aa\",\"bb\",\"cc\")) = "
                + vec.containsAll(Arrays.asList("aa", "bb", "cc")));

        // copyInto
        String[] strings = new String[8];
        vec.copyInto(strings);
        strings[0]="1";
        System.out.println("Arrays.toString(strings) = "
                + Arrays.toString(strings));
        //[1, null, null, null, null, null, null, null]

        // ensureCapacity()

        System.out.println("vec.capacity() = " + vec.capacity());
        vec.ensureCapacity(10);
        System.out.println("vec.capacity() = " + vec.capacity());vec.clone();
        System.out.println("vec = " + vec);

//        trimToSize()
        vec.trimToSize();
        System.out.println("vec.capacity() = " + vec.capacity());

//        set();
        vec.set(2,"aaa");
        System.out.println("vec = " + vec);

//        setElement();

        vec.setElementAt("cc",2);
        System.out.println("vec = " + vec);

    }

}
