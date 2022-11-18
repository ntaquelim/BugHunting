package BugHunting;

public class Problem3 {

    protected PreDeConModel computeLocalModel(DoubleDBIDList neighbors, ....) {
        final int referenceSetSize = neighbors.size();
        ....
        // Shouldn't happen:
        if(referenceSetSize < 0) { // Solution: should be referenceSetSize <= 0 because you can't divide by 0 
            LOG.warning("Empty reference set – 
                should at least include the query point!");
            return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
        }
        ....
        for(int d = 0; d < dim; d++) {
            s[d] /= referenceSetSize;
            mvVar.put(s[d]);
        }
        ....
    }
}
