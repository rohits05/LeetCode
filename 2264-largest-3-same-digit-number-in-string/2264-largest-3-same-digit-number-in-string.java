class Solution {
    public String largestGoodInteger(String num) {
        String[] stock = {"999","888","777","666","555","444","333","222","111","000"};
        
        for(String items: stock) if(num.indexOf(items) > -1) return items;
        return "";
    }
}