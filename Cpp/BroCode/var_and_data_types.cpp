#include <iostream> 
int main()
{
    int i; // declared but not initialized;
    i = 5;

    int j = 10; // declared && init

    int value_ofSum = ( i+j );

    //std::cout << value_ofSum << '\n';
    //std::cout << "-------------------";
// ------------------------------------------------------------
    // integer ( whole number )
    int age = 21 ;
    int year = 2023 ;
    int days = 7.5 ;
    //std :: cout << days ;
    
// ------------------------------------------------------------
    // double ( number including decimal )
    double price = 10.99;
    double gpa = 2.5 ;
    double temperature = 25.1 ;




// ------------------------------------------------------------
    // single character
    char grade = ' A ' ;
    char initial = ' C ' ;
    char dollarSign = ' $ ' ;

// ------------------------------------------------------------
    // boolean ( true or false )
    bool student = false ;
    bool power = true ;
    bool forSale = true ;

// ------------------------------------------------------------
    // string ( objects that represents a sequence of text )
    std::string name = "bro";
    std::string day = "Mon";
    std::string food = "I live pizza";

    std::cout << "Hello" << name << '\n'; 


    return 0;    
}

