#include <iostream>
#include <cmath>

int main()
{
    int sideA;
    int sideB;
    int res;

    std::cout << " Enter Side A: ";
    std::cin >> sideA;

    std::cout << "Enter side B: " ;
    std::cin >> sideB;

    res = sqrt(pow(sideA,2) + pow(sideB,2) );

    std::cout << "Results: " << res;
    return 0;
}