//
//  P5.swift
//
//
//  Created by Xin Jet Chew on 08/01/2017.
//
//

import Foundation
import Darwin

let divisor = 20
var smallestNumber = 0
var flag: Bool = false

while (!flag) {
    for i in 1 ... divisor {
        if smallestNumber != 0 && smallestNumber % i == 0 {
            if i == divisor {
                flag = true
            }
        }
        else {
            smallestNumber += 1
            break
        }
        
    }
}

print(smallestNumber)



