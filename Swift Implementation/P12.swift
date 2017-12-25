//
//  P12.swift
//  
//
//  Created by Xin Jet Chew on 17/01/2017.
//
//

import Foundation

var highestDivisorNum = 0
var index = 0
var triNum = 0

repeat {
    index += 1
    var numOfDivisors = 0
    triNum += index
    if triNum < 10 {
        numOfDivisors += 1
        for divisor in 0 ... triNum / 2  {
            if divisor > 0 {
                if triNum % divisor == 0 {
                    numOfDivisors += 1
                }
            }
        }
    }
    else {
        for divisor in 0 ..< Int(sqrt(Double(triNum))) {
            if divisor > 0 {
                if triNum % divisor == 0 {
                    numOfDivisors += 2
                }
            }
        }
    }
    if numOfDivisors > highestDivisorNum {
        highestDivisorNum = numOfDivisors
        print("Triangular number \(triNum) has \(highestDivisorNum) number of divisors")
    }
}
while(highestDivisorNum < 500)
