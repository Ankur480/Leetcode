class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        for(int size: asteroids){
            boolean collide = false;
            while(!stack.isEmpty() && stack.peek() > 0 && size < 0)
            {
                if(Math.abs(size) > stack.peek())
                {
                    stack.pop();
                    continue;
                }
                else if(Math.abs(size)==stack.peek())
                {
                    stack.pop();
                }
                collide = true;
                break;
            }
            if(!collide)
            {
                stack.push(size);
            }
        }
        int[] finalasteroids = new int[stack.size()];
        for(int i= finalasteroids.length-1; i>=0;--i){
            finalasteroids[i] = stack.pop();
        }
        return finalasteroids;
    }

}