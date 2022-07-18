// checking arrays
class ArEx {
    void printarray(int a[])
    {
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


class Methods3 {
    public static void main(String[] ar)
    {
        int p[] = {10,15,30,50};
        ArEx obj = new ArEx();
        obj.printarray(p);
    }
}