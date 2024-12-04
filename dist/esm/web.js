import { WebPlugin } from '@capacitor/core';
export class FilePermissionWeb extends WebPlugin {
    async echo(options) {
        console.log('ECHO', options);
        return options;
    }
    async requestManageAllFilesPermission() {
        console.log("only android");
    }
}
//# sourceMappingURL=web.js.map