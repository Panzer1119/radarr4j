function versionRegex (contents) {
    return RegExp('<version>([\\d\\.]+)</version>', 'm')
}

module.exports.readVersion = function (contents) {
    const matches = versionRegex(contents).exec(contents)
    if (matches === null) {
        throw new Error('Failed to read the version field in your xml file - is it present?')
    }
    return matches[1]
}

module.exports.writeVersion = function (contents, version) {
    return contents.replace(versionRegex(contents), () => {
        return `<version>${version}</version>`
    })
}