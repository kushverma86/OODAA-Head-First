package version1;


public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside....");
        remote.pressButton();
        System.out.println("Fido is all done....");
        remote.pressButton();
        System.out.println("Fido is back inside...");
        remote.pressButton();


    }

}
