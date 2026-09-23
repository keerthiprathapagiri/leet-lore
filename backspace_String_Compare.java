class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> c1=new Stack<>();
        Stack <Character> c2=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!c1.empty()){
                    c1.pop();
                }
            }
            else{
                c1.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
               if(!c2.empty()){
                    c2.pop();
                }
            }
            else{
                c2.push(c);
            }
        }
        if(c1.equals(c2)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}