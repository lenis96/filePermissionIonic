'use strict';

var core = require('@capacitor/core');

const FilePermission = core.registerPlugin('FilePermission', {
    web: () => Promise.resolve().then(function () { return web; }).then((m) => new m.FilePermissionWeb()),
});

class FilePermissionWeb extends core.WebPlugin {
    async echo(options) {
        console.log('ECHO', options);
        return options;
    }
    async requestManageAllFilesPermission() {
        console.log("only android");
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    FilePermissionWeb: FilePermissionWeb
});

exports.FilePermission = FilePermission;
//# sourceMappingURL=plugin.cjs.js.map
