package version1;

public class Remote {

    public DogDoor dogDoor;

    public Remote(DogDoor dogDoor)
    {
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if (dogDoor.isOpen())
            dogDoor.close();
        else
            dogDoor.open();
    }
}
