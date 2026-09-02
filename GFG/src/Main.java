//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int isPal(int n){

        int res=0;
        for(int i=5; i <=n; i=i*5){
            res = res + n/i;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 251;

        System.out.println(isPal(n));

    }
}