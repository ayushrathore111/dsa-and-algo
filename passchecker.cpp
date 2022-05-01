#include<iostream>
#include<regex>
using namespace std;
int main (){
    int strength = 0;
    cout << "enter password: " << endl;
    string pass;
    cin >> pass;
    if(regex_search(pass,regex("[A-Z]+"))){
        strength += 20;
    }
    if(regex_search(pass,regex("[a-z]+"))){
        strength += 20;
    }
    if(regex_search(pass,regex("[0-9]+"))){
        strength += 20;
    }
    if(regex_search(pass,regex("[~`!@#$%^&*<>+-=]+"))){
        strength += 20;
    }
    if(pass.length()>=8){
        strength += 20;

    }
    if(strength==100){
        cout << "VERY STRONG ! .." << endl;
    }
    else if(strength==80){
        cout << "STRONG ! .." << endl;
    }
    else if(strength==60){
        cout << "NORMAL ! .." << endl;
    }
    else if(strength==40){
        cout << "okok ! .." << endl;
    }
    else {
        cout << "weak ! .." << endl;
    }

    return 0;
}