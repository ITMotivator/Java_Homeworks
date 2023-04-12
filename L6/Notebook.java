public class Notebook {
    private String modelName;
    private Integer ramSize;
    private Integer hardDiskSize;
    private String color;
    private String opSystem;

    public Notebook(String modelName, Integer ramSize, Integer hardDiskSize, String color, String opSystem) {
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
        this.color = color;
        this.opSystem = opSystem;
    }

    public Notebook(String modelName, Integer ramSize, Integer hardDiskSize) {
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public Integer getHardDiskSize() {
        return hardDiskSize;
    }

    public String getColor() {
        return color;
    }

    public String getOpSystem() {
        return opSystem;
    }

    @Override
    public String toString() {
        return String.format("%s %dGB RAM HDD %dGB %s", this.modelName,
                this.ramSize, this.hardDiskSize, this.color, this.opSystem);
    }
}
