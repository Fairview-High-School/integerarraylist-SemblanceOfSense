public class IntegerArrayList implements IntegerList{
    private Integer[] internalList;
    private Integer size;

    public IntegerArrayList() {
        this.size = 0;
        this.internalList = new Integer[10];
    }

    public void add(Integer val) {
        if (size >= internalList.length) {
            Integer[] biggerArray = new Integer[internalList.length * 2];
            for (Integer i = 0; i < internalList.length; i++) {
                biggerArray[i] = internalList[i];
            }
            this.internalList = biggerArray;
        }

        this.size++;
        this.internalList[size-1] = val;
    }

    public void add(int index, Integer val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        this.size++;

        if (size >= internalList.length) {
            Integer[] biggerArray = new Integer[internalList.length * 2];
            for (Integer i = 0; i < internalList.length; i++) {
                biggerArray[i] = internalList[i];
            }
            this.internalList = biggerArray;
        }

        for (int i = this.size - 1; i > index; i--) {
            this.internalList[i] = internalList[i - 1];
        }

        this.internalList[index] = val;
    }

    public void set(int index, Integer val) {
        this.internalList[index] = val;
    }

    public void clear() {
        this.internalList = new Integer[1];
        this.size = 0;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < this.size; i++) {
            this.internalList[i] = this.internalList[i+1];
        }

        this.size--;

        return 0; // Why??
    }

    public Integer get(int index) {
        return this.internalList[index];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size < 1;
    }

    public boolean contains(Integer val) {
        for (Integer i : this.internalList) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Integer val) {
        for (int i = 0; i < this.size; i++) {
            if (this.internalList[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(List<Integer> other) {
        for (int i = 0; i < this.size; i++) {
            if (!(other.get(i) == this.internalList[i])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String returnString = "[";
        for (int i = 0; i < size; i++) {
            returnString += this.internalList[i];
            if (!(i == size - 1)) {
                returnString += ",";
            }
        }
        returnString += "]";
        return returnString;
    }
}
