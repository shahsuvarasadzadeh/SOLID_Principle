package _LSP;

public class Main {
    public static void main(String[] args) {


        // Bu prinsip obyektlərin öz alt tipləri ilə əvəz edilə bilməsini müəyyən edir.
        // Kodumuzda heç bir əlavə dəyişiklik aparılmadan, alt sinifləri(derived class),
        // törədikləri üst sinflərin(base class) əvəzinə istifadə edə bilməliyik.

        Canli heyvan =new Heyvan();
        Canli insan = new Insan();

        heyvan.nefesAlir();
        insan.nefesAlir();



    }
}
