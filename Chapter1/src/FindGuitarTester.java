import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes =
                new GuitarSpec(GuitarBuilderEnum.FENDER, "Stratocastor",
                        GuitarTypeEnum.ELECTRIC, GuitarWoodEnum.ALDER, GuitarWoodEnum.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getGuitarSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar(new Guitar("11277", 3999.95,
                new GuitarSpec(GuitarBuilderEnum.COLLINGS, "CJ", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.INDIAN_ROSEWOOD, GuitarWoodEnum.SITKA)));
        inventory.addGuitar(new Guitar("V95693", 1499.95,
                new GuitarSpec(GuitarBuilderEnum.FENDER, "Stratocastor", GuitarTypeEnum.ELECTRIC,
                        GuitarWoodEnum.ALDER, GuitarWoodEnum.ALDER)));
        inventory.addGuitar(new Guitar("V9512", 1549.95,
                new GuitarSpec(GuitarBuilderEnum.FENDER, "Stratocastor", GuitarTypeEnum.ELECTRIC,
                        GuitarWoodEnum.ALDER, GuitarWoodEnum.ALDER)));
        inventory.addGuitar(new Guitar("122784", 5495.95,
                new GuitarSpec(GuitarBuilderEnum.MARTIN, "D-18", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.MAHOGANY, GuitarWoodEnum.ADIRONDACK)));
        inventory.addGuitar(new Guitar("76531", 6295.95,
                new GuitarSpec(GuitarBuilderEnum.MARTIN, "OM-28", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.BRAZILIAN_ROSEWOOD, GuitarWoodEnum.ADIRONDACK)));
        inventory.addGuitar(new Guitar("70108276", 2295.95,
                new GuitarSpec(GuitarBuilderEnum.GIBSON, "Les Paul", GuitarTypeEnum.ELECTRIC,
                        GuitarWoodEnum.MAHOGANY, GuitarWoodEnum.MAHOGANY)));
        inventory.addGuitar(new Guitar("82765501", 1890.95,
                new GuitarSpec(GuitarBuilderEnum.GIBSON, "SG '61 Reissue", GuitarTypeEnum.ELECTRIC,
                        GuitarWoodEnum.MAHOGANY, GuitarWoodEnum.MAHOGANY)));
        inventory.addGuitar(new Guitar("77023", 6275.95,
                new GuitarSpec(GuitarBuilderEnum.MARTIN, "D-28", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.BRAZILIAN_ROSEWOOD, GuitarWoodEnum.ADIRONDACK)));
        inventory.addGuitar(new Guitar("1092", 12995.95,
                new GuitarSpec(GuitarBuilderEnum.OLSAN, "SJ", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.INDIAN_ROSEWOOD, GuitarWoodEnum.CEDAR)));
        inventory.addGuitar(new Guitar("566-62", 8999.95,
                new GuitarSpec(GuitarBuilderEnum.RYAN, "Cathedral", GuitarTypeEnum.ACOUSTIC,
                        GuitarWoodEnum.COCOBOLO, GuitarWoodEnum.CEDAR)));
        inventory.addGuitar(new Guitar("6 29584", 2100.95,
                new GuitarSpec(GuitarBuilderEnum.PRS, "Dave Navarro Signature", GuitarTypeEnum.ELECTRIC,
                         GuitarWoodEnum.MAHOGANY, GuitarWoodEnum.MAPLE)));
    }
}