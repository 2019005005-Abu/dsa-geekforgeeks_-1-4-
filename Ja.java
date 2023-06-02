import java.util.Scanner;
//Asymptotic Analysis
//This idea is to measure order of growth
//Does not depend upon machine,programming language etc
//No need  to important ,we can analyze algorithoms
public class  Ja{
   public static void main(String[] args) {
    System.out.println("I am Shahriar");
  
   }
   int fun1(int n){
    return n*(n+1)/2;
   }
   //Time Talem:C1
   int fun2(int n){
    int sum=0;
    for(int i=0;i<=n;i++){
      sum=+i;
    }
    return sum;
   }
   //Time Taken:C2n+C3
   int fun3(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        sum+=i;
      }
    }
    return sum;
    
   }
   //Time Taken:C4n3 +C5n

   //best,Average and Worsr Cases
   int getSum(int arr[],int n){
    int get_sum=0;
    for(int i=0;i<n;i++){
      get_sum+=arr[i];
      return get_sum;
    }
   }
  
    //Time Taken:C1n+C2
    //order of growth n or linear


    int getSum1(int arr[],int n){
      if(n%2==0){
        return 0;
      }else{
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
        }
        return sum;
      }
    }
    //Best case:Constant
    //Avarage case:Linear
    //Worst case:Linear

    //Order of Growth
    //a function f(n) is said to be  growing  faster 
    //than g(n) if
    // lim g(n)             | f(n) and g(n)  represent
    // ----------  = 0      | Time taken n>>0
    // n->f(n)              | f(n),g(n) >/0
                
    //or                   | f(n)=n=1
    //                      | g(n)=1000
    //lim f(n)
    //-----------
    //n-> g(n)


    /*
     *A function f(n) is said to be growing faster
      than g(n)
       lim g(n)
           ------= 0 
        n -> f(n)

        f(n)=n2=n+6
        g(n)=2n+5


        here,
        lim 2n+5
            ------
        n->  n2+n+6

        =lim  2/n+5/n2
        n->   -----------
              1+1/n+6/n2
        = lim 0+0
        n->   -----
             1+0+0
        = 0

         Direct way to find and cpmpare growth
         1.Ignore lower Order term
         2.Ignore Leading term  Constant

         Example:f(n) =2n2+n+6, order of growth(n2)
         Example:g(n)=100n+3 ,Order of growth(Linear)

         How do we Compare term?
         -----------------------------
         ---------------------------------
         -------------------------------------
         c<loglog^n<log^n<n^1/3 <n^1/2 <n <n^2 <n^3
         <n^4<2^n <n^n


     */
}