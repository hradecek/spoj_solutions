nclude <iostream>
int main()
{
    int n;
    for(std::cin >> n; n != 42; std::cin >> n)
        std::cout << n << std::endl;
    return 0;
}

