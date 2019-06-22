package test14;

import java.util.Objects;

public class Game {
    private  String prriod;
    private  String   year;
    private  String hostPlace;
    private String champion;

    public String getPrriod() {
        return prriod;
    }

    public void setPrriod(String prriod) {
        this.prriod = prriod;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHostPlace() {
        return hostPlace;
    }

    public void setHostPlace(String hostPlace) {
        this.hostPlace = hostPlace;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(prriod, game.prriod) &&
                Objects.equals(year, game.year) &&
                Objects.equals(hostPlace, game.hostPlace) &&
                Objects.equals(champion, game.champion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prriod, year, hostPlace, champion);
    }

    @Override
    public String toString() {
        return "Game{" +
                "prriod='" + prriod + '\'' +
                ", year='" + year + '\'' +
                ", hostPlace='" + hostPlace + '\'' +
                ", champion='" + champion + '\'' +
                '}';
    }

    public Game(String prriod, String year, String hostPlace, String champion) {
        this.prriod = prriod;
        this.year = year;
        this.hostPlace = hostPlace;
        this.champion = champion;
    }

    public Game() {

    }
}
