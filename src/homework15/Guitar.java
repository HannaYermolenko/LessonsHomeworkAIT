package homework15;

public class Guitar {
    String name;
    String color;
    String production;
    String material;
    int weight;
    int prise;

    public Guitar(String guitarName){name = guitarName;}

    public void clarification(){
        System.out.println("Production: " + production + "Material: " + material + "Color: " + color);
    }

    public void numbers(){
        System.out.println("Weight kg: " + weight + "Prise: " + prise);}

    public void appointment() {
        System.out.println("String musical instrument");
    }
    public void feautersOfuse(){
        System.out.println("Playing with hands. Can be use a mediator. Using other parts of body dangerous for heals**");
    }
    public void specialAdvice(){
        System.out.println("Can be used as self-defense tool");
    }

}
