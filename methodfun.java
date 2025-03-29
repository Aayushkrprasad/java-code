class methodfun
{
    public static int sum(int a,int b)
    {
    return a+b;
    }
    public static int sum(int a,int b,int c)
    {
    return a+b+c;
    }
    public static void main(String[]args)
    {
        int r1 = sum(4,6);
        int r2 = sum(4,5,6);
        System.out.println("result is "+r1);
        System.out.println("result is "+r2);
    }
}