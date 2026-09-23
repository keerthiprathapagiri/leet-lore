class Solution {
    public String simplifyPath(String path) {
        String[] res=path.split("/");
        Stack<String> s=new Stack<>();
        for(String i:res){
            if(i.equals("") || i.equals(".")){
                continue;
            }
            else if(i.equals("..")){
                if(!s.empty()){
                    s.pop();
            }}
            else{
                s.push(i);
            }
        }
        StringBuilder s1=new StringBuilder();
        for(String i:s){
            s1.append("/");
            s1.append(i);
        }
        if(s1.length()==0){
            return "/";
        }
        else{
            return s1.toString();
        }
        
    }
}
