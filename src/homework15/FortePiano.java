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
        System.out.println("Production: " + production + "Material: " + material);
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



}
