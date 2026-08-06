class Solution {
    public int smallestNumber(int n, int t) {
        int product=1;
        while(true){
                    int temp=n;

             product=1;
       while(temp!=0){
        int rem=temp%10;
        temp=temp/10;
        
         product=product*rem;
         
       } 
       if(product%t==0){
        return n;
       }else{
       n=n+1;

       }
        }
        
       
      
    }
}