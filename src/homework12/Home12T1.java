package homework12;

public class Home12T1 {

    public static void main(String[] args) {
        String[] proba = new String[]{"Piper", "Banana", "Tabletka", "Picture", "Hahahahahahaha"};
        String[] result = shotestLongest(proba);
        System.out.println(result[0]);
        System.out.println(result[1]);


    }

    public static String[] shotestLongest(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0]; // Возвращаем пустой массив, если входной массив пуст или null
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (shortest.length() < strings[i].length()) {
                shortest = strings[i];
            }
            if (shortest.length() < strings[i].length()) {
                longest = strings[i];

            }
        }

        // Возвращаем массив из самой короткой и самой длинной строки
        return new String[] {shortest, longest};
    }






}



