public class Main {
    public static void main(String[] args) {

        League laLiga = new League("Spain", 2, "La Liga");

        Team realMadrid = new Team(laLiga, "Real Madrid");
        Player bellingham = new Player(laLiga, "Jude Bellingham", PositionEnum.MIDFIELDER,
                "England", 21, 1.87, 75);
        Player vinicius = new Player(laLiga, "Vinicius Jr", PositionEnum.FORWARD,
                "Brazil", 23, 1.76, 73);

        Team[] teams = {realMadrid, bellingham, vinicius};

        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i]);
            if ((teams[i] instanceof Player)) {
                teams[i].goalScored(2);
            } else {
                teams[i].goalScored();
            }
        }

    }
}