public class Item {
    private String name;
    private String type;
    private Integer cost;
    private Integer availableQuantity;

    public Item() {}

    public Item(String name, String type, Integer cost, Integer availableQuantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getCost() {
        return cost;
    }

    public String getAvailableQuantity() {
        return availableQuantity > 0 ? "Available" : "Not Available";
    }
}