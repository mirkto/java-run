public class PrimitivesVSBoxedBattle {
    public static void main(String[] args) {
        long before, after, difPrimitives, difBoxed;

        before = System.currentTimeMillis();
        Primitives();
        after = System.currentTimeMillis();
        difPrimitives = after - before;

        before = System.currentTimeMillis();
        Boxed();
        after = System.currentTimeMillis();
        difBoxed = after - before;

        System.out.println("Primitives: " + difPrimitives);
        System.out.println("Boxed: " + difBoxed);
    }

    private static void Primitives() {
        int testArr[] = new int[10000000];

        int i = 0;
        for (int elem: testArr) {
            elem = i * 100;
            ++i;
        }
    }

    private static void Boxed() {
        Integer testArr[] = new Integer[10000000];

        int i = 0;
        for (Integer elem: testArr) {
            elem = i * 100;
            ++i;
        }
    }
}
