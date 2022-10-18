#include <iostream>

namespace first
{
    int x = 1;
}

namespace second
{
    int x = 2;
}


int main()
{
    int x = 69;                     // [pointer]
    std::cout << second::x;         // [prefrix]::x 
    return 0;
}