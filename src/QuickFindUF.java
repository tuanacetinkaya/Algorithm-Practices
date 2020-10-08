public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i< N ; i++){
            id[i] = i;
        }
    }

    public void union(int p, int q){
        int pid = id[p];
        if(id[p] != id[q]){
            for(int i = 0; i < id.length; i++){
                if (id[i] == pid){
                    id[i] = id[q];
                }
            }
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }
}