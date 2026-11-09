package minecraft;

import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class04549 implements class07834 {
   private boolean Z;
   private boolean z;
   private long U;

   class04549(class04584 var1, class00642 var2, class04568 var3, Runnable var4, Runnable var5, InetSocketAddress var6, class03420 var7, class00606 var8) {
      super();
      this.B = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
      this.i = var6;
      this.R = var7;
      this.M = var8;
   }

   private void N(class07846 var1, CallbackInfo var2) {
      if (this.N instanceof IConnection iconnection) {
         this.y.viaFabricPlus$setTranslatingVersion(iconnection.viaFabricPlus$getTargetVersion());
      }
   }

   private void N(CallbackInfo var1) {
      ProtocolVersion protocolversion = this.N.viaFabricPlus$getTargetVersion();
      if (protocolversion != null && protocolversion.getVersion() == this.y.M) {
         this.y.M = class07529.L();
      }
   }

   @Override
   public void N(class07832 var1) {
      long ix = this.U;
      long j = class07536.L();
      this.y.R = j - ix;
      this.N.method_10747(class00392.L("multiplayer.status.finished"));
      this.u.run();
   }

   @Override
   public void N(class07846 var1) {
      this.N(var1, null);
      if (this.z) {
         this.N.method_10747(class00392.L("multiplayer.status.unrequested"));
      } else {
         this.z = true;
         class07806 class07806 = var1.N();
         this.y.u = class07806.N();
         class07806.L().ifPresentOrElse(var1x -> {
            var0.B = class00392.y(var1x.y());
            var0.M = var1x.L();
         }, () -> {
            var0.B = class00392.L("multiplayer.status.old");
            var0.M = 0;
         });
         class07806.y().ifPresentOrElse(var1x -> {
            var0.L = class04584.N(var1x.y(), var1x.N());
            var0.i = var1x;
            if (!var1x.L().isEmpty()) {
               ArrayList arraylist = new ArrayList(var1x.L().size());

               for (class08774 class08774 : var1x.L()) {
                  class05216 class05216;
                  if (class08774.equals(class02796.M)) {
                     class05216 = class00392.L("multiplayer.status.anonymous_player");
                  } else {
                     class05216 = class00392.y(class08774.y());
                  }

                  arraylist.add(class05216);
               }

               if (var1x.L().size() < var1x.y()) {
                  arraylist.add(class00392.N("multiplayer.status.and_more", var1x.y() - var1x.L().size()));
               }

               var0.Z = arraylist;
            } else {
               var0.Z = List.of();
            }
         }, () -> var0.L = class00392.L("multiplayer.status.unknown").N(class06541.field_1063));
         class07806.u().ifPresent(var2x -> {
            if (!Arrays.equals(var2x.N(), var0.L())) {
               var0.N(class04568.y(var2x.N()));
               var1x.run();
            }
         });
         this.U = class07536.L();
         this.N.method_10743(new class07839(this.U));
         this.N(null);
         this.Z = true;
      }
   }

   @Override
   public boolean method_48106() {
      return this.N.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
      if (!this.Z) {
         this.B.N(var1.N(), this.y);
         this.B.N(this.i, this.R, this.y, this.M);
      }
   }
}
