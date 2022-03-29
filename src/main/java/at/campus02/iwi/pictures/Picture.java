package at.campus02.iwi.pictures;

public class Picture {

    public int lenght;
    public int width;

    public int totalPixels(){
        return lenght * width;
    }

    public int totalSize(int bytePerPixel){
        return bytePerPixel * totalPixels();
    }

    public void scale(double factor){
        lenght = (int)(lenght * factor);
        width *= factor;
    }

}
