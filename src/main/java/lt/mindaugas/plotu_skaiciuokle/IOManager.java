package lt.mindaugas.plotu_skaiciuokle;

import java.util.Scanner;

public class IOManager {

    private int pasirinktaFigura;
    private double krastine1;
    private double krastine2;

    public int getPasirinktaFigura() {
        return pasirinktaFigura;
    }

    public double getKrastine1() {
        return krastine1;
    }

    public double getKrastine2() {
        return krastine2;
    }

    public void suzinokFigura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pasirinkite, kuria figura norite skaiciuoti:");
        System.out.println("1. Kvadratas");
        System.out.println("2. Trikampis");
        System.out.println("3. Staciakampis");
        System.out.println("4. Skritulys");
        pasirinktaFigura = scanner.nextInt();
    }

    public void suzinokKrastines(){
        Scanner scanner = new Scanner(System.in);
        switch (pasirinktaFigura){
            case 1 -> {
                System.out.println("Iveskite krastines ilgi:");
                krastine1 = scanner.nextDouble();
            }
            case 2 -> {
                System.out.println("Iveskite statinio 1 ilgi:");
                krastine1 = scanner.nextDouble();
                System.out.println("Iveskite statinio 2 ilgi:");
                krastine2 = scanner.nextDouble();
            }
            case 3 -> {
                System.out.println("Iveskite krastines 1 ilgi:");
                krastine1 = scanner.nextDouble();
                System.out.println("Iveskite krastines 2 ilgi:");
                krastine2 = scanner.nextDouble();
            }
            case 4 -> {
                System.out.println("Iveskite spindulio ilgi:");
                krastine1 = scanner.nextDouble();
            }
            default -> {
                System.out.println("Tokios figuros ploto skaiciuoti nemoku");
            }
        }
    }

    public void spausdinkPlota(String str){
        System.out.println(str);
    }

}
