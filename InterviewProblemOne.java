import java.util.ArrayList;

public class InterviewProblemOne {
  int solve(ArrayList arr, int b) {
    int n = arr.size();
    int ans = Integer.MIN_VALUE;
    // create a prefix sum
    ArrayList<Integer> pf_arr = new ArrayList<>();
    pf_arr.add( (Integer) arr.get(0));
    for(int i = 1; i<= arr.size()-1; i++){
      pf_arr.add((Integer)pf_arr.get(i-1)+ (Integer)arr.get(i)); 
    }
    for(int l=0; l<b; l++){
      int r= b-l;
      int rtIndex = n-r;
      int sum_left = 0;
      int sum_right = 0;
      if(l != 0){
        sum_left = pf_arr.get(l-1);
      }
      if(r!=0){
        sum_right = pf_arr.get(n-1)- pf_arr.get(rtIndex-1);
      }
      ans = Math.max(ans, sum_left+ sum_right);
    }

    if(b == n){
      return pf_arr.get(n-1);
    }
    
    return ans;
  }
}
