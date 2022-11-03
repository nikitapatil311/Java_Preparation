package java_notes_practice;

public class Mix {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix[] mixes = new Mix[20];
        int i = 0;
        while (i < 19) {
            mixes[i] = new Mix();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;

        }
        System.out.println(count + "  " + mixes[1].counter);


    }

    public static int maybeNew(int index) {
        if (index < 1) {
            Mix mix = new Mix();
            mix.counter = mix.counter + 1;
            return 1;

        }
        return 0;
    }
}
