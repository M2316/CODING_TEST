class Solution {
    public String solution(String my_string, String overwrite_string, int s) {  
        
        char[] myCharList = my_string.toCharArray();
        char[] overCharList = overwrite_string.toCharArray();

        for(int i =0; i<my_string.length();i++){

            if(i < s){
                continue;
            }
            if(overwrite_string.length() > i-s){
                myCharList[i] = overCharList[i-s];
            }

        }

        String answer = new StringBuilder().append(myCharList).toString();
        
        return answer;
    }
}