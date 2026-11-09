package minecraft;

import org.jspecify.annotations.Nullable;

public class class05131 extends class05096 {
   private static final int N = 1024;
   private static final int y = 65535;
   private static final class00392 L = class00392.L("selectWorld.allowCommands");
   private static final class00392 u = class00392.L("selectWorld.gameMode");
   private static final class00392 i = class00392.L("lanServer.otherPlayers");
   private static final class00392 R = class00392.L("lanServer.port");
   private static final class00392 M = class00392.N("lanServer.port.unavailable", 1024, 65535);
   private static final class00392 B = class00392.N("lanServer.port.invalid", 1024, 65535);
   private final class05096 Z;
   private class07282 z = class07282.field_9215;
   private boolean U;
   private int E = class05021.N();
   @Nullable
   private class04927 W;

   public class05131(class05096 var1) {
      super(class00392.L("lanServer.title"));
      this.Z = var1;
   }

   @Nullable
   private class00392 N(String var1) {
      if (var1.isBlank()) {
         this.E = class05021.N();
         return null;
      } else {
         try {
            this.E = Integer.parseInt(var1);
            if (this.E < 1024 || this.E > 65535) {
               return B;
            } else {
               return !class05021.N(this.E) ? M : null;
            }
         } catch (NumberFormatException numberformatexception) {
            this.E = class05021.N();
            return B;
         }
      }
   }

   @Override
   public void method_25426() {
      class08337 class08337 = this.field_22787.Na();
      this.z = class08337.NT();
      this.U = class08337.yn().E();
      this.method_37063(
         class06366.N(class07282::u, this.z)
            .N(class07282.field_9215, class07282.field_9219, class07282.field_9220, class07282.field_9216)
            .N(this.field_22789 / 2 - 155, 100, 150, 20, u, (var1x, var2x) -> this.z = var2x)
      );
      this.method_37063(class06366.N(this.U).N(this.field_22789 / 2 + 5, 100, 150, 20, L, (var1x, var2x) -> this.U = var2x));
      class05362 class05362 = class05362.method_46430(class00392.L("lanServer.start"), var2x -> {
         this.field_22787.N(null);
         class05216 class05216;
         if (class08337.N(this.z, this.U, this.E)) {
            class05216 = class06223.y(this.E);
         } else {
            class05216 = class00392.L("commands.publish.failed");
         }

         ((class01056)this.field_22787.i_6).i().N(class05216);
         this.field_22787.NT().L(class05216);
         this.field_22787.yZ();
      }).N(this.field_22789 / 2 - 155, this.field_22790 - 28, 150, 20).N();
      this.W = new class04927(this.field_22793, this.field_22789 / 2 - 75, 160, 150, 20, class00392.L("lanServer.port"));
      this.W.method_1863(var2x -> {
         class00392 class00392 = this.N(var2x);
         this.W.method_47404(class00392.y(this.E + ""));
         if (class00392 == null) {
            this.W.method_1868(-2039584);
            this.W.method_47400(null);
            class05362.field_22763 = true;
         } else {
            this.W.method_1868(-2142128);
            this.W.method_47400(class04141.N(class00392));
            class05362.field_22763 = false;
         }
      });
      this.W.method_47404(class00392.y(this.E + ""));
      this.method_37063(this.W);
      this.method_37063(class05362);
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N(this.field_22789 / 2 + 5, this.field_22790 - 28, 150, 20).N());
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 50, -1);
      var1.N(this.field_22793, i, this.field_22789 / 2, 82, -1);
      var1.N(this.field_22793, R, this.field_22789 / 2, 142, -1);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.Z);
   }
}
