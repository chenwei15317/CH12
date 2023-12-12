public class Compute extends MyMath {

    private int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    }

    public int div(int a, int b) {
        if (b != 0) {
            ans = a / b;
            return ans;
        } 
        else {
            System.out.println("Cannot divide by zero.");
            return 0;  
        }

    }










}