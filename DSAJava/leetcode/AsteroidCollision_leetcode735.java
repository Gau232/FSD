package DSAJava;

import java.util.Stack;

public class AsteroidCollision_leetcode735 {
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        int arr2[] = asteroidCollision(arr);
        for (int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        for (int i=1; i<asteroids.length; i++) {
            if ( !(st.peek()>0 && asteroids[i]<0)) {
                st.push(asteroids[i]);
            }
            else if (st.peek()>0 && asteroids[i]<0) {
                if((st.peek() + asteroids[i]) > 0) {
                    continue;
                }
                else {
                    while (st.peek() + asteroids[i] <= 0){
                        st.pop();
                        if(st.isEmpty() || (st.peek() >= asteroids[i])){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int ans[] = new int[st.size()];
        int ans2[] = new int[st.size()];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i++;
        }
        int k = 0;
        for (int j=ans.length-1; j>=0; j--) {
            ans2[k] = ans[j];
            k++;
        }


        return ans2;
    }
}
