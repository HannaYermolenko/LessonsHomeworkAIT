package homework15;

public class FortePiano {
    String name;
    String color;
    String production;
    String material;
    int weight;
    int prise;

    public FortePiano(String pianoName) { name = pianoName;}

    public void clarifications(){
        System.out.println("Production: " + production + "Material: " + material + "Color: " + color);
    }
    public void numbers(){
        System.out.println("Weight kg: " + weight + "Prise $: " + prise);
    }

    public void appointment(){
        System.out.println("Keyboards music instruments");
    }
    public void feautersOfuse(){
        System.out.println("Play only with your hands only!!!!!!!!!");
    }

    public void specialReguirements(){
        System.out.println("You won't to play on subway. Need a lot of space.");
    }



}
