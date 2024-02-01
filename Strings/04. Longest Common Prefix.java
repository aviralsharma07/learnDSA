// Problem: https://leetcode.com/problems/longest-common-prefix/

StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        // Get the First and Last Strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for (int i=0; i<first.length; i++){
            if (first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
