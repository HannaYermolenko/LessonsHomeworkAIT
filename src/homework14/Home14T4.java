package homework14;
// st.length(); // получить длину строки
//    st.equals(st1); // сравнить две строки по значению
//    st.charAt() // получить символ из строки по его индексу
//    st.substring(с какого места включительно, до какого места не включительно)
//

public class Home14T4 {
    public static void main(String[] args) {

        String string = "H";
        System.out.println(changeString(string));


    }

    public static String changeString(String str){
        if (str.length()>= 3){
            char secondChar = Character.toUpperCase(str.charAt(1));
            char thirdChar = Character.toUpperCase(str.charAt(2));
            return " " + secondChar + thirdChar;

        }
        if (str.length()>=2){
            char secondChar = Character.toUpperCase(str.charAt(1));
            return " " + secondChar + " ";
        }else {
            return " ";
        }
    }




    }










