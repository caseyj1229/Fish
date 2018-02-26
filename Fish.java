import java.util.Stack;

public class Fish {
    public static int solution(int[] A, int[] B){
        Stack<Integer> survivors = new Stack<Integer>();

        for(int i =0; i < A.length; i++){
            if(survivors.isEmpty()){
                survivors.push(i);
            }
            else{
                //If the stack is not empty, and the direction of the fish is opposite, AND the size of the current fish is bigger
                //pop fish off the survivors stack as they are eaten
                while(!survivors.isEmpty() && B[i]-B[survivors.peek()] == -1 && A[survivors.peek()] < A[i]){
                    survivors.pop();
                }

                if(!survivors.isEmpty()){
                   //If the stack is not empty AND the fish are moving in the same direction
                   //push the current fish on as a survivor, since the fish is smaller than the one in front
                   if(B[i] - B[survivors.peek()] != -1){
                       survivors.push(i);
                   }
                }
                //The stack is empty as the current fish ate all the others
                //This fish is the only current survivor
                else{
                    survivors.push(i);
                }
            }
        }

        return survivors.size();
    }
}
