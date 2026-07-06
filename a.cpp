#include <bits/stdc++.h>
using namespace std;

int main() {
    const int n = 1000;
    int a[n][n];

    auto start = std::chrono::high_resolution_clock::now();

    [
        [1 2 3]
        [4 5 6]
        [7 8 9]
    ]

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << a[i][j];    
        }
    }

    for (int j = 0; j < n; ++j) {
        for (int i = 0; i < n; ++i) {
            cout << a[i][j];
        }
    }

    auto end = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::microseconds>(end - start);
    std::cout << "Time taken: " << duration.count() << " microseconds" << std::endl;

    return duration.count();
}
