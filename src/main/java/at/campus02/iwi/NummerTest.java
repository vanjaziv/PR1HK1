package at.campus02.iwi;

public class NummerTest {
    public static void main(String[] args) {
        // Wie komme ich zu meiner 10er Stelle in einer Zahl zwischen 0 - 99

        // 25 ---> 2; 73 -> 7
        int age = 25;
        int jahrzehnt = age / 10;
        System.out.println(jahrzehnt);

        // in a japanese village all elderly people get older then 100
        // Wie komme ich zum jahrzehnt eines alters

        // zuerst durch 10 damit wir 7 verschwinden lassen - und dann modulo 10 für die aktuell letzte stelle ( 137 ---> 3)

        int zehnerstelle = (137 / 10) % 10; // qeine int division da beide zahlen onhe kommastelle
        System.out.println(zehnerstelle);

    }
}
