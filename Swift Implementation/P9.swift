import Foundation
import Darwin

for a in 1 ..< 1000 {
    for b in 1 ..< 1000 {
        for c in 1 ..< 1000 {
            if (pow(Double(a),2) + pow(Double(b),2) == pow(Double(c),2)) {
                if a + b + c == 1000 {
                    print("The product is \(a*b*c)")
                }
            }
        }
    }
}