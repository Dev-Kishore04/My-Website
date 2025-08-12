public class App {
    public static void main(String[] args){
      int n=0;
      int a=0;
      int b=1;
      while(n<100){
        System.out.print(n + " ");
        a=b;
        b=n;
        n=a+b;
      }
    }
  }