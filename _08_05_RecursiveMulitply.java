public class _08_05_RecursiveMulitply {
    public int multiply(int A, int B) {
        if (A > B) {
            return doMultiply(A, B);
        } else {
            return doMultiply(B, A);
        }
    }

    public int doMultiply(int A, int B) {
        if (A == 1) {
            return B;
        }

        return doMultiply(A - 1, B) + B;
    }
}
