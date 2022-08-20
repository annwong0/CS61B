package lecture;

class lecture03_IntList {
    public int first;
    public lecture03_IntList rest;

    public lecture03_IntList(int f, lecture03_IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of this IntList. */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        /* Your code here. */
        int size = 0;
        lecture03_IntList l = this;
        while (l.rest != null) {
            size += 1;
            l = l.rest;
        }
        return size;
    }

    /* returns the ith item in the list */
    public int get(int i) {
        /* Your code here. */
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    /* Returns an IntList identical to L, but with all values incremented by x. */
    public static lecture03_IntList incrList(lecture03_IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return L;
        }
        return new lecture03_IntList(L.first + x, incrList(L.rest, x));
    }

    public static void main(String[] args) {
        lecture03_IntList L = new lecture03_IntList(5, null);
        L.rest = new lecture03_IntList(7, null);
        L.rest.rest = new lecture03_IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));
    }

}