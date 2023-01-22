class Solution {
    Map<String,Boolean> palindromes = new HashMap<String,Boolean>();
	Map<Integer,List<Integer>> adj_map = new HashMap<Integer,List<Integer>>();
	List<List<String>> results;
	
	public List<List<String>> partition(String s) {
		results = new LinkedList<List<String>>();
		if(s == null || s.length() == 0) return results;	
		for(int i=0; i<s.length(); i++) adj_map.put(i, new LinkedList<Integer>());
		
		for(int i=1; i<=s.length(); i++){
			for(int j=i-1; j>=0; j--){
				if(isPalindromes(s.substring(j, i))) adj_map.get(j).add(i);
			}
		}
		
		resultBuilder(0, s.length(), s, new LinkedList<String>());
		return results;
	}
	
	private void resultBuilder(int start,int end,String s,List<String> result){
		if(start == end){
			results.add(new ArrayList<String>(result));
			return;
		}
        
		for(Integer i: adj_map.get(start)){
			result.add(s.substring(start, i));
			resultBuilder(i, end, s, result);
			result.remove(result.size()-1);
		}
	}
	
	public boolean isPalindromes(String s){
		if(palindromes.containsKey(s)) return palindromes.get(s);
		
		for(int i=0, j=s.length()-1; j>i; i++, j--){
			if(s.charAt(i) != s.charAt(j)){
				palindromes.put(s, false);
				return false;
			}
		}
        
		palindromes.put(s, true);
		return true;
	}
}