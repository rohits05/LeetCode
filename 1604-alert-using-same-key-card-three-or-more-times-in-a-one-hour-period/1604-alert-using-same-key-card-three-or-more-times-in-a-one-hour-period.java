class Solution {
    int convertTimeToInt(String keyTimeStr){
        return ((keyTimeStr.charAt(0) - '0') * 1000) 
                + ((keyTimeStr.charAt(1) - '0') * 100)
                + ((keyTimeStr.charAt(3) - '0') * 10)
                + (keyTimeStr.charAt(4) - '0');
    }
    
    boolean checkTime(LinkedList<Integer> timeList){
        boolean used = timeList.get(1) - timeList.get(0) <= 100;
        if(!used) return false;
        return timeList.get(2) - timeList.get(0) <= 100;
    }
    
    public List<String> alertNames(String[] keyName, String[] keyTime){
        Map<String, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<keyName.length; i++){
            List<Integer> li = map.getOrDefault(keyName[i], new ArrayList<>());
            li.add(convertTimeToInt(keyTime[i]));
            map.put(keyName[i], li);
        }

        List<String> res = new ArrayList<>();
        for(String name: map.keySet()){
            List<Integer> li = map.get(name);
            if(li.size() < 3) continue;
            
            Collections.sort(li);
            LinkedList<Integer> timeList = new LinkedList<>();
            for(int i=0; i<li.size(); i++){
                if(timeList.size() < 2) timeList.add(li.get(i));
                else{
                    timeList.add(li.get(i));
                    if(checkTime(timeList)){
                        res.add(name);
                        break;
                    }
                    timeList.removeFirst();
                }
            }
        }
       
		Collections.sort(res);
        return res;
    }
}