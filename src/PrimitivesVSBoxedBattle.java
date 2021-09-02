public class PrimitivesVSBoxedBattle {
    public static void main(String[] args) {
        System.out.println("Primitives: " + differencePrimitives());
        System.out.println("Boxed: " + differenceBoxed());
    }

    private static long differenceBoxed() {
        long before, after;
        before = System.currentTimeMillis();
        boxed();
        after = System.currentTimeMillis();
        return after - before;
    }

    private static long differencePrimitives() {
        long before, after;
        before = System.currentTimeMillis();
        primitives();
        after = System.currentTimeMillis();
        return after - before;
    }

    private static void primitives() {
        int testArr1[] = new int[1000000];
        int i = 0;
        for (int elem: testArr1) {
            elem = i + 100;
            ++i;
        }
    }

    private static void boxed() {
        Integer testArr[] = new Integer[1000000];
        Integer i = 0;
        for (Integer elem: testArr) {
            elem = i + 100;
            ++i;
        }
    }
}
