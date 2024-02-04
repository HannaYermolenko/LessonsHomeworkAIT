package homework14;
//st.length(); // получить длину строки
//    st.equals(st1); // сравнить две строки по значению
//    st.charAt() // получить символ из строки по его индексу
//    st.substring(с какого места включительно, до какого места не включительно)

public class Home14T3 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "lineal", "orange"};
        String search = "orange";
        searching(array, "pillow");

    }

    public static boolean searching(String[] arr, String string){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(string)){
                System.out.println("Naideno " + string);
                return true;
            }
        }
        System.out.println("Ne naideno");
        return false;



    }



}
