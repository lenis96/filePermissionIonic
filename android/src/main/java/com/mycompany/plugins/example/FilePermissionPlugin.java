package com.mycompany.plugins.example;

import android.net.Uri;
import android.os.Build;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.provider.Settings;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "FilePermission")
public class FilePermissionPlugin extends Plugin {

    private FilePermission implementation = new FilePermission();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void requestManageAllFilesPermission(PluginCall call) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (Environment.isExternalStorageManager()) {
                call.resolve();
            } else {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                    Uri uri = Uri.fromParts("package", getContext().getPackageName(), null);
                    intent.setData(uri);
                    startActivityForResult(call, intent, 0);
//                } else {
//                    call.resolve();
//                }
//                call.reject("MANAGE_EXTERNAL_STORAGE permission is not granted");
            }
        } else {
            call.resolve();
        }

    }

//    @PluginMethod
//    public void requestManageAllFilesPermission(PluginCall call) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            Context context = getContext();
//            if (!Settings.canDrawOverlays(context)) {
//                try {
//                    System.out.println("QUI PRIMERO");
////                    Uri uri = Uri.parse("package:" );
//                    Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION, Uri.parse("package:$packageName"));
//                    System.out.println("QUI SEGUNDO");
//
//                    context.startActivity(intent);
//                    System.out.println("QUI TERCERO");
//
//                } catch (Exception ex){
//                    System.out.println("ENTRO EN CATCH");
//                    System.out.println(ex);
//                    Intent intent = new Intent();
//                    intent.setAction(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
//                    context.startActivity(intent);
//                }
//                call.success();
//            } else {
//                call.reject("Permission already granted");
//            }
//        } else {
//            call.reject("Not required for Android versions below 11");
//        }
//    }
}
