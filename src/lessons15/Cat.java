package lessons15;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(){// konstruktor po umolchaniu

    }

    public Cat(String catName){
        name = catName;
    }

    public void whoIm(){
        System.out.println("I m a cat " + name + " age " + age + " color " + color);
    }

    void sleeps() {
        System.out.println("Im sleep");


    }

    void sayHello(){
        System.out.println("Meoo");
    }

    void run (){
        System.out.println("Run");
    }





}
