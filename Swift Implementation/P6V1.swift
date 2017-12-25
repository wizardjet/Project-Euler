//
//  P6V1.swift
//  
//
//  Created by Xin Jet Chew on 08/01/2017.
//
//

import Foundation
import Darwin

let limit = 100

func square(n: Int) -> Int {
    return n*n
}

var sumOfSquares = 0
var squareOfSum = 0

for i in 1 ... limit {
    sumOfSquares += square(n: i)
    squareOfSum += i
}

print(abs(sumOfSquares - square(n: squareOfSum)))
