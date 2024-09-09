package IO.github.KaiyWhiteSnow;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Mazlicek> listMazlicku = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("Chcete přídat mazlíčka (1), vypsat informace o mazlíčkovy (2), vypsat jména mazlíčků (3), vypsat průměrný věk a váhu (4)?");
            int akce = sc.nextInt();
            sc.nextLine();
            switch (akce){
                case 1:
                    pridatMazlicky();
                    break;
                case 2:
                    vypsatInfo();
                    break;
                case 3:
                    vypsatJmena();
                    break;
                case 4:
                    Mazlicek.prumernaVaha(listMazlicku);
                    Mazlicek.prumernyVek(listMazlicku);
                    break;
                case 5:
                    System.out.println("Jak se jmenuje tvůj mazlíček? ");
                    String jmeno = sc.nextLine();
                    System.out.println(Mazlicek.hledaniMazlickaDleJmena(listMazlicku, jmeno));
                    break;
                case 6:
                    System.out.println("Jaký druh hledáš? ");
                    String druh = sc.nextLine();
                    System.out.println(Mazlicek.hledaniMazlickaDleDruhu(listMazlicku, druh));
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }

    public static void pridatMazlicky(){
        System.out.println("Kolik mazlíčků chcete přídat?");
        int pocetMazlicku = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < pocetMazlicku; i++) {
            System.out.println("Zadejte jméno, druh, věk a váhu mazlíčka: ");
            String jmenoMazlicka = sc.nextLine();
            String druhMazlicka = sc.nextLine();
            int vekMazlicka = sc.nextInt();
            sc.nextLine();
            float vahaMazlicka = sc.nextFloat();
            sc.nextLine();
            Mazlicek mazlicek = new Mazlicek(jmenoMazlicka, druhMazlicka, vekMazlicka, vahaMazlicka);
            listMazlicku.add(mazlicek);
        }
    }

    public static void vypsatInfo() {
        System.out.println("O kterém mazlíčkovy chcete vypsat info?");
        for (int i = 1; i <= listMazlicku.size(); i++) {
            System.out.println(i + ": " + listMazlicku.get(i-1).getJmeno());
        }
        int mazlicek = sc.nextInt();
        System.out.println(listMazlicku.get(mazlicek-1).toString());
    }

    public static void vypsatJmena() {
        for (int i = 0; i < listMazlicku.size(); i++) {
            if (i == listMazlicku.size()-1) {
                System.out.println(listMazlicku.get(i).getJmeno() + ".");
            }
            else {
                System.out.println(listMazlicku.get(i).getJmeno() + ", ");
            }
        }
    }
}