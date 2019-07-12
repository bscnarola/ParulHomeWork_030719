public class ParulHomeWork {
    public static void main(String[] args) {

        ParulHomeWork dobj=new ParulHomeWork();
        dobj.cal();
    }

    public void cal()
    {
        int i=10;
        do
        {
            System.out.print(i+",");
            i--;
        }
        while (i>=0);
    }
}
