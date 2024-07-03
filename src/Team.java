public class Team extends Football {
    private String name;


    public Team(League league, String name) {
        super(league);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    final public void goalScored() {
        System.out.println("We scored a goal!");
    }

    public void goalScored(int quantity) {
        System.out.println("In this game we scored " + quantity + " goals");
    }

    @Override
    public String toString() {
        return getName() + "-----" + getLeague();
    }
}

