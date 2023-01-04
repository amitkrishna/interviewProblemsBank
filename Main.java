import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    InterviewProblemOne interviewOne = new InterviewProblemOne();
    ArrayList<Integer> intArray = new ArrayList<>();
    intArray.add(3);
    intArray.add(33);
    intArray.add(10);
    intArray.add(9032);
    intArray.add(902);
    int res = interviewOne.solve(intArray, 3);
    System.out.println(res);
  }
}