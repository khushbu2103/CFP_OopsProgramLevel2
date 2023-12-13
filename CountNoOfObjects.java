package OopsProgramLevel2;

public class CountNoOfObjects {
    public static void main(String[] args) {
        CountNoOfObjects ob = new CountNoOfObjects();
        CountNoOfObjects ob2 = new CountNoOfObjects();
        CountNoOfObjects ob3 = new CountNoOfObjects();
        System.out.println("Number of object: " + count);
    }
    static int count;
    CountNoOfObjects()
    {
        count++;

    }

}
