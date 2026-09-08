class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> map = new HashSet<>();

        for (int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            if(Character.isDigit(chr)){
                map.add(chr-'0');
            }else{
                continue;
            }
        }
        if(map.size()<2){
            return -1;
        }
        List<Integer> list = new ArrayList<>(map);
        Collections.sort(list);

        return list.get(list.size()-2);
    }
}