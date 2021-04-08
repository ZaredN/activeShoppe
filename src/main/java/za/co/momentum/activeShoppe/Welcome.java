package za.co.momentum.activeShoppe;

public class Welcome {
    private long id;
    private String name;
    private int points;

    public Welcome(long id, String name, int points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
