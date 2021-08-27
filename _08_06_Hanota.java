import java.util.List;

public class _08_06_Hanota {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        doMove(A.size(), A, B, C);
    }

    public void doMove(int size, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (size == 1) {
            C.add(0, A.remove(0));
            return;
        }
        doMove(size - 1, A, C, B);
        C.add(0, A.remove(0));
        doMove(size - 1, B, A, C);
    }
}
