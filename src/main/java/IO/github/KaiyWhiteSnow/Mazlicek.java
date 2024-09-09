package IO.github.KaiyWhiteSnow;

import java.util.ArrayList;

public class Mazlicek {
    String jmeno;
    String druh;
    int vek;
    float vaha;

    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getDruh() {
        return druh;
    }
    public void setDruh(String druh) {
        this.druh = druh;
    }
    public int getVek() {
        return vek;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
    public float getVaha() {
        return vaha;
    }
    public void setVaha(float vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return String.format("Jméno: %s, Druh: %s, Věk: %d, Váha: %f", jmeno, druh, vek, vaha);
    }

    public static int prumernyVek(ArrayList<Mazlicek> listMazlicku) {
        int celkovyVek = 0;
        for (Mazlicek mazlicek : listMazlicku) {
            celkovyVek += mazlicek.getVek();
        }
        return celkovyVek / listMazlicku.size();
    }

    public static float prumernaVaha(ArrayList<Mazlicek> listMazlicku) {
        float celkovaVaha = 0.f;
        for (Mazlicek mazlicek : listMazlicku) {
            celkovaVaha += mazlicek.getVaha();
        }
        return celkovaVaha / listMazlicku.size();
    }

    public static String hledaniMazlickaDleJmena(ArrayList<Mazlicek> listMazlicku, String jmeno) {
        for (Mazlicek mazlicek : listMazlicku) {
            if (mazlicek.getJmeno().equals(jmeno)) {
                return mazlicek.toString();
            }
        }
        return "Nebyl nalezen mazlíček se jménem: " + jmeno;
    }

    public static ArrayList<Mazlicek> hledaniMazlickaDleDruhu(ArrayList<Mazlicek> listMazlicku, String druh) {
        ArrayList<Mazlicek> mazlickove = new ArrayList<>();
        for (Mazlicek mazlicek : listMazlicku){
            if (mazlicek.getDruh().equals(druh)) {
                mazlickove.add(mazlicek);
            }
        }
        return mazlickove;
    }

    public Mazlicek(String jmeno, String druh, int vek, float vaha) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
        this.vaha = vaha;
    }
}
