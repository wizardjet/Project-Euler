import Foundation
import Darwin
import QuartzCore

func executionTimeInterval(block: () -> ()) -> CFTimeInterval {
    let start = CACurrentMediaTime()
    block();
    let end = CACurrentMediaTime()
    return end - start
}

func P9V2() {
    for a in 1 ..< 1000 {
        for b in a+1 ..< 1000 {
            let test = sqrt(pow(Double(a),2) + pow(Double(b),2))
            if test == Double(Int(test)) {
                let c = Int(test)
                if c > b {
                    if a + b + c == 1000 {
                        print("The product is \(a*b*c)")
                    }
                }
            }
        }
    }
}

let benchmark = executionTimeInterval {
    P9V2()
}

print("Time(ms): \(benchmark * 1000)")
