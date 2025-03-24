import java.util.Scanner; // inport user input processing

class Main {
    int x = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // create a scanner to use the scanner functions

        // int number = Math.addExact(3,5);
        
        // Object oriented programming
        // OOP is simulating the real life object(person, etc) and abstract object() in code. Abstract.
        // the objects created from classes are like rows in a table in a database. 
            // Objects in code can get sent back to the database.


        // Class = Design/Template/Blueprint
            // If the initial class is a house plan with 3 bed 2 bath, you can't make an object as is with 4 bed instead.
            // But you CAN make a child class with another bedroom attribute, bed 4. That way, you can have 4 bed.

        // You can nest an object in the Main class!       
                Main myObj = new Main();
                System.out.println(myObj.x);    // Seems to work like a public variable within this file.
        
        // Within a class: 
            // Static Method: This method can be used WITHOUT using an object. I.E. Math methods don't need a math object. To use: methodName()
            // Public Method: This method needs an object of it's class to work. To use: objName.methodName()


        // person class create using loop
        Person p;       // declare a dummy object, object has null value
        // System.out.println(p.getAge()); // error

        Person[] persons = new Person[5];
        for (int i=0; i<5; i++) {
            p = new Person("Name" + i, 20+i);
            System.out.println("Persons Count: " + i + " " + Person.getCount());
            // store the person information in an array. If it does not get stored, it will be overwritted and become garbage.
            persons[i] = p;
        }
            // you can call the static method with the class name. A static list could be made to hold all students.
        System.out.println("Persons Count: " + Person.getCount());


        //////////////////////////////////////////////


        // factorial result
        long result = factorial(3);
        System.out.println("Recursive result: " + result);

        long otherResult = factorial(3);
        System.out.println("Normal result: " + otherResult);
    }

    // recursion: When a method calls itself
    // Use recursion to calculate the factorial of n
    static long factorial(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n*factorial(n-1);        // n! = n*n-1 ||| facorital of n === n * (n-1)
        }
    }

    // normal method to cal factorial
    static long fac(int n) {
        int product = 1;
        for (int i=1; i<=n; i++) {
            product*=i;
        }
        return product;
    }

    // Static methods automatically get memory allocated to them.
    // in static methods, you can call methods without objects?
    // in c#, you can only call static methods. ?


    // All methods need different signatures. The signature includes the name, parameters, and return type

    static void MyMethod() {
        System.out.println("Some my method text.");
    }

    static void ReturningMethod(int aParameter) {
        System.out.println("The int parameter is: " + aParameter);
    }
}