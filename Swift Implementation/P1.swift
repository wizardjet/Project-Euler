//
//  P1.swift
//  
//
//  Created by Xin Jet Chew on 06/01/2017.
//
//

import Foundation
import Darwin

let maxNum = 1000
var sum: Int = 0
for i: Int in 1 ..< maxNum {
    if (i % 3 == 0) {
        sum += i
    }
    else if (i % 5 == 0) {
        sum += i
    }
}

print("The sum is \(sum)")
