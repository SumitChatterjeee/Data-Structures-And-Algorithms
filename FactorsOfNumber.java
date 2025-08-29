public class Factor {
    public static boolean factorsofnumber(int n){
        int count=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
            count=count+2;
                //Means n/i is also a factor, so simply add;
            }
            if(count>2)return false;
        }
        return true;
    }
}
