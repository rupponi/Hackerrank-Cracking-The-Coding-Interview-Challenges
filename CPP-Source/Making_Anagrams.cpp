//CRACKING THE CODING INTERVIEW CHALLENGES: MAKING ANAGRAMS (C++)

#include <string>
#include <vector>
#include <iostream>

using namespace std;

int number_needed(string a, string b) {
	vector<int> letterSetA(26);
	vector<int> letterSetB(26);
	int deletionCount = 0;

	for (int x = 0; x < a.length(); x++) {
		int arrValue = (int)a.at(x);
		letterSetA.at(arrValue - 97)++;
	}
	for (int y = 0; y < b.length(); y++) {
		int arrValue = (int)b.at(y);
		letterSetB.at(arrValue - 97)++;
	}

	for (int z = 0; z < 26; z++) {
		if (letterSetA[z] > letterSetB[z]) {
			deletionCount += (letterSetA[z] - letterSetB[z]);
		}
		if (letterSetA[z] < letterSetB[z]) {
			deletionCount += (letterSetB[z] - letterSetA[z]);
		}
	}

	return deletionCount;
}

int main() {
	string a;
	cin >> a;
	string b;
	cin >> b;
	cout << number_needed(a, b) << endl;
	return 0;
}
