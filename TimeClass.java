/*2. Time Class with Add/Subtract 
Create a class Time that stores hours and minutes. Implement addition and subtraction 
of time with normalization. 
2h 75m should be converted to 3h 15m  */


public class Time {
    int h, m;
    Time(int h, int m) {
        this.h = h;
        this.m = m;
        normalize();
    }
    void normalize() {
        h += m / 60;
        m = m % 60;
    }
    Time add(Time t) {
        return new Time(h + t.h, m + t.m);
    }

    Time subtract(Time t) {
        return new Time(h - t.h, m - t.m);
    }

    void show() {
        System.out.println(h + "h " + m + "m");
    }
}

 class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(2, 75);
        Time t2 = new Time(1, 50);
        t1.add(t2).show();
        t1.subtract(t2).show();
    }
}
