public class GuitarSpec {

    private GuitarBuilderEnum builder;
    private String model;
    private GuitarTypeEnum type;
    private GuitarWoodEnum backWood;
    private GuitarWoodEnum topWood;

    public GuitarSpec(GuitarBuilderEnum builder, String model, GuitarTypeEnum type, GuitarWoodEnum backWood, GuitarWoodEnum topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public GuitarBuilderEnum getBuilder() {
        return builder;
    }

    public GuitarWoodEnum getTopWood() {
        return topWood;
    }

    public GuitarTypeEnum getType() {
        return type;
    }

    public GuitarWoodEnum getBackWood() {
        return backWood;
    }

    public String getModel() {
        return model;
    }

    public boolean matches(GuitarSpec other_guitarSpec){
        if (this.builder != other_guitarSpec.builder)
            return false;
        if (this.model != null && !this.model.equals("") && !this.model.equals(other_guitarSpec.model))
            return false;
        if (this.type != other_guitarSpec.type)
            return false;
        if (this.backWood != other_guitarSpec.backWood)
            return false;
        if (this.topWood != other_guitarSpec.topWood)
            return false;

        return true;

    }
}
