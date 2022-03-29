package at.campus02.iwi.pictures;

public class PictureApp {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.width = 200;
        p.lenght = 100;

        System.out.println(p.totalPixels());
       int totalSize = p.totalSize(2);
        System.out.println(totalSize);
        p.scale(0.5);
        System.out.println(p.width + " " + p.lenght);

    }
}
