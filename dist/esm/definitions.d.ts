export interface FilePermissionPlugin {
    echo(options: {
        value: string;
    }): Promise<{
        value: string;
    }>;
    requestManageAllFilesPermission(): Promise<void>;
}
