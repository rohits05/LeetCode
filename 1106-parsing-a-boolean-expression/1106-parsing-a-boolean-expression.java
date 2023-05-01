class Solution {
    public boolean parseBoolExpr(String expression) {    
        char c = expression.charAt(0);
        
        if(c == 't') return true;
        else if(c == 'f') return false;
        else if(c == '!')
            return !parseBoolExpr(expression.substring(2, expression.length()-1));
        else {
            List<Boolean> results = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            int numParens = 0;
            
            for(int i = 2; i < expression.length()-1; i++){
                char innerChar = expression.charAt(i);
                if(innerChar == '(') numParens++;
                else if(innerChar == ')') numParens--;
                else if(innerChar == ',' && sb.length() == 0) continue;
                sb.append(innerChar);
                
                if(numParens == 0){    
                    if(sb.length() == 1){
                        if(sb.toString().equals("t") || sb.toString().equals("f")){
                            results.add(parseBoolExpr(sb.toString()));
                            sb = new StringBuilder();
                        }
                    }else{
                        results.add(parseBoolExpr(sb.toString()));
                        sb = new StringBuilder();  
                    }
                }
            }
            
            if(c == '|'){
                for(boolean result : results){
                    if(result) return true;
                }
                return false;
            }else{
                for(boolean result: results){
                    if(!result) return false;
                }
                return true; 
            }   
        }
    }
}