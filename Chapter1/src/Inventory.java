import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitarList;

    public Inventory() {
        this.guitarList = new ArrayList<>();
    }

    public List<Guitar> getGuitarList() {
        return guitarList;
    }

    public void addGuitar(Guitar guitar){
        guitarList.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar guitar: guitarList){
            if (serialNumber!=null && guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }

        return null;
    }


    public List search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();

        for (Guitar guitar: guitarList){
            if (guitar.getGuitarSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
