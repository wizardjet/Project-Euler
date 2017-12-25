//
//  P7.swift
//  
//
//  Created by Xin Jet Chew on 08/01/2017.
//
//

import Foundation
import Darwin

func isAPrimeNum(n: Int) -> Bool {
    if n == 1 || (n != 2 && n % 2 == 0) {
        return false
    }
    else if n == 2 || n == 3 || n == 5 || n == 7 {
        return true
    }
    else {
        for i in 2 ... Int(sqrt(Double(n))) {
            if n % i == 0 {
                return false
            }
        }
    }
    return true
}


var numOfPrimes = 0
var i = 1

while(numOfPrimes < 10001) {
    if isAPrimeNum(n: i) {
        numOfPrimes += 1
        print("\(numOfPrimes): \(i) is a prime number")
    }
    i += 1
}

//<3
