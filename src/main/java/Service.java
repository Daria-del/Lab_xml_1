public class Service {
    private String name;
    private int cost;

    public Service(){

    }
    public Service(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Услуга" + "\n" +
                "Название = " + name + '\n' +
                "Цена = " + cost
                ;
    }
}
