package technikum_wien.at.smartcity_indoornavigation.Entities;

import java.util.List;

public class GridPoint {
    private String idGridPoint;
    private String posX;
    private String posY;
    private List<AccessPoint> accessPoints;

    public GridPoint(String idGridPoint, String posX, String posY, List<AccessPoint> accessPoints) {
        this.idGridPoint = idGridPoint;
        this.posX = posX;
        this.posY = posY;
        this.accessPoints = accessPoints;
    }
}
