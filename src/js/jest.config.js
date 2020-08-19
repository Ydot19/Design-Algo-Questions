module.exports = {
    rootDir: __dirname,
    coverageThreshold: {
        global: {
            "function": 100,
            "branches": 100,
            "lines": 100,
            "statements": 90
        }
    },
    coverageReporters: ["lcov", "html"],
    collectCoverageFrom: [
        "<rootDir>/core/**/*.js"
    ],
    coverageDirectory: "build/coverage",
    watchPathIgnorePatterns: ['/node_modules/', '/dist/', '/.git/'],
    moduleFileExtensions: ['js', 'json'],
    testMatch: ["<rootDir>/test/**/*.test.js"]
}
