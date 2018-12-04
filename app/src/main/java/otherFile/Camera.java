package otherFile;

import com.example.dhiraj.focus2.CameraAdd;

import java.util.ArrayList;
import java.util.HashMap;;


public class Camera {
    private String model;
    private  HashMap<String,Mode> allMode;

    public Camera(String model) {
        this.model = model;
        this.allMode=new HashMap<>();
    }

    public void addMode(Mode mode) {
            this.allMode.put(mode.getName(),mode);
    }

    public void removeMode(String name) {
       this.allMode.remove(name);
    }

    public ArrayList<String> allMode(){

        ArrayList<String> allmode=new ArrayList<>(this.allMode.keySet());

        return  allmode;
    }

    public Mode getMode(String name){
        return this.allMode.get(name);
    }



}