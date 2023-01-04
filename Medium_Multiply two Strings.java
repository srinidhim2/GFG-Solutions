class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger m1 = new BigInteger(s1);
        BigInteger m2 = new BigInteger(s2);
        return (m1.multiply(m2)).toString();
    }
}
