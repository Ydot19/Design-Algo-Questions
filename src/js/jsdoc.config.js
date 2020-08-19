'use strict';

module.exports = {
    plugins: [
        'plugins/markdown',
        'plugins/summarize'
    ],
    source: {
        include: ["./core/leetcode/"]
    },
    opts:{
        destination: "./docs/"
    }
}
