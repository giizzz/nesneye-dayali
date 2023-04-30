public class oop_1 {
    public static void main(String[] args) {
        ev ev1 = new ev();
        ev ev2 = new ev(2,6000);
        ev ev3 = new ev(4,150,12500);
        System.out.println("1. evin oda sayısı "+ev1.odaSayisi);
        System.out.println("2. evin kirası "+ev2.kira);
        System.out.println("3. evin metrekaresi "+ev3.metreKare);
    }
}