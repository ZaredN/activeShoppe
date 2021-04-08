package za.co.momentum.activeShoppe.model;

import java.util.ArrayList;
import java.util.List;

public class MomentumClient {
    private String name;
    private String clientId;
    private int points;

    public MomentumClient(String name, String clientId, int points) {
        this.name = name;
        this.clientId = clientId;
        this.points = points;
    }

    public MomentumClient() {

    }

    public String getName() {
        return name;
    }

    public String getClientId() {
        return clientId;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setPoints(int points) {
        this.points = points;
    }



}
