public class TersMatris {


    public static void main(String[] args) {
        tersMatris();
        tersMatris2();
    }

    private static void tersMatris() {
        int[][] matris = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = matris.length-1; i >= 0; i=i-1) {
            System.err.println("");
            for (int j = matris.length-1; j >=0 ; j=j-1) {
                System.err.print(matris[i][j]+" ");

            }
        }
    }

    private static void tersMatris2() {
        int[][] matris = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matris.length; i=i+1) {
            System.err.println("");
            for (int j = matris.length-1; j >=0 ; j=j-1) {
                System.err.print(matris[j][i]+" ");

            }
        }

    }
}
