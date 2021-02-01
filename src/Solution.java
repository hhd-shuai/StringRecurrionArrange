import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s){
        c = s.toCharArray();
        recursionArrange(0);
        return res.toArray(new String[res.size()]);
    }
    void recursionArrange(int start){
        if(start == c.length - 1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = start; i < c.length;i++){
            if(set.contains(c[i]))
                continue;
            set.add(c[i]);
            swap(i, start);
            recursionArrange(start + 1);
            swap(i, start);
        }
    }
    void swap(int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
