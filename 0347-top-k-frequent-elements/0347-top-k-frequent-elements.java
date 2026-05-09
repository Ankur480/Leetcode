class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> FrequencyCounter = new HashMap<>();
        for(int numbers: nums){
           FrequencyCounter.put(numbers, FrequencyCounter.getOrDefault(numbers, 0)+1);
        }
        List<int[]> FrequencyStore = new ArrayList<>();
        for(Map.Entry<Integer, Integer> x: FrequencyCounter.entrySet()) {
        		FrequencyStore.add(new int[] {x.getKey(),x.getValue()});
        }
        
        FrequencyStore.sort((a,b) -> b[1] - a[1]);
        
        int[] OutPutArray = new int[k];
        for(int i=0;i<k;++i) {
        		OutPutArray[i] = FrequencyStore.get(i)[0];
        		
        }
        
        
        return OutPutArray;
    }
}