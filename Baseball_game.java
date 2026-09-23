class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s1= new Stack <>();
        for(String i:operations){
            if(i.equals("+")){
                int first=s1.pop();
                int second=s1.peek();
                s1.push(first);
                s1.push(first+second);
            }
            else if(i.equals("D")){
                s1.push(s1.peek()*2);
            }
            else if(i.equals("C")){
                    s1.pop();
                

            }
        
        else{
                
                    s1.push(Integer.parseInt(i));
                }
            }
        
        int sum=0;
        for(int i:s1){
            sum+=i;
        }
        
    return sum;
        }
}

