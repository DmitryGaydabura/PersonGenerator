public class Logic {
    public static Person[] createArrayOf100Persons(String[] allNames, String[] allSurnames ) {
        Person[] A = new Person[100];
        for (int i = 0; i < 100; i++) {
            int B = (int)(Math.random() * 10);
            String name = allNames[B];
            int C = (int)(Math.random() * 10);
            String surname = allSurnames[C];
            int age = (int)(Math.random() * 80 + 20);
            int weight = (int)(Math.random() * 70 + 50);
            int height = (int)(Math.random() * 50 + 150);
            A[i] = new Person(name, surname, age, weight, height);
        }
        return A;
    }

    public static void printPeople(Person[] A){
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " :" + A[i].toString());
        }
    }
}
