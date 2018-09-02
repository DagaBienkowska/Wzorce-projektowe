package Observer;

public class Button {

    private OnClickListener listener;

    void click(){
        System.out.println("BzzzZzz");
        if (listener != null) {
            listener.onClick();
        }
    };
    void setListener(OnClickListener ocl){
        this.listener = ocl;
    };
    void removeListener(){
        this.listener = null;
    };
}
