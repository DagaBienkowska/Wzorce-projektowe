package Zadania.Observer;

public class Main {
    public static void main(String[] args) {

        Button button = new Button();
        button.setListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Click!!!!!");
            }
        });

        button.click();
        button.removeListener();
        button.click();


    }
}
