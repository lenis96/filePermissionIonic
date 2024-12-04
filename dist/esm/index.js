import { registerPlugin } from '@capacitor/core';
const FilePermission = registerPlugin('FilePermission', {
    web: () => import('./web').then((m) => new m.FilePermissionWeb()),
});
export * from './definitions';
export { FilePermission };
//# sourceMappingURL=index.js.map