
package otherFile;
import java.util.ArrayList;
import java.util.HashMap;

public class CameraCollection {
    HashMap<String,Camera> hashMap;
    private  static CameraCollection cameraCollection=new CameraCollection();

    private CameraCollection() {
        this.hashMap=new HashMap<>();
    }
    public static CameraCollection getInstance(){
        return cameraCollection;
    }

    public void addCamera(String model) {
        if (!this.hashMap.containsKey(model)) {
            this.hashMap.put(model, new Camera(model));
        }
    }

    public Camera getCamera(String model){
        return this.hashMap.get(model);
    }

    public void removeCamera(String model){
        this.hashMap.remove(model);
    }


    public ArrayList<String> allCameraModel(){

        return new ArrayList<>(this.hashMap.keySet());
       }





}
