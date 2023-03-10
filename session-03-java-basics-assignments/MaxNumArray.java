public class MaxNumArray {
    public static void main(String[] args) {
        int num[]={3,23,7,231,8,51,5,99,12};
                int maxno = num[0];
        for (int i=0;i<num.length; i++){
            if (num[i]>maxno) {
                maxno = num[i];
            }
        }
        System.out.println("maximum no is : "+maxno);
    }
}
