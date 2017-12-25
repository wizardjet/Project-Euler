//
//  P10.swift
//  
//
//  Created by Xin Jet Chew on 13/01/2017.
//
//

import Foundation

func isAPrime(n: Int) -> Bool {
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

let threshold = 2000000
var sum = 0

for i in 1 ..< threshold {
    if isAPrime(n: i) {
        sum += i
    }
}

print("The sum is \(sum)")
