class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        
        int n1 = A.length();
        int n2 = B.length();
        if(n1==0) return B;
        if(n2==0) return A;
        
        int [] mp1 = new int[26];
        int [] mp2 = new int[26];
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : A.toCharArray())
        {
            mp1[ch-'a']++;
        }
        
        for(char ch : B.toCharArray())
        {
            mp2[ch-'a']++;
        }
 
        for(int i=0;i<26;i++)
        {
            if((mp1[i]!=0 && mp2[i]==0) || (mp1[i]==0 && mp2[i]!=0))
            {
                sb.append(Character.toString('a'+i));
            }
        }
        if(sb.length()==0) return "-1";
        
        return sb.toString();
    }
}
