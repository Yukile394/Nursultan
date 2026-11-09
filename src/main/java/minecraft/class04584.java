package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class class04584 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("multiplayer.status.cannot_connect").y(-65536);
   private final List<class00642> L = Collections.synchronizedList(Lists.newArrayList());

   public class04584() {
      super();
   }

   public void y() {
      synchronized (this.L) {
         Iterator<class00642> iterator = this.L.iterator();

         while (iterator.hasNext()) {
            class00642 class00642 = iterator.next();
            if (class00642.method_10758()) {
               iterator.remove();
               class00642.method_10747(class00392.L("multiplayer.status.cancelled"));
            }
         }
      }
   }

   public void N(InetSocketAddress var1, class03420 var2, class04568 var3, class00606 var4) {
   }

   private class00642 N(InetSocketAddress var1, class00606 var2, class02270 var3, Operation var4, LocalRef var5) {
      return this.N(var1, var2, var3, var4, (class04568)var5.get());
   }

   private class03420 N(String var1, Operation var2, LocalRef var3) {
      return this.N(var1, var2, (class04568)var3.get());
   }

   private class00642 N(InetSocketAddress var1, class00606 var2, class02270 var3, Operation var4, class04568 var5) {
      IServerData iserverdata = var5;
      if (iserverdata.viaFabricPlus$forcedVersion() != null && !iserverdata.viaFabricPlus$passedDirectConnectScreen()) {
         if (var3 == null) {
            var3 = new class02270(1);
         }

         var3.viaFabricPlus$setForcedVersion(iserverdata.viaFabricPlus$forcedVersion());
         iserverdata.viaFabricPlus$passDirectConnectScreen(false);
      }

      return (class00642)var4.call(new Object[]{var1, var2, var3});
   }

   public void N() {
      synchronized (this.L) {
         Iterator<class00642> iterator = this.L.iterator();

         while (iterator.hasNext()) {
            class00642 class00642 = iterator.next();
            if (class00642.method_10758()) {
               class00642.method_10754();
            } else {
               iterator.remove();
               class00642.method_10768();
            }
         }
      }
   }

   public static class00392 N(int var0, int var1) {
      class05216 class05216x = class00392.y(Integer.toString(var0)).N(class06541.field_1080);
      class05216 class05216x = class00392.y(Integer.toString(var1)).N(class06541.field_1080);
      return class00392.N("multiplayer.status.player_count", class05216x, class05216x).N(class06541.field_1063);
   }

   void N(class00392 var1, class04568 var2) {
      N.error("Can't ping {}: {}", var2.y, var1.getString());
      var2.u = y;
      var2.L = class05220.N;
   }

   public void N(class04568 var1, Runnable var2, Runnable var3, class00606 var4) throws UnknownHostException {
      String s = var1.y;
      Operation operation = var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.String]");
         return class03420.N((String)var0[0]);
      };
      LocalRefImpl localrefimpl1 = new LocalRefImpl();
      localrefimpl1.init(var1);
      class03420 class03420 = this.N(s, operation, localrefimpl1);
      var1 = (class04568)localrefimpl1.dispose();
      class03420 class03420x = class03420;
      Optional optional = class03459.N.N(class03420x).map(class03437::u);
      if (optional.isEmpty()) {
         this.N(class05763.L, var1);
      } else {
         InetSocketAddress inetsocketaddress = (InetSocketAddress)optional.get();
         Object object = null;
         Operation operation1 = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[java.net.InetSocketAddress, net.minecraft.class_12239, net.minecraft.class_9191]");
            return class00642.method_10753((InetSocketAddress)var0[0], (class00606)var0[1], (class02270)var0[2]);
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         class00642 class00642 = this.N(inetsocketaddress, var4, (class02270)object, operation1, localrefimpl);
         var1 = (class04568)localrefimpl.dispose();
         class00642 class00642x = class00642;
         this.L.add(class00642x);
         var1.u = class00392.L("multiplayer.status.pinging");
         var1.Z = Collections.emptyList();
         class04549 class04549 = new class04549(this, class00642x, var1, var2, var3, inetsocketaddress, class03420x, var4);

         try {
            class00642x.method_52903(class03420x.N(), class03420x.y(), class04549);
            class00642x.method_10743(class07848.N);
         } catch (Throwable throwable) {
            N.error("Failed to ping server {}", class03420x, throwable);
         }
      }
   }

   private class03420 N(String var1, Operation var2, class04568 var3) {
      return (class03420)var2.call(new Object[]{BedrockSettings.replaceDefaultPort(var1, var3.viaFabricPlus$forcedVersion())});
   }
}
