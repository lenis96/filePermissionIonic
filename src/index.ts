import { registerPlugin } from '@capacitor/core';

import type { FilePermissionPlugin } from './definitions';

const FilePermission = registerPlugin<FilePermissionPlugin>('FilePermission', {
  web: () => import('./web').then((m) => new m.FilePermissionWeb()),
});

export * from './definitions';
export { FilePermission };
