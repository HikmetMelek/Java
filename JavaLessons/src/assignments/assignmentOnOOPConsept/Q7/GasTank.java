package assignments.assignmentOnOOPConsept.Q7;

public class GasTank {
    double amount=0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double x) {
        if(amount+x>capacity)
            amount=capacity;
        else amount+=x;
    }

    public void useGas(double y) {
        if(amount-y<0)
            amount=0;
        else amount-=y;
    }

    public boolean isEmpty(){
        if(amount<0.1) return true;
        else return false;
    }

    public boolean isFull(){
        if(amount>capacity-0.1) return true;
        else return false;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        amount= capacity-amount;
        return capacity= capacity-amount;
    }

}
