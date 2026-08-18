class Solution {
    public String interpret(String command) {
        int n = command.length();
        String str="";
        for(int i=0;i<n;i++)
            {
                if(i+1<=n && command.substring(i,i+1).equals("G"))
                {
                    str+='G';
                }
                else if(i+2<=n && command.substring(i,i+2).equals("()"))
                {
                    str+="o";
                }
                else if(i+4<=n && command.substring(i,i+4).equals("(al)"))
                {
                    str+="al";
                }
            }
        return str;
    }
}