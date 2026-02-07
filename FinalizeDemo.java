class FinalizeDemo
{
    private void finalize()
    {
        System.out.println("object destroyed");
    }
    public static void main(String[] args)
    {
        FinalizeDemo f = new FinalizeDemo();
        f=null;
        System.gc();
    }
}
