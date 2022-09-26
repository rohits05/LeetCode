class Solution {
    int[] parent;
    public boolean equationsPossible(String[] equations) {
       parent=new int[26];
        for(int i=0;i<26;i++){
            parent[i]=i;
        }
        
        for(String str:equations){
            if(str.charAt(1)=='='){
               int v1=checkEquality(str.charAt(0)-'a') ;
               int v2=checkEquality(str.charAt(3)-'a');
                if(v1!=v2){
                   parent[v2] =v1;
                }
            } 
        }
        
         for(String str:equations){
            if(str.charAt(1)=='!'){
               int v1=checkEquality(str.charAt(0)-'a') ;
               int v2=checkEquality(str.charAt(3)-'a');
                if(v1==v2){
                   return false;
                }
            } 
        }
        return true;
    }
    
   private int checkEquality(int val){
       return parent[val]==val ? val : (parent[val]=checkEquality(parent[val]));
   }
}