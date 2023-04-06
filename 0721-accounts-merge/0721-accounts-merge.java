class Solution {
    static class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    DisjointSet(int n){
        for(int i=0; i<=n; i++){
            parent.add(i);
            size.add(1);
        }
    }

    public int findUparent(int node){
        if(node == parent.get(node)) return node;

        parent.set(node, findUparent(parent.get(node)));
        return parent.get(node);
    }

    public void unionBySize(int u,int v){
        int ultu = findUparent(u), ultv = findUparent(v);
        if(ultu == ultv)return;

        if(size.get(ultu) < size.get(ultv)){
            parent.set(ultu, ultv);
            size.set(ultv, size.get(ultu) + size.get(ultv));
        }else{
            parent.set(ultv, ultu);
            size.set(ultu, size.get(ultu) + size.get(ultv));
        }
    }
   }

   public List<List<String>> accountsMerge(List<List<String>> acc) {
        int n = acc.size();
        DisjointSet ds = new DisjointSet(n);
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            for(int j=1; j<acc.get(i).size(); j++){
                String mail = acc.get(i).get(j);
                if(!map.containsKey(mail)) map.put(mail , i);
                else ds.unionBySize(i, map.get(mail));
            }
        }

        List<String>[] merged = new ArrayList[n];
        for(int i=0; i<n; i++)
            merged[i] = new ArrayList<String>();

        for(Map.Entry<String , Integer> it : map.entrySet()){
            String mail = it.getKey();
            int node = ds.findUparent(it.getValue());
            merged[node].add(mail);
        }

        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(merged[i].isEmpty())continue;
            Collections.sort(merged[i]);
            List<String> temp = new ArrayList<>();
            temp.add(acc.get(i).get(0));
            
            for(String it: merged[i])
                temp.add(it);
            
            ans.add(temp);
        }
        return ans;
    }
}