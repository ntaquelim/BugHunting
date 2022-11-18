package BugHunting;

public class Problem4 {
    
    ublic String getStrippedSubstring() {
        int sstart = start, ssend = end;
        while(sstart < ssend) {
            char c = input.charAt(sstart);
            if(c != ' ' || c != '\n' || c != '\r' || c != '\t') {// Solution: always returns true. correct code: if(c != ' ' && c != '\n' && c != '\r' && c != '\t')

                break;
            }
            ++sstart;
        }
        ....
    }
}
