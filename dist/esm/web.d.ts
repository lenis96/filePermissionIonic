import { WebPlugin } from '@capacitor/core';
import type { FilePermissionPlugin } from './definitions';
export declare class FilePermissionWeb extends WebPlugin implements FilePermissionPlugin {
    echo(options: {
        value: string;
    }): Promise<{
        value: string;
    }>;
    requestManageAllFilesPermission(): Promise<void>;
}
