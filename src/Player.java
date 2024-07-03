final public class Player extends Team {
    private PositionEnum positionEnum;
    private String citizenship;
    private int age;
    private double height, weight;

    public Player(League league, String name, PositionEnum positionEnum, String citizenship, int age, double height, double weight) {
        super(league, name);
        this.positionEnum = positionEnum;
        this.citizenship = citizenship;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public PositionEnum getPositionEnum() {
        return positionEnum;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void goalScored(int quantity) {
        if (quantity > 1) {
            System.out.println("In this game " + this.getName() + " scored " + quantity + " goals");
        } else if (quantity == 0) {
            System.out.println("In this game " + this.getName() + " scored a goal");
        } else {
            System.out.println(this.getName() + " didn't scored");
        }
    }

    @Override
    public String toString() {
        return getName() + "\nAge: " + getAge() + "\tCitizenship: " + getCitizenship()
                + "\nHeight: " + getHeight() + "(m)\nWeight: " + getWeight() + "(kg)";
    }
}
