class leetcode2221 {
    public int triangularSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i : nums) tempList.add(i);

        while (tempList.size() > 1) {
            ArrayList<Integer> currTemp = new ArrayList<>();

            for (int j = 0; j < tempList.size() - 1; j++) {
                int val = (tempList.get(j) + tempList.get(j + 1)) % 10;
                currTemp.add(val);
            }

            tempList = currTemp;
        }

        return tempList.get(0);
    }
}
