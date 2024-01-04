public class TestArray {
    public static void main(String []args){
        int a[] = new int[5];
        a[0]=50;
        a[1]=100;
        a[2]=150;
        a[3]=200;
        a[4]=250;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("Length of array is "+ a.length);

        int b[]={10,20,30,40};
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println("Length of array is "+b.length);

        int c[]={1,2,3,4,5,6};
        for(int i:c){
            System.out.println(i);
        }
        System.out.println("Length of array "+c.length);
    }
}

