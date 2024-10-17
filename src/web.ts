import { WebPlugin } from '@capacitor/core';

import type { FilePermissionPlugin } from './definitions';

export class FilePermissionWeb extends WebPlugin implements FilePermissionPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
