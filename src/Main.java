public class Main {
    public static void main(String[] args) {
        Person[] A = Logic.createArrayOf100Persons(Utility.getNames(),Utility.getSurnames() );
        Logic.printPeople(A);
    }
}
