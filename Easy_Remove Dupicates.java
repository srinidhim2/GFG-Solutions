class Solution {
    String removeDups(String S) {
        // code here
        String s="";
        int[] ch=new int[256]; 
        for(int i=0;i<S.length();i++){
            ch[S.charAt(i)]++;
            if(ch[S.charAt(i)]==1)
                s+=S.charAt(i);
        }
        return s;
    }
}
