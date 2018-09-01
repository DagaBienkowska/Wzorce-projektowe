package Singletony;

public class Player {

    private final String TAG = ConfigHelper.getConfig().getProperty("log.tag");

    private boolean isLoad;

    public void load(){
        isLoad = true;
    }

    public void reset(){
        isLoad = false;
    }

    public void play(){
        if (isLoad){
            System.out.println(TAG + " play pressed");
        }
    }
}
