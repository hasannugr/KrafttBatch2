package Day_54_CollectionCont2;

import java.util.Objects;

public class Student {
        String name;
        int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
