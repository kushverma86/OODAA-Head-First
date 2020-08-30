package ProductionDogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    boolean open;

    DogDoor(){
        this.open = false;
    }

    public boolean isOpen(){
        return open;
    }

    public void open(){
        System.out.println("The dog door opens");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }

}
