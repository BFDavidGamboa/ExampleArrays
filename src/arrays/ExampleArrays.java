package arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        //1. Declare a variable array type of ints
        int[] ages;

        //2. Instane of arrays int
        ages = new int[3];

        //3. Initialize values in the array
        ages[0] = 30;
        ages[1] = 15;
        ages[2] = 20;

        //4. Print the values in the array
        System.out.println("Array int with index 0: " + ages[0]);
        System.out.println("Array int with index 1: " + ages[1]);
        System.out.println("Array int with index 2: " + ages[2]);

        //1. Declare object types arrays
        Person[] persons = new Person[4];

        //2. Initialize array values
        persons[0] = new Person("juan");
        persons[2] = new Person("Karla");

        //3.
        for (Person element: persons) {
            System.out.println("Array personss index 0: " + element);
        }

    }
}
