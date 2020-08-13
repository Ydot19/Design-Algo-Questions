'use strict';

module.exports = {
    plugins: [
        'plugins/markdown',
        'plugins/summarize'
    ],
    source: {
        include: ["./core/Leetcode/"]
    },
    opts:{
        destination: "./docs/"
    }
}
