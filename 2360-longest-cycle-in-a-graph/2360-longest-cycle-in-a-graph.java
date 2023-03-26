class Solution {
    public int longestCycle(int[] edges) {
        int answer = -1;
        
        for(int i=0; i<edges.length; i++){
            int node =i, hare =edges[node], tortoise =node, cycleSize =1;
            
            while(tortoise != -1 && hare != -1){
                if(hare == tortoise){
                    tortoise = hare;
                    hare = edges[hare];
                    while(hare != tortoise){
                        cycleSize++;
                        tortoise = edges[tortoise];
                        hare = edges[hare];
                        hare = edges[hare];
                    }

                    if(answer < cycleSize) answer = cycleSize;
                    break;
                }else{
                    tortoise = edges[tortoise];
                    hare = edges[hare];
                    if(hare != -1) hare = edges[hare];
                }
            }

            int tmp =i, tmp2 =edges[i];
            while(tmp!=-1){
                tmp2 = edges[i];
                edges[tmp] = -1;
                tmp = tmp2;
            }
        }
        
        return answer;
    }
}