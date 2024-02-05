package lessons15;

public class CatNew {
    public static void main(String[] args) {
        Cat cat = new Cat(); // sosdaem klass

        cat.sayHello();
        cat.run();
        cat.sleeps();

        String catName = cat.name;
        System.out.println("Imya " + catName);// ne isp konstruktor
        System.out.println("Age " + cat.age);
        System.out.println("Color " + cat.color);
// sozdaem eche odin obekt

        Cat cat1 = new Cat("Maks"); // ispolsovali konstruktor

        System.out.println(cat1.name);

        System.out.println("Color " + cat1.color);

        cat.whoIm();
        cat1.whoIm();


    }




}

