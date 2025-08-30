class SOE{ //Sieve of Eratosthenes(SOE)
    public boolean[] sieve;
        SOE(int n){
            sieve=new boolean[n+1];
            Prime(n);
        }
        public void Prime(int n){
            sieve[0]=true;
            sieve[1]=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(!sieve[i]){
                    int k=2;
                    int j=i;
                    while(j*k<=n){
                       if(!sieve[j*k]){
                           sieve[j*k]=true;
                       }
                       k++;
                    }
                }//false=prime,true=nonPrime
            }
        }
    }
