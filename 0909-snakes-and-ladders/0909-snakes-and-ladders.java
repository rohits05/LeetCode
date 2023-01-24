class Solution {
     public int snakesAndLadders(int[][] board) {
        int n = board.length, num = 1;
        int arr[][] = new int[board.length][board.length];
        boolean flag = false;
         
        for(int i=n-1; i>=0; i--){
            if(!flag){
                for(int j=0; j<n; j++){
                    arr[i][j] = num;
                num++;
                }
                flag = true;
            }else{
            for(int j=n-1; j>=0; j--){
                    arr[i][j] = num;
                num++;
            }
                flag = false;
            }
        }

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] != -1){
                    if(!map.containsKey(arr[i][j])) map.put(arr[i][j], board[i][j]);
                    else map.put(arr[i][j], board[i][j]);
                }
            }
        }
        System.out.println(map.size());

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        Set<Integer> set = new HashSet<Integer>();
        int dice = 0;
         
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                int value = queue.poll();
                if(value == n*n) return dice;
                
                for(int i=1; i<=6; i++){
                    int newVa = value + i;
                    if(!set.contains(newVa)){
                        if(map.containsKey(newVa)) queue.offer(map.get(newVa));
                        else queue.offer(newVa);
                        set.add(newVa);
                    }
                }
                size--;
            }
            dice++;
        }
        
        return -1;
    }
}