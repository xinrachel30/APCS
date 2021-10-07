public class BigSib {
    public String helloMsg;
    private String name;
    public BigSib(){
      helloMsg = "Word up";
    }
    public String greet(String x) {
        return helloMsg + " " + x;
    }
}
