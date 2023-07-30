class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int n = req_skills.length, m = people.size();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) map.put(req_skills[i], i);

        List<Integer>[] dp = new List[1 << n];
        dp[0] = new ArrayList<>();
        int[] skills = new int[m];

        for(int i=0; i<m; i++){
            List<String> list = people.get(i);
            int val = 0;
            for(String skill: list) val = (val | (1 << map.get(skill)));
            skills[i] = val;
        }

        for(int i=0; i<m; i++){
            int curr = skills[i];
            for(int j=0; j<dp.length; j++){
                if(dp[j] == null) continue;

                int comb = j | curr;
                if(dp[comb] == null || dp[j].size()+1 < dp[comb].size()) {
                    dp[comb] = new ArrayList<>(dp[j]);
                    dp[comb].add(i);
                }
            }
        }

        return dp[(1 << n) - 1].stream().mapToInt(i -> i).toArray();
    }
}