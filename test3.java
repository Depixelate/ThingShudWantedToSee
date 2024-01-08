import java.util.*;
class MyClass implements Comparable<MyClass>{
    private String s;
    MyClass(String other) {
        s = other;
    }

    public int compareTo(MyClass other) {
        return s.compareTo(other.s);
    }

    public String toString() {
        return s;
    }
}

class MyComparator implements Comparator<MyClass> {
    public int compare(MyClass a, MyClass b) {
        return -a.compareTo(b);
    }
}

class Test3 {
    public static void main(String[] args) {
        var a = new ArrayList<MyClass>();
        a.add(new MyClass("Hi"));
        a.add(new MyClass("Hello"));
        a.add(new MyClass("Goodbye"));
        a.add(new MyClass("Shyamm the legend"));
        a.add(new MyClass("Tharun"));
        System.out.printf("Current array: %s\n", a);
        Collections.sort(a);
        System.out.printf("New Array after natural sorting: %s\n", a);
        Collections.sort(a, new Comparator<MyClass>() {
            public int compare(MyClass a, MyClass b) {
                return a.toString().substring(1).compareTo(b.toString().substring(1));
            }
        });
        System.out.printf("New Array after specific sorting: %s\n", a);
    }
}
