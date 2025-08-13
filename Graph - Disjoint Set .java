static class DisjointSet{
        int parent[];
        int size[];
        int rank[];
        DisjointSet(int n){
            parent=new int[n+1];
            size=new int[n+1];
            rank=new int[n+1];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
                rank[i]=0;
            }
        }    
        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]);
            }
            return parent[x];
          }
        public void UnionByRank(int x,int y){
           int a=find(x);
           int b=find(y);
        if(rank[a]<rank[b]){
            parent[a]=b;
        }
        else if(rank[a]>rank[b]){
            parent[b]=a;
        }
        else{
            parent[b]=a;
            rank[a]++;
        }
    }
