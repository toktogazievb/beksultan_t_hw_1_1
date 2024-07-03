public class League {
    private String leagueCountry;
    private int rankingUEFA;
    private String name;

    public League(String leagueCountry, int rankingUEFA, String name) {
        this.leagueCountry = leagueCountry;
        this.rankingUEFA = rankingUEFA;
        this.name = name;
    }

    public String getLeagueCountry() {
        return leagueCountry;
    }

    public int getRankingUEFA() {
        return rankingUEFA;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "League name: " + name + ", country: " + leagueCountry +
                ", UEFA ranking: " + rankingUEFA;
    }
}
