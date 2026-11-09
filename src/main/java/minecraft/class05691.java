package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05691 extends class05724<class05681> {
   static final class01894 N = class01894.y("server_list/incompatible");
   static final class01894 y = class01894.y("server_list/unreachable");
   static final class01894 L = class01894.y("server_list/ping_1");
   static final class01894 u = class01894.y("server_list/ping_2");
   static final class01894 i = class01894.y("server_list/ping_3");
   static final class01894 R = class01894.y("server_list/ping_4");
   static final class01894 M = class01894.y("server_list/ping_5");
   static final class01894 B = class01894.y("server_list/pinging_1");
   static final class01894 Z = class01894.y("server_list/pinging_2");
   static final class01894 z = class01894.y("server_list/pinging_3");
   static final class01894 U = class01894.y("server_list/pinging_4");
   static final class01894 E = class01894.y("server_list/pinging_5");
   static final class01894 W = class01894.y("server_list/join_highlighted");
   static final class01894 m = class01894.y("server_list/join");
   static final class01894 P = class01894.y("server_list/move_up_highlighted");
   static final class01894 s = class01894.y("server_list/move_up");
   static final class01894 T = class01894.y("server_list/move_down_highlighted");
   static final class01894 b = class01894.y("server_list/move_down");
   static final Logger j = LogUtils.getLogger();
   static final ThreadPoolExecutor v = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new class07980(j)).build()
   );
   static final class00392 n = class00392.L("lanServer.scanning");
   static final class00392 t = class00392.L("multiplayer.status.cannot_resolve").y(-65536);
   static final class00392 G = class00392.L("multiplayer.status.cannot_connect").y(-65536);
   static final class00392 l = class00392.L("multiplayer.status.incompatible");
   static final class00392 d = class00392.L("multiplayer.status.no_connection");
   static final class00392 w = class00392.L("multiplayer.status.pinging");
   static final class00392 k = class00392.L("multiplayer.status.online");
   private final class05304 Y;
   private final List<class05692> Q = Lists.newArrayList();
   private final class05681 O = new class05714();
   private final List<class05697> g = Lists.newArrayList();

   private void L() {
      class05681 class05681x = this.method_25334();
      ArrayList arraylist = new ArrayList<>(this.Q);
      arraylist.add(this.O);
      arraylist.addAll(this.g);
      this.method_25314(arraylist);
      if (class05681x != null) {
         for (class05681 class05681x : arraylist) {
            if (class05681x.N(class05681x)) {
               this.method_25313(class05681x);
               break;
            }
         }
      }
   }

   public class05691(class05304 var1, class06202 var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.Y = var1;
   }

   public void y() {
   }

   public void method_25313(@Nullable class05681 var1) {
      super.method_25313(var1);
      this.Y.N();
   }

   public void N(List<class00068> var1) {
      int ix = var1.size() - this.g.size();
      this.g.clear();

      for (class00068 class00068 : var1) {
         this.g.add(new class05697(this.Y, class00068));
      }

      this.L();

      for (int lx = this.g.size() - ix; lx < this.g.size(); lx++) {
         class05697 class05697 = this.g.get(lx);
         int jx = lx - this.g.size() + this.method_25396().size();
         int kx = this.method_25337(jx);
         if (this.method_25319(jx) >= this.method_46427() && kx <= this.method_55443()) {
            this.field_22740.NT().L(class00392.N("multiplayer.lan.server_found", class05697.y()));
         }
      }
   }

   public void N(class04563 var1) {
      this.Q.clear();

      for (int ix = 0; ix < var1.L(); ix++) {
         this.Q.add(new class05692(this, this.Y, var1.N(ix)));
      }

      this.L();
   }

   @Override
   public int method_25322() {
      return 305;
   }
}
