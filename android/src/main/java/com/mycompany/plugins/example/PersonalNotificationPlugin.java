package com.mycompany.plugins.example;

import com.getcapacitor.JSObject;
import com.getcapacitor.PermissionState;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

@CapacitorPlugin(
  name = "Notification",
  permissions = {
    @Permission(
      alias = "notifications",
      strings = {}
    )
  }
)
public class NotificationPlugin extends Plugin {

  @PluginMethod()
  public void getNotification(PluginCall call) {
    if (getPermissionState("notifications") == PermissionState.GRANTED) {
      JSObject ret = new JSObject();
      ret.put("value", "getNotification");
      notifyListeners("notificationEvent", ret);

    } else {
      call.reject("Enable notification is required");
    }
  }
}
