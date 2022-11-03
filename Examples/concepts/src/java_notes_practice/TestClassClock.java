package java_notes_practice;

class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
    String getTime() {
        return time;
    } }



public class TestClassClock {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
}
