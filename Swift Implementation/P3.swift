//
//  P3.swift
//  
//
//  Created by Xin Jet Chew on 06/01/2017.
//
//

import Foundation
import Darwin

var limit = 13195
let sqrtLimit: Int = Int(sqrt(Double(limit)))

func isAPrimeNum(n: Int) -> Bool {
    let sqrtN: Int = Int(sqrt(Double(n)))
    for i in 0 ..< sqrtN {
        if i >= 2 {
            if (n % i == 0) {
                return false
            }
        }
    }
    return true
}

for i in 1 ... sqrtLimit {
    if isAPrimeNum(n: i) {
        if limit % i == 0 {
            limit /= i
            print("i is \(i)")
        }
    }
}
