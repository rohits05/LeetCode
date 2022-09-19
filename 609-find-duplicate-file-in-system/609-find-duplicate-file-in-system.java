class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        for(String e : paths){
            String[] arr = e.split(" ");
            
            String dir = arr[0];
            
            for(int i=1; i<arr.length; i++){
                String str = arr[i];
                String[] file =  str.replace(")","(").split("\\(");
                String content = file[1];
                String fName = file[0];

                List<String> fList = map.getOrDefault(content,new ArrayList<String>());
                fList.add(dir+"/"+fName);
                map.put(content,fList);
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        for(List<String> e : map.values()) if(e.size()>1) res.add(e);
        return res;
    }
}