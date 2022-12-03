#include <iostream>

int main() {
	size_t n = 0;
	while(n < 10000000){
		n++;
		std::cout << n << ",";
	}
	std::cout << n << std::endl;
}