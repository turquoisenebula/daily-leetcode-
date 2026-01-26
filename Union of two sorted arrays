class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList = new ArrayList<>();
        
        for(int i: a) mySet.add(i);
        for(int i: b) mySet.add(i);
        
        for(int i: mySet) myList.add(i);
        
        Collections.sort(myList);
        
        return myList;
        
    }
}
