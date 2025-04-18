public class zeroesDist {
    public static int zeroesDistance(double[] values) {
        int firstPos = 0;
        int lastPos = values.length - 1;
        boolean found = false;
        while (firstPos < values.length && !found) {
            if (values[firstPos] == 0) { // double[] a = { 3, 0, 1, 0, 4 };
                found = true;
            }

            else {
                firstPos++;
            }
        }

        if (!found) {
            return -1;
        }

        while (lastPos >= 0) {
            if (values[lastPos] == 0) {
                break;
            }

            else {
                lastPos--;
            }
        }

        return lastPos - firstPos;
    }
}