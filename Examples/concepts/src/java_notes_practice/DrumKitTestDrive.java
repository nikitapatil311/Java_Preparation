package java_notes_practice;

class DrumKit{
    boolean snare = true;
    boolean tophat = true;


    void playSnare(){
        System.out.println("bang bang ba-bang");

    }
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }


}

public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHat();

        d.snare = false;
        d.playTopHat();
        if(d.snare == true){
            d.playSnare();
        }

    }
}
