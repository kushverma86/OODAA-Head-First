import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Instrument> instrumentList;

    public Inventory() {
        this.instrumentList = new ArrayList<>();
    }

    public List<Instrument> getGuitarList() {
        return instrumentList;
    }

    public void addInstrument(Instrument instrument){
        instrumentList.add(instrument);
    }

    public Instrument getInstrument(String serialNumber){
        for(Instrument instrument: instrumentList){
            if (serialNumber!=null && instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }

        return null;
    }


    public List search(GuitarSpec searchSpec) {
        List<Instrument> matchingInstruments = new ArrayList<>();
        for (Instrument instrument: instrumentList){
            Guitar guitar = (Guitar)instrument;
            if (guitar.getInstrumentSpec().matches(searchSpec))
                matchingInstruments.add(guitar);
        }
        return matchingInstruments;
    }

    public List search(MandolinSpec searchSpec) {
        List<Instrument> matchingInstruments = new ArrayList<>();
        for (Instrument instrument: instrumentList){
            Mandolin guitar = (Mandolin) instrument;
            if (guitar.getInstrumentSpec().matches(searchSpec))
                matchingInstruments.add(guitar);
        }
        return matchingInstruments;
    }
}
