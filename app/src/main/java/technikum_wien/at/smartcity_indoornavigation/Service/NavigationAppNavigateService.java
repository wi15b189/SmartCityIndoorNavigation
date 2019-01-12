package technikum_wien.at.smartcity_indoornavigation.Service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import technikum_wien.at.smartcity_indoornavigation.Entities.*;

public class NavigationAppNavigateService {

    public List<GridPoint> navigate (GridPoint destination, List<AccessPoint> accesPoints){
        List<GridPoint> temp = new LinkedList<GridPoint>();
        temp.add(new GridPoint("1","100","100"));
        temp.add(new GridPoint("2","100","200"));
        temp.add(new GridPoint("3","200","200"));
        return temp;
    }
}
