class Solution {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        ArrayList<ArrayList<Integer>> groupItems = new ArrayList<>();
        for(int i=0; i<m; i++) groupItems.add(new ArrayList<Integer>());

        int numberOfGroups = m;
        for(int i=0; i<group.length; i++){
            if(group[i] != -1) groupItems.get(group[i]).add(i);
            else{
                groupItems.add(new ArrayList<>());
                groupItems.get(numberOfGroups).add(i);
                group[i] = numberOfGroups;
                numberOfGroups++;
            }
        }
        
        int[] itemInDegrees = new int[n];
        int[] groupInDegrees = new int[numberOfGroups];
        ArrayList<Integer>[] itemOutNodes = new ArrayList[n];
        for(int i=0; i<n; i++) itemOutNodes[i] = new ArrayList<Integer>();

        for(int i=0; i<beforeItems.size(); i++){
            for(int before: beforeItems.get(i)){
                itemOutNodes[before].add(i);
                itemInDegrees[i]++;
                if(group[before] != group[i]) groupInDegrees[group[i]]++;
            }
        }

        int[] result = new int[n];
        int index = 0;

        Queue<Integer> groupQueue = new LinkedList<Integer>();
        for(int i=0; i<numberOfGroups; i++){
            if(groupInDegrees[i] == 0) groupQueue.offer(i);
        }

        while(!groupQueue.isEmpty()){
            int start = index;
            int currGroup = groupQueue.poll();
            Queue<Integer> queue = new LinkedList<>();
            
            for(int item: groupItems.get(currGroup)){
                if(itemInDegrees[item] == 0){
                    queue.offer(item);
                    result[index++] = item;
                }
            }
            
            while(!queue.isEmpty()){
                int curr = queue.poll();
                for(int next: itemOutNodes[curr]){
                    itemInDegrees[next]--;

                    if(group[curr] != group[next]){
                        groupInDegrees[group[next]]--;
                        if(groupInDegrees[group[next]] == 0) groupQueue.offer(group[next]);
                    }
                    else{
                        if(itemInDegrees[next] == 0){
                            queue.offer(next);
                            result[index++] = next;
                        }
                    }
                }
            }

            if(index-start != groupItems.get(currGroup).size()) return new int[0];
        }
        
        return ((index == n) ? result: new int[0]);
    }
}