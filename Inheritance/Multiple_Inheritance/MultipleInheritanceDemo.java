

interface Camera {
    void takePhoto();
}
// Second parent interface
interface MusicPlayer {
    void playMusic();
}
// Child class implementing multiple interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo captured using smartphone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Music playing on smartphone");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();   // from Camera interface
        phone.playMusic();   // from MusicPlayer interface
    }
}
