//
//  P6.swift
//  
//
//  Created by Xin Jet Chew on 08/01/2017.
//
//

import Foundation
import Darwin

let limit = 100

func sumOfSquares(limit: Int) -> Int {
    var sum = 0
    for i in 1 ... limit {
        sum += square(n: i)
    }
    return sum
}

func squareOfSum(limit: Int) -> Int {
    var sum = 0
    for i in 1 ... limit {
        sum += i
    }
    return square(n: sum)
}

func square(n: Int) -> Int {
    return n*n
}

print(abs(sumOfSquares(limit: limit) - squareOfSum(limit: limit)))
