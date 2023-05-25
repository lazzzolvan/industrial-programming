package lab9_2;

class Test
{
    // Проверяем, можно ли перейти в позицию (x, y) из
    // текущая позиция. Функция возвращает false, если ячейка
    // недействителен, имеет значение 0 или уже посещен.
    private static boolean isSafe(int[][] mat, boolean[][] visited, int x, int y) {
        return (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length) &&
                mat[x][y] == 1 && !visited[x][y];
    }

    // Находим максимально длинный маршрут в матрице `mat` из исходной ячейки
    // (i, j) в ячейку назначения (x, y).
    // `max_dist` —> отслеживать длину самого длинного пути от источника к
    // назначения.
    // `dist` —> длина пути от исходной ячейки до текущей ячейки (i, j).
    public static int findLongestPath(int[][] mat, boolean[][] visited, int i, int j,
                                      int x, int y, int max_dist, int dist)
    {
        // если пункт назначения невозможен из текущей ячейки
        if (mat[i][j] == 0) {
            return 0;
        }

        // если пункт назначения найден, обновить `max_dist`
        if (i == x && j == y) {
            return Integer.max(dist, max_dist);
        }

        // установить (i, j) ячейку как посещенную
        visited[i][j] = true;

        // переходим в нижнюю ячейку
        if (isSafe(mat, visited, i + 1, j))
        {
            max_dist = findLongestPath(mat, visited, i + 1, j, x, y,
                    max_dist, dist + 1);
        }

        // переходим в правую ячейку
        if (isSafe(mat, visited, i, j + 1))
        {
            max_dist = findLongestPath(mat, visited, i, j + 1, x, y,
                    max_dist, dist + 1);
        }

        // переходим в верхнюю ячейку
        if (isSafe(mat, visited, i - 1, j))
        {
            max_dist = findLongestPath(mat, visited, i - 1, j, x, y,
                    max_dist, dist + 1);
        }

        // переходим в левую ячейку
        if (isSafe(mat, visited, i, j - 1))
        {
            max_dist = findLongestPath(mat, visited, i, j - 1, x, y,
                    max_dist, dist + 1);
        }

        // возврат: удалить (i, j) из посещенной матрицы
        visited[i][j] = false;

        return max_dist;
    }

    // Обертка над функцией findLongestPath()
    public static int findLongestPathLength(int[][] mat, int i, int j, int x, int y)
    {
        // базовый случай: неверный ввод
        if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[x][y] == 0) {
            return -1;
        }

        // Матрица `M × N`
        int M = mat.length;
        int N = mat[0].length;

        // строим матрицу `M × N` для отслеживания посещенных ячеек
        boolean[][] visited= new boolean[M][N];

        // (i, j) — исходная ячейка, а (x, y) — конечная
        // координаты ячейки
        return findLongestPath(mat, visited, i, j, x, y, 0, 0);
    }

    public static void main(String[] args)
    {
        // входная матрица
        int mat[][] =
                {
                        { 0, 1, 1, 0, 0, 0},
                        { 1, 0, 0, 0, 0, 0},
                        { 1, 0, 0, 1, 1, 0},
                        { 0, 0, 1, 0, 0, 0},
                        { 0, 0, 3, 0, 0, 1},
                        { 0, 0, 0, 0, 1, 0},
                };

        // (0, 0) — исходная ячейка, а (5, 7) — конечная
        // координаты ячейки
        int max_dist = findLongestPathLength(mat, 0, 1, 5, 4);
        System.out.println("The maximum length path is " + max_dist);
    }
}