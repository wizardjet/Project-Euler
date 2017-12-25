//
//  P4V1.swift
//  
//
//  Created by Xin Jet Chew on 08/01/2017.
//
//

import Foundation
import Darwin

func isAPalindrome(n: Int) -> Bool {
    let s = String(n)
    for i in 0 ..< s.characters.count/2 {
        if s[s.index(s.startIndex, offsetBy: i)] != s[s.index(s.endIndex, offsetBy: -(i+1))] {
            return false
        }
    }
    return true
}

var largestPalindrome: Int = 0
for i in 1 ... 999 {
    for j in 1 ... 999 {
        let k = i * j
        if isAPalindrome(n: k) {
            if k > largestPalindrome {
                print("Largest palindrome is \(k)")
                largestPalindrome = k
            }
        }
    }
}
print("The largest palindrome is \(largestPalindrome)")
