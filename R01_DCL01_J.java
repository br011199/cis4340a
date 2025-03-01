class Vector {
    private int val = 1;

    public boolean isEmpty() {
        if (val == 1) { // Compares with 1 instead of 0
            return true;
        } else {
            return false;
        }
    }
    // Other functionality is same as java.until.Vector
}

// import java.until.Vector; omitted
public class VectorUser {
    public static void main(String[] args) {
        Vector v = new Vector();
        if (v.isEmpty()) {
            System.out.println("Vector is empty");
        }
    }
}