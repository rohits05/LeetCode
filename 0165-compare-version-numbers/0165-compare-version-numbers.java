class Solution {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");
        int l1 = levels1.length, l2 =levels2.length;

        int len = Math.max(l1, l2);
        for(int i=0; i<len; i++){
            Integer v1 = i < l1 ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = i < l2 ? Integer.parseInt(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if(compare != 0) return compare;
        }
        
        return 0;
    }
}