package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inRub1 = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inRub1);
        boolean passed1 = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        float inRub2 = 720;
        float expectedDollar = 12;
        float outDollar = Converter.rubleToDollar(inRub2);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("720 rubles are 12 dollars. Test result : " + passed2);
    }
}
