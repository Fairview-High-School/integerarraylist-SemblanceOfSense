public class Test {
    public static void main(String[] aStrings) {
        IntegerArrayList l = new IntegerArrayList();
        System.out.println("Intialize empty list. Expected output: []");
        System.out.println(l);

        System.out.println("Add to empty list. Expected output: [5]");
        l.add(5);
        System.out.println(l);
        l.add(15);
        l.add(25);

        System.out.println("Add value to index. Expected output : [5, 10, 15, 25]");
        l.add(1, 10);
        System.out.println(l);
        System.out.println("Add value below size. Expect Index out of bounds");
        try {
            l.add(-1, 55);
        } catch (Exception E) {
            System.out.println(E);
        }
        System.out.println("Add value above size. Expect Index out of bounds");
        try {
            l.add(15, 55);
        } catch (Exception E) {
            System.out.println(E);
        }

        System.out.println("Set value. Expected output: [5, 10, 15, 20]");
        l.set(3, 20);
        System.out.println(l);
        System.out.println("Set to index below size. Expect index out of bounds");
        try {
            l.set(-1, 55);
        } catch (Exception E) {
            System.out.println(E);
        }
        System.out.println("Set to index above size. Expect index out of bounds");
        try {
            l.set(15, 55);
        } catch (Exception E) {
            System.out.println(E);
        }

        System.out.println("Clear array. Expected output: []");
        l.clear();
        System.out.println(l);

        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println("Remove value. Expected output [5, 25]");
        l.remove(1);
        System.out.println(l);
        System.out.println("Remove index below size. Expect index out of bounds");
        try {
            l.remove(-1);
        } catch (Exception E) {
            System.out.println(E);
        }
        System.out.println("Remove index above size. Expect index out of bounds");
        try {
            l.remove(15);
        } catch (Exception E) {
            System.out.println(E);
        }

        System.out.println("Get index. Expected ouput: 25");
        System.out.println(l.get(1));
        try {
            l.get(-1);
        } catch (Exception E) {
            System.out.println(E);
        }
        try {
            l.get(15);
        } catch (Exception E) {
            System.out.println(E);
        }

        System.out.println("Get size. Expected output: 2");
        System.out.println(l.size());
        System.out.println("Get empty size. Expected output: 0");
        l.clear();
        System.out.println(l.size());

        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println("Check if empty. Expected output: false");
        System.out.println(l.isEmpty());
        System.out.println("Check if empty list is empty. Expected output: true");
        l.clear();
        System.out.println(l.isEmpty());

        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println("Check if list contains value in list. Expected output: true");
        System.out.println(l.contains(25));
        System.out.println("Check if list contains value not in list. Expected output: false");
        System.out.println(l.contains(55));

        System.out.println("Get index of value in list. Expected output: 1");
        System.out.println(l.indexOf(25));
        System.out.println("Get index of value not in list. Expeted ouput: -1");
        System.out.println(l.indexOf(55));

        System.out.println("Check if list equals equal list. Expected output: true");
        IntegerArrayList m = l;
        System.out.println(l.equals(m));
        System.out.println("Check if list equals not empty list. Expeted output: false");
        IntegerArrayList n = new IntegerArrayList();
        System.out.println(l.equals(n));
    }
}
