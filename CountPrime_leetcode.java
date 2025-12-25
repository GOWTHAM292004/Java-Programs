public class CountPrime_leetcode {
    public static void main(String args[]){
        CountPrime_leetcode obj=new CountPrime_leetcode();
        obj.countPrimes(10);
    }
    public int countPrimes(int n) {
        boolean [] isprime=new boolean[n];
        for(int i=2;i<n;i++){
            isprime[i]=true;
        }

        for (int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j+=i){
                isprime[j]=false;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isprime[i]){
                count++;
            }
        }
        return count;
    }
}
