import Foundation
import Darwin

for a in 1 ..< 1000 {
    for b in 1 ..< 1000 {
        let test = sqrt(pow(Double(a),2) + pow(Double(b),2))
        if test == Double(Int(test)) {
            let c = Int(test)
            if c > b && b > a {
                if a + b + c == 1000 {
                    print("The product is \(a*b*c)")
                }
            }
        }
    }
}