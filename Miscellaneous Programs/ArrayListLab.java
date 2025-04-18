package Labs;

import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> allLessThanMean(ArrayList<Integer> data) {
        ArrayList<Integer> lessThanMean = new ArrayList<Integer>();
        int total = 0;
        double mean = 0;

        for (int value : data) {
            total += value;
        }

        mean = (double) total / data.size();

        for (int value : data) {
            if (value < mean) {
                lessThanMean.add(value);
            }
        }

        return lessThanMean;
    }

    public static ArrayList<Double> distancesFromMean(ArrayList<Integer> data) {
        int total = 0;
        double mean = 0;

        for (int value : data) {
            total += value;
        }

        mean = (double) total / data.size();

        ArrayList<Double> distances = new ArrayList<Double>();

        for (int value : data) {
            double distance = Math.abs(mean - value);
            distances.add(distance);
        }

        return distances;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> common = new ArrayList<Integer>();

        for (int value : list1) {
            if (list2.contains(value) && !common.contains(value)) {
                common.add(value);
            }
        }

        return common;
    }

    public static ArrayList<Integer> symmetricDiff(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> diff = new ArrayList<Integer>();

        for (int value : list1) {
            if (!list2.contains(value) && !diff.contains(value)) {
                diff.add(value);
            }
        }

        for (int value : list2) {
            if (!list1.contains(value) && !diff.contains(value)) {
                diff.add(value);
            }
        }

        return diff;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
}