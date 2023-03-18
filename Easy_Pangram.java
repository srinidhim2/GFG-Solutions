class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        boolean[] map = new boolean[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                map[str.charAt(i)-'a']=true;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                map[str.charAt(i)-'A']=true;
        }
        for(int i=0;i<26;i++)
            if(map[i]==false)   return false;
        return true;
        
    }
}
