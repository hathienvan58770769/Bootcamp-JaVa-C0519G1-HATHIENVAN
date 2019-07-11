package furama.library;

public class MusicTest {
    public static void main(String[] args) {
        Library<Music> musicGenericLibrary = new Library<Music>();
        Music song1 = new Music("Someone Like You", "John",2012,5,"Adele");
        Music song2 = new Music("Hello", "John",2014,5,"Adele");
        System.out.println("Add new songs to the library :");
        musicGenericLibrary.addElement(song1);
        musicGenericLibrary.addElement(song2);
        for (Music music : musicGenericLibrary.list) {
            System.out.println((music));
        }
        System.out.println("\n Delete songs in the library : ");
        musicGenericLibrary.removeElement(song2);
        for (Music music : musicGenericLibrary.list) {
            System.out.println((music));
        }
    }
}
