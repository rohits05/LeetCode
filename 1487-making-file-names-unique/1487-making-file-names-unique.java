class Solution {
    public String[] getFolderNames(String[] names) {
        int currId = 0;
        String[] sol = new String[names.length];
        Map<String, Integer> nameMap = new HashMap<>();

        for(String name: names){
            String addStr;
            if(!nameMap.containsKey(name)){
                nameMap.put(name, 1);
                addStr = name;
            }else{
                String str = name;
                int i = nameMap.get(str);
                while(nameMap.containsKey(str)){
                    str = name + '(' + i + ')';
                    i++;
                }
                
                addStr = str;
                nameMap.put(name, i);
                nameMap.put(addStr, 1);
            }
            sol[currId++] = addStr;
        }

        return sol;
    }
}