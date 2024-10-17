// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "FilePermissionPlugin",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "FilePermissionPlugin",
            targets: ["FilePermissionPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "FilePermissionPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/FilePermissionPlugin"),
        .testTarget(
            name: "FilePermissionPluginTests",
            dependencies: ["FilePermissionPlugin"],
            path: "ios/Tests/FilePermissionPluginTests")
    ]
)