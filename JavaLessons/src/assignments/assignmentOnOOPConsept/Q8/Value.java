package assignments.assignmentOnOOPConsept.Q8;

public class Value {

    int val;
    boolean modified;

    public Value() {
    }

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public boolean isModified() {
        return modified;
    }

    public void setVal(int x) {
        if(x != val){
            modified= true;
            val=x;
        }
        else this.modified=modified;

    }
}
