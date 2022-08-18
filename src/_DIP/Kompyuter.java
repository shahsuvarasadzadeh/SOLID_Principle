package DIP;

public class Kompyuter {


/*
    Dependency İnversion prinsipinə əsasən əsas siniflər(base class),
    törəmə siniflərdən(derived class) aslı olmamalıdır.
    Modullar arasında aslılığı idarə etmək üşün Dependency İnversion prinsipinin 2 əsas qaydası var:

    1.Üst səviyyəli modullar, alt səviyyəli modullara bağlı olmamalıdır.
    Hər ikisi abstraksiyaya(abstrakt siniflərə yaxud interfeysə) əsaslanmalıdır.

    2. Abstraksiyalar təfərrüatlardan deyildə, təfərrüatlar abstraksiyadan asılı olmalıdır.

    Siniflər arası asılılıqlar minimuma endirilməlidir,
    xüsusəndə üst siniflər(base class) alt siniflərdən(derived class) asılı olmamalıdır.
    Yəni, üst səviyyəli siniflərdə dəyişim olduqda, alt səviyyəli siniflər bu dəyişimə uyğunlaşmalıdır.
    Lakin, alt səviyyəli siniflərdə hər hansı dəyişim olduqda
    bu üst səviyyəli siniflərdə heç bir dəyişikliyə səbəb olmamalıdır.*/


    private final InMonitor inMonitor;
    private final Klaviatura klaviatura;


    public Kompyuter(InMonitor inMonitor, Klaviatura klaviatura){

        this.inMonitor = inMonitor;

        this.klaviatura = klaviatura;

    }


}
