class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        
        for(char c: word.toCharArray()){
            freq[c-'a']++;
        }
        
        Arrays.sort(freq);
        int[] sortedfreq = new int[26];
        for(int i=0;i<26;i++){
            sortedfreq[i]=freq[25-i];
        }
        
        int totalPushes=0;
        
        for(int i=0;i<26;i++){
            if(sortedfreq[i] ==0) break;
            totalPushes +=(i/8+1)*sortedfreq[i];
        }
        
        return totalPushes;
    }
}