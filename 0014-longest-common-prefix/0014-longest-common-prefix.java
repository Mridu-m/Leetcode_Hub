class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 0) return "";
        // String prefix = strs[0];
        // for(int i=1; i<strs.length; i++) {
        //     while(strs[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //         if(prefix.equals("")) return "";
        //     }
        // }
        // return prefix;
        if(strs.length == 0) return "";
        Arrays.sort(strs);
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++) {
            String str = strs[i];
            if(str.length() == 0) return str;
            for(int j=0; j<str.length(); j++) {
                if(j < prefix.length() && prefix.charAt(j) != str.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    if(prefix.length() == 0) return prefix;
                }
            }
        }
        return prefix;
    }
}