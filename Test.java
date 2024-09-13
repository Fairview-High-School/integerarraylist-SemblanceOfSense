public class Test {
    public static void main(String[] aStrings) {
        IntegerArrayList l = new IntegerArrayList();
        System.out.println(l);

        l.add(5);
        System.out.println(l);
        l.add(15);
        l.add(25);

        l.add(1, 10);
        System.out.println(l);
        do {
            try {
                l.add(-1, 55);
            } catch (Error E) {
                System.out.println(E);
            }
        } while (false);
        try {
            l.add(15, 55);
        } catch (Error E) {
            System.out.println(E);
        }

        l.set(3, 20);
        System.out.println(l);
        try {
            l.set(-1, 55);
        } catch (Error E) {
            System.out.println(E);
        }
        try {
            l.set(15, 55);
        } catch (Error E) {
            System.out.println(E);
        }

        l.clear();
        System.out.println(l);

        l.add(5);
        l.add(15);
        l.add(25);

        l.remove(1);
        System.out.println(l);
        try {
            l.remove(-1);
        } catch (Error E) {
            System.out.println(E);
        }
        try {
            l.remove(15);
        } catch (Error E) {
            System.out.println(E);
        }

        l.get(1);
        System.out.println(l);
        try {
            l.get(-1);
        } catch (Error E) {
            System.out.println(E);
        }
        try {
            l.get(15);
        } catch (Error E) {
            System.out.println(E);
        }

        System.out.println(l.size());
        l.clear();
        System.out.println(l.size());

        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println(l.isEmpty());
        l.clear();
        System.out.println(l.isEmpty());

        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println(l.contains(25));
        System.out.println(l.contains(55));

        System.out.println(l.indexOf(25));
        System.out.println(l.indexOf(55));

        IntegerArrayList m = l;
        System.out.println(l.equals(m));
        IntegerArrayList n = new IntegerArrayList();
        System.out.println(l.equals(n));
    }
}
