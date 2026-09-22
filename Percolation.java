import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private WeightedQuickUnionUF uf;
    private boolean[] connected;
    private final int n;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) throws IllegalArgumentException {
        if (n <= 0) throw new IllegalArgumentException("ur a monkey");

        connected = new boolean[n*n+2];
        uf = new WeightedQuickUnionUF(n*n+2);
        this.n = n;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) throws IllegalArgumentException {
        int idx = n*(row-1) + col;
        if (idx <= 0 || idx >= n*n+2) throw new IllegalArgumentException("ur a monkey");
        connected[idx] = true;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) throws IllegalArgumentException {
        int idx = n*(row-1) + col;
        if (idx <= 0 || idx >= n*n+2) throw new IllegalArgumentException("ur a monkey");
        return connected[n*(row-1)+col];
    }
//
//    // is the site (row, col) full?
//    public boolean isFull(int row, int col) {
//
//    }
//
//    // returns the number of open sites
//    public int numberOfOpenSites() {
//
//    }
//
//    // does the system percolate?
//    public boolean percolates() {
//
//    }

    public static void main(String[] args) {

    }
}
