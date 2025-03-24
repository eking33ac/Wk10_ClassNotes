public class Person {
    // attributes
    public String Name="";
    public int Age=18;
    static int Count = 0;


    public Person() {
        super();
    }
    // constructor
    public Person(String aName, int aAge) {
        Name = aName;
        Age = aAge;
        Count += 1;
    }

    // methods
    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public static int getCount() {
        return Count;
    }
}
