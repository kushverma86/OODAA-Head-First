public class Jet extends Airplane {

    public static final int MULTIPLAYER = 2;

    public Jet(){
        super();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLAYER);
    }

    public void accelerate(){
        super.setSpeed(getSpeed() * 2);
    }
}
