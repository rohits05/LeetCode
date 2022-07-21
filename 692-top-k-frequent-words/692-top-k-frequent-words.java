class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Set<String>[] bucket = new Set[words.length+1];
        Map<String, Integer> freqMap = new HashMap<>();
        
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }
        for (String key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new TreeSet<>();
            }
            bucket[freq].add(key);
        }

        List<String> res = new ArrayList<>();
        for (int freq = words.length; freq >= 0; freq--) {
            if (bucket[freq] != null) {
                for (String word : bucket[freq]) {
                    res.add(word);
                    if (--k == 0) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}