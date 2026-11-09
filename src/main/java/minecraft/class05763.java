package minecraft;

import Nursultan.class10968;
import Nursultan.class11847;
import Nursultan.class11910;
import Nursultan.class11938;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class05763 extends class05096 implements ConnectScreenAccessor {
   private static final AtomicInteger Z = new AtomicInteger(0);
   static final Logger N = LogUtils.getLogger();
   private static final long z = 2000L;
   public static final class00392 y = class00392.L("connect.aborted");
   public static final class00392 L = class00392.N("disconnect.genericReason", class00392.L("disconnect.unknownHost"));
   @Nullable
   volatile class00642 u;
   @Nullable
   ChannelFuture i;
   volatile boolean R;
   final class05096 M;
   private class00392 U = class00392.L("connect.connecting");
   private long E = -1L;
   final class00392 B;

   private class05763(class05096 var1, class00392 var2) {
      super(class05153.N);
      this.M = var1;
      this.B = var2;
   }

   private static void N(class05096 var0, class06202 var1, class03420 var2, class04568 var3, boolean var4, class04254 var5, CallbackInfo var6) {
      class11938.z().N(class11847.N());
   }

   public static void N(class05096 var0, class06202 var1, class03420 var2, class04568 var3, boolean var4, @Nullable class04254 var5) {
      if ((class05096)var1.v_3 instanceof class05763) {
         N.error("Attempt to connect while already connecting");
      } else {
         class00392 class00392;
         if (var5 != null) {
            class00392 = class05220.j;
         } else if (var4) {
            class00392 = class03330.N;
         } else {
            class00392 = class05220.v;
         }

         class05763 class05763 = new class05763(var0, class00392);
         if (var5 != null) {
            class05763.N(class00392.L("connect.transferring"));
         }

         var1.y(false);
         var1.No();
         var1.N(class03415.N(var3.y));
         var1.Nl().N(class03371.field_44569, var3.y, var3.N);
         var1.N(class05763);
         class05763.N(var1, var2, var3, var5);
         N(var0, var1, var2, var3, var4, var5, null);
      }
   }

   private void N(class06202 var1, class03420 var2, class04568 var3, class04254 var4, CallbackInfo var5) {
      if (var3 != null) {
         class11910.N_6 = var3;
      }

      class11938.L().L(class10968.N(var2));
   }

   public final void N(class00392 var1) {
      this.U = var1;
   }

   private void N(class06202 var1, class03420 var2, class04568 var3, @Nullable class04254 var4) {
      this.N(var1, var2, var3, var4, null);
      N.info("Connecting to {}, {}", var2.N(), var2.y());
      class05740 class05740 = new class05740(this, "Server Connector #" + Z.incrementAndGet(), var2, var1, var3, var4);
      class05740.setUncaughtExceptionHandler(new class07980(N));
      class05740.start();
   }

   @Override
   public void method_25426() {
      this.method_37063(class05362.method_46430(class05220.i, var1 -> {
         synchronized (this) {
            this.R = true;
            if (this.i != null) {
               this.i.cancel(true);
               this.i = null;
            }

            if (this.u != null) {
               this.u.method_10747(y);
            }
         }

         this.field_22787.N(this.M);
      }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 120 + 12, 200, 20).N());
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25393() {
      if (this.u != null) {
         if (this.u.method_10758()) {
            this.u.method_10754();
         } else {
            this.u.method_10768();
         }
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      long ix = class07536.L();
      if (ix - this.E > 2000L) {
         this.E = ix;
         this.field_22787.NT().u(class00392.L("narrator.joining"));
      }

      var1.N(this.field_22793, this.U, this.field_22789 / 2, this.field_22790 / 2 - 50, -1);
   }
}
