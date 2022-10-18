// #include <iostream>
// typedef std::string text_t;   // naming_convention = typedef (  ) name_t <~
// typedef int number_t;
// int main()
// {
//     text_t firstName = "Angel";
//     number_t age = 24;
//     std::cout << firstName <<"  " << age;
//     return 0; 
// } 


#include <iostream>
using str_t = std::string;
using num_t = int;
//using sout = std::cout;

int main()
{
    str_t name = "Angel ";
    num_t age = 24;

    std::cout << name << age;
    return 0;
}

// typedef = reserved keyword used to create an additional name
// ( alias ) for another data type .
// New identifier for an existing type
// Helps with readability and reduces typos
// Use when there is a clear benefit
// Replaced with ' using ' ( work better w / templates )