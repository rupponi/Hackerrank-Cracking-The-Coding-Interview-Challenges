#include <vector>
#include <iostream>

using namespace std;

vector<int> array_left_rotation(vector<int> a, int n, int k) {
	int x, y, z;
	for (x = 0; x < k; x++) {
		y = a.at(0);
		for (z = 0; z < n - 1; z++) {
			a.at(z) = a.at(z + 1);
		}
		a.at(n - 1) = y;
	}
	return a;
}

int main() {
	int n;
	int k;
	cin >> n >> k;
	vector<int> a(n);
	for (int a_i = 0; a_i < n; a_i++) {
		cin >> a[a_i];
	}
	vector<int> output = array_left_rotation(a, n, k);
	for (int i = 0; i < n; i++)
		cout << output[i] << " ";
	cout << endl;
	return 0;
}
