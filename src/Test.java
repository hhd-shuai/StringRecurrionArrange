public class Test {
    public static void main(String[] args) {
        String s = "abccde";
        String s1 = "abc";
        System.out.println(s1);
        Solution solution = new Solution();
        String[] res = solution.permutation(s1);
        for(int i = 0;i < res.length;i++){
            System.out.println(res[i]);
        }
    }
}
