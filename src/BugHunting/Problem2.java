package BugHunting;

public class Problem2 {
    
    @Override
public double[] computeMean() {
    // Not supported except for singletons.
    return points.size() == 1 ? points.get(1) : null; // Solution: points.get should be with (0) and not (1) 
}

}
