class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        List<String> ips = new ArrayList<>();
        restoreIP(s, ips, ans, 0, 0);
        return ans;
    }

    public void restoreIP(String s,List<String> ips,List<String> ans,int no_of_packets,int ind){
        if(no_of_packets > 4) return;
        if(ind == s.length() && no_of_packets == 4){
            String res = formAddress(ips);
            ans.add(res);
            return;
        }

        for(int i=ind; i<s.length(); i++){
            String prefix = s.substring(ind, i+1);
            int val = Integer.parseInt(prefix);

            if(val>255) break;
            if(prefix.length() > 1 && prefix.charAt(0) == '0') break;

            else if(val >= 0 && val <= 255){
                prefix = '.' + prefix;
                ips.add(prefix);
                restoreIP(s, ips, ans, no_of_packets+1, i+1);
                ips.remove(ips.size()-1);
            }
        }
    }

    public String formAddress(List<String> ips){
        String str = "";
        for(String s:ips) str += s;
        return str.substring(1);
    }
}