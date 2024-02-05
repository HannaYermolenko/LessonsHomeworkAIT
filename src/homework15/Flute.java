package homework15;

public class Flute {
    String name;
    String color;
    String production;
    String material;
    int weight;
    int prise;

    public Flute(String fluteName) {name = fluteName;}

    public void clarification(){
        System.out.println("Production: " + production + "Material: " + material + "Color: " + color);
    }

    public void numbers(){
        System.out.println("Weight kg: " + weight + "Prise: " + prise);}

    public void appointment() {
        System.out.println("Wind musical instrument");
    }
    public void feautersOfuse(){
        System.out.println("Playing with hands and mouth. Blow out air. Using other parts of body is not advisable. But you can try**");
    }

    public void fluteNote(){
        System.out.println("May irritate neighbors and after attract the police");
    }
}
