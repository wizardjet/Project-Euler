//
//  P2.swift
//  
//
//  Created by Xin Jet Chew on 06/01/2017.
//
//

import Foundation
import Darwin

let threshold = 4000000

var sum: Int = 2
var x: Int = 1
var y: Int = 2
var z: Int = 0

repeat {
    z = x + y
    x = y
    y = z
    if z % 2 == 0 {
        sum += z
    }
}
while (z < threshold)

print("The sum is \(sum)")
