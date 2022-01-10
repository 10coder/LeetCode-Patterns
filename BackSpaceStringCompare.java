//https://leetcode.com/problems/backspace-string-compare/
public class BackSpaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        char[] schs=s.toCharArray();
        char[] tchs=t.toCharArray();

        StringBuilder sb= new StringBuilder();
        StringBuilder tb=new StringBuilder();

        return createString(s,sb,schs).equals(createString(t,tb,tchs));
        // return false;
    }

    //from the back count number of backspaces done and if cnt of backspace is 0 append to the result string
    public String createString(String s, StringBuilder sb,char[] schs) {
        int bk=0;
        for(int i=s.length()-1;i>=0;i--) {
            if(schs[i]=='#') {
                bk++;
            } else {
                if(bk!=0) {
                    bk--;
                } else {
                    sb.append(schs[i]);
                }
            }
        }
        return sb.toString();
    }
}
