//
//  P21.swift
//  
//
//  Created by Xin Jet Chew on 07/01/2017.
//
//

import Foundation
import Darwin

func sumOfDivisors(n: Int) -> Int {
    var sum: Int = 0
    if (n > 1) {
        for i in 1 ... n/2 {
            if n % i == 0 {
                sum += i
            }
        }
    }
    return sum
}

let limit = 10000

var sumOfAmiciablePairs: Int = 0

for a in 1 ... limit {
    let b = sumOfDivisors(n: a)
    if sumOfDivisors(n: b) == a && a != b {
        print("Amicable pair found: \(a), \(b)")
        sumOfAmiciablePairs += a
    }
}

print(sumOfAmiciablePairs)
