public class Cat {
    private String name;
    private int id;
    private int totalFeedAmount;
    private int totalWaterAmount;

    public Cat(String name, Count count) {
        this.name = name;
        this.id = count.getNextCount();
        this.totalFeedAmount = 0;
        this.totalWaterAmount = 0;
    }

    public void eat(Plate plate) {
        System.out.println(name + " ест из миски");
        totalFeedAmount += plate.getPortion();
    }

    public void drink(Bowl bowl) {
        System.out.println(name + " пьет из чашки");
        totalFeedAmount += bowl.getPortion();
    }
}
