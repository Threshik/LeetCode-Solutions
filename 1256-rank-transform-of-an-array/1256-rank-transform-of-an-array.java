
class Solution {
    public int[] arrayRankTransform(int[] a) {
        int[] dup = a.clone();
        Arrays.sort(dup);
        int n = a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(dup[i]))
            {
                map.put(dup[i],rank++);
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i]=map.get(a[i]);
        }
        return a;

    }
}