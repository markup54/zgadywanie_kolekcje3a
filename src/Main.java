public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //tablica
        //musi mieć z góry określony rozmiar
        //nie można go później zmienić
        //elementem tablicy mogą byc typy proste i złożone
        //tablica 6 elementowa z wartościami losowym z zakresu 1,100
        int [] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementów tablicy
        for (int element:tablicaLosowych) {
            System.out.print(element+", ");
        }
    }
}