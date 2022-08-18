package ISP;

public class Main {
    public static void main(String[] args) {



      /*  Tək bir interfeys əvəzinə, istifadəsinə görə hissələrinə parçalanmış
        bir neçə interfeyslərlə əməliyyatları icra edirik.
        Hər interfeysin öz istifadə məqsədi olmalıdır.
        Bu prinsipin şərtlərinə uyğun olmayan interfeysə metod əlavə etmək və ya metodu dəyişdirmək istəsək,
        bu interfeysdən istifadə edən bütün sinifləri dəyişmək tələb olunur.
        İş prinsipi fərqli olan hər bir hissə üçün fərqli interfeys yaratmalıyıq.*/


        Chicken chicken =new Chicken();
        Sparrow sparrow = new Sparrow();

        chicken.breathe();
        chicken.eat();

        sparrow.breathe();
        sparrow.eat();
        sparrow.fly();
    }
}
