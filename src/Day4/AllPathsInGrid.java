package Day4;

import java.util.ArrayList;
import java.util.List;

public class AllPathsInGrid {
    public static List<String> findPaths(int m, int n) {
        List<String> result = new ArrayList<>();
        findPathsHelper(result, "", 0, 0, m, n);
        return result;
    }

    private static void findPathsHelper(List<String> result, String currentPath, int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            result.add(currentPath);
            return;
        }

        if (i < m - 1) {
            findPathsHelper(result, currentPath + "D", i + 1, j, m, n);
        }
        if (j < n - 1) {
            findPathsHelper(result, currentPath + "R", i, j + 1, m, n);
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        List<String> paths = findPaths(m, n);
        System.out.println("All paths in the grid:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
