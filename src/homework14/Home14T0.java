package homework14;

//Task 0
//Тернарный оператор
//
//[первый операнд c условием] ? [второй операнд] : [третий операнд];
//третьего НЕ ДАНО!!! , boolean может быть только true, false
//Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.

public class Home14T0 {
    public static void main(String[] args) {

        String str = "hello git how are you";
        String str1 = str.toUpperCase();
        toUpp(str);





    }


    public static void toUpp(String string) {
        for (int i = 0; i < string.length(); i++){
            char str = string.charAt(i);
            int unicode = (int) str;
            if (unicode >= 97 & unicode <= 122){
                unicode -= 32;
            }
            char upChar = (char) unicode;
            System.out.print(upChar);
        }









    }

}





