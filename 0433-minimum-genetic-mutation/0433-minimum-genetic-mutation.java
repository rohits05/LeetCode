class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set = new HashSet<>();
        for(String s: bank) set.add(s);
        
        if(!set.contains(end)) return -1;
        
        Queue<String> q = new LinkedList<>();
        String gene ="ACGT";
        int steps = 0;
        q.offer(start);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int itr=0; itr<size; itr++) {
                String cur = q.poll();
                if(cur.equals(end)) return steps;

                char[] str = cur.toCharArray();
                for(int i=0; i<str.length; i++){
                    char temp = str[i];
                    for(char x: gene.toCharArray()) {
                        if(x==temp) continue;
                        str[i] = x;
                        String strnew = new String(str);
                        if(set.contains(strnew)) {
                            q.offer(strnew);

                        }
                    }
                    str[i] = temp;
                }
            }
            steps++;
        }
        return -1;
    }
}