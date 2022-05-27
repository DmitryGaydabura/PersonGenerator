/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.

Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.

Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).



1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:

не было человека весом 3 кг и ростом 180 итд.*/

public class Person {
    String name;
    String surname;
    int age;
    int weight;
    int height;

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return   name + " " + surname +
                "  age=" + age +
                " , weight=" + weight +
                " kg, height=" + height + " cm";
    }
}
