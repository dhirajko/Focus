package otherFile;

import com.example.dhiraj.focus2.CameraAdd;


public class Mode {
    private String name;
    private int iso;
    private  double shutterSpeed;
    private  double apeature;
    private  String info;


    public Mode(String name,int  iso, double shutterSpeed,double apeature) {
        this.name=name;
        this.iso=iso;
        this.shutterSpeed=shutterSpeed;
        this.apeature=apeature;
    }

    public  void additionalInfo(String info){
        this.info=info;
    }

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public double getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(double shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public double getApeature() {
        return apeature;
    }

    public void setApeature(double apeature) {
        this.apeature = apeature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
       return name;
    }
}
