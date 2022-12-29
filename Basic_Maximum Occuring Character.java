class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] ch = new int[256];
        for(int i=0;i<line.length();i++){
            ch[line.charAt(i)]++;
        }
        int max=0;
        int c=0;
        for(int i=0;i<256;i++){
            if(ch[i]>max){
                max=ch[i];
                    c=i;
            }
        }
        return (char)c;
    }
    
}
