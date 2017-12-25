//
//  P7benchmark.swift
//  
//
//  Created by Xin Jet Chew on 09/01/2017.
//
//

import Foundation
import QuartzCore

func executionTimeInterval(block: () -> ()) -> CFTimeInterval {
    let start = CACurrentMediaTime()
    block();
    let end = CACurrentMediaTime()
    return end - start
}

func isAPrimeNum(n: Int) -> Bool {
    if n == 1 || (n != 2 && n % 2 == 0) {
        return false
    }
    else if n < 9 {
        return true
    }
    else {
        for i in 3 ... Int(sqrt(Double(n))) {
            if n % i == 0 {
                return false
            }
        }
    }
    return true
}

func numberOfPrime(num: Int) {
    var numOfPrimes = 0
    var i = 1
    while(numOfPrimes < num) {
        if isAPrimeNum(n: i) {
            numOfPrimes += 1
            //print("\(numOfPrimes): \(i) is a prime number")
        }
        i += 1
    }
}

let prime10001 = executionTimeInterval {
    numberOfPrime(num: 10001)
}

print("Time(ns): \(prime10001 * 1000000000)")
