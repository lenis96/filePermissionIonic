import Foundation

@objc public class FilePermission: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
