package ds.disjointSet;

public class DisjointSet {
    int[] set;
    int size;

    public DisjointSet(int n) {
        set = new int[n];
        size = n;
        for (int i = 0; i < n; i++)
            set[i] = -1;
    }

    public int find(int a) {
        if (set[a] == -1) return a;
        int root = find(set[a]);
        if (root != set[a])
            set[a] = root; // Path compression technique.
        return root;
    }

    public boolean union(int a, int b) {
        if (a < 0 || a >= size || b < 0 || b >= size) return false;
        int a1 = find(a);
        int b1 = find(b);
        if (a1 != b1) {
            set[a] = b1;
            return true;
        } else {
            System.out.println(a + " " + b + " Both are already in same");
            return false;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(i + " -> " + set[i]);
    }

    public static void main(String argv[]) {
        System.out.println("Hello disjoint set.");
        DisjointSet disjointSet = new DisjointSet(5);
        disjointSet.print();
        disjointSet.union(0, 1);
        disjointSet.union(1, 4);
        disjointSet.union(2, 3);
        disjointSet.union(3, 4);
        disjointSet.union(1, 3);
        System.out.println(disjointSet.find(0));
        System.out.println(disjointSet.find(1));
        System.out.println(disjointSet.find(4));
        System.out.println(disjointSet.find(2));
        System.out.println(disjointSet.find(3));
        disjointSet.print();

    }
}
