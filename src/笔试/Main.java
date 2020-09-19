#include <iostream>
#include <vector>

using namespace std;

        const int ARROWS = 4;
        const int RIGHT = 0;
        const int DOWN = 1;
        const int LEFT = 2;
        const int UP = 3;

        int main()
        {
        int m, n;

        // 输入数据
        cin >> m >> n;

        vector<vector<char> > matrix(m, vector<char>(n, ' '));

        // 填充处理
        int arrow = RIGHT, row = 0, col = 0;
        char c = 'A';
        for(int i=1; i<=m*n; i++) {
        matrix[row][col] = c;

        // 计算下一个字母
        if(++c > 'Z')
        c = 'A';

        // 计算下一个位置
        if(arrow == RIGHT) {
        if(col + 1 == n) {
        row++;
        arrow = (arrow + 1) % ARROWS;
        } else if(matrix[row][col+1] != ' ') {
        row++;
        arrow = (arrow + 1) % ARROWS;
        } else
        col++;
        } else if(arrow == DOWN) {
        if(row + 1 == m) {
        col--;
        arrow = (arrow + 1) % ARROWS;
        } else if(matrix[row+1][col] != ' ') {
        col--;
        arrow = (arrow + 1) % ARROWS;
        } else
        row++;
        } else if(arrow == LEFT) {
        if(col == 0) {
        row--;
        arrow = (arrow + 1) % ARROWS;
        } else if(matrix[row][col-1] != ' ') {
        row--;
        arrow = (arrow + 1) % ARROWS;
        } else
        col--;
        } else if(arrow == UP) {
        if(row == 0) {
        col++;
        arrow = (arrow + 1) % ARROWS;
        } else if(matrix[row-1][col] != ' ') {
        col++;
        arrow = (arrow + 1) % ARROWS;
        } else
        row--;
        }
        }

        // 输出结果
        for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++)
        cout << "   " << matrix[i][j];
        cout << endl;
        }

        return 0;
        }