package BugHunting;


public class Problem6 {

    char x = 128;

    private static byte char64(char x) {
        if ((int)x < 0 || (int)x > index_64.length) //Solution: should be (int)x >= index_64.length) 
          return -1;
        return index_64[(int)x];
      }
}
