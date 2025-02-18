
public class VariableScope {
       static int globalCount = 100;

    public static void main(String[] args) {
             System.out.println("Global Count (from main): " + globalCount);
        showScope();     }

    public static void showScope() {
              
              System.out.println("Global Count (from showScope): " + globalCount);
        
              System.out.println("Local Count (from showScope): " + localCount);
    }
}
