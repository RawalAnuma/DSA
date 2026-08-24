class Solution {
    public List<String> buildArray(int[] target, int n) {
        List <String> result = new ArrayList<>();
        int targetIndex = 0;
        for(int num = 1; num <= n; num++){
            result.add("Push");
            if(num != target[targetIndex]){
                result.add("Pop");
            }else{
                targetIndex++;
            }
            if(targetIndex == target.length){
                break;
            }
        }
        return result;
    }
}
