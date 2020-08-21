package version1;

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
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }

}
