package team.domain;

public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getDetailsForTeam() {
        return this.getMemberDetails() + "\tArchitect\t" +
                this.getBonus() + "\t" + this.getStock();
    }
    @Override
    public String toString() {
        return this.getDetails() + "\tArchitect\t" + this.getStatus() + "\t" + this.getBonus()+"\t"+ this.stock + "\t" + this.getEquipment().getDescription();
    }
}
