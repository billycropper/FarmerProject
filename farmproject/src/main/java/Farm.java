import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    private FarmHouse farmHouse;
    private ArrayList<Field> fields = new ArrayList<Field>();

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
    public void addChickenCoop(ChickenCoop chickenCoop){
        chickenCoops.add(chickenCoop);
    }
    public void addStable(Stable stable){
        stables.add(stable);
    }
    public void addField(Field field){
        fields.add(field);
    }

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse, ArrayList<Field> fields) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "This Farm contains: " + stables +" and "+ chickenCoops + " and " +farmHouse + " and " + fields;
    }
}
