import java.util.ArrayList;

public class InterviewProblemOne {
  int solve(ArrayList arr, int b) {
    int n = arr.size();
    System.out.println(arr);
    int ans = Integer.MIN_VALUE;
    // create a prefix sum
    ArrayList<Integer> pf_arr = new ArrayList<>();
    pf_arr.add( (Integer) arr.get(0));
    for(int i = 1; i<= arr.size()-1; i++){
      pf_arr.add((Integer)pf_arr.get(i-1)+ (Integer)arr.get(i)); 
    }
    System.out.println(pf_arr);
    for(int l=0; l<b; l++){
      int r= b-l;
      int rtIndex = n-r; 
    }
    
    return b;
  }
}
