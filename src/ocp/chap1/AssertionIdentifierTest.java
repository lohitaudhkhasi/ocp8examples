package ocp.chap1;

public class AssertionIdentifierTest
{
    public void assert(int k)
    {
        System.out.println("k is "+k);
    }
    
    public static void main(String[] args)
    {
    	AssertionIdentifierTest  a = new AssertionIdentifierTest();
        a.assert(Integer.parseInt(args[0])); //4
    }
}

