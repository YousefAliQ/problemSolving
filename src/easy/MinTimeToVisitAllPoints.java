package easy;

public class MinTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int numSeconds = 0;

        for (int i = 0; i < points.length - 1; i++)
            numSeconds += Math.max(Math.abs((points[i][0] - points[i + 1][0])), Math.abs((points[i][1] - points[i + 1][1])));

        return numSeconds;
    }
}
