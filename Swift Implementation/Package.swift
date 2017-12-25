//
//  Package.swift
//  
//
//  Created by Xin Jet Chew on 17/01/2017.
//
//

import PackageDescription

let package = Package(
    name: "lorenty-BigInt",
    dependencies: [
        .Package(url: "https://github.com/lorentey/BigInt.git", majorVersion: 2, minor: 1),
        ]
)
