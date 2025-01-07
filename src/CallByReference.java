public class CallByReference {
    public static void main(String[] args) {
        int a[]={1,22,33,33,22,444,9887};
        System.out.println("A= "+a[3]);
        change(a);
        System.out.println("A= "+a[3]);
    }
    private static void change(int[] a){
        a[3]=787;

    }

}