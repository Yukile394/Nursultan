package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Objects;
import net.irisshaders.iris.mixinterface.BiomeAmbienceInterface;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05397 implements class00169, BiomeAmbienceInterface {
   private static final int N = 40;
   private static final float y = 0.001F;
   private final class04453 L;
   private final class09033 u;
   private final class06069 i;
   private final Object2ObjectArrayMap<class03556<class04891>, class05386> R = new Object2ObjectArrayMap();
   private float M;
   @Nullable
   private class03556<class04891> B;
   private float Z;

   public class05397(class04453 var1, class09033 var2) {
      super();
      this.i = var1.method_73183().method_8409();
      this.L = var1;
      this.u = var2;
   }

   public float y() {
      return this.M;
   }

   private void N(class07299 var1, class01374 var2, CallbackInfo var3, class07209 var4) {
      int ix = this.L.method_73183().method_8314(class00772.field_9284, var4);
      if (ix > 0) {
         this.Z -= ix / 15.0F * 0.001F;
      } else {
         this.Z = this.Z - (float)(this.L.method_73183().method_8314(class00772.field_9282, var4) - 1) / var2.y();
      }

      this.Z = class04995.N(this.Z, 0.0F, 1.0F);
   }

   @Override
   public void N() {
      this.R.values().removeIf(class00155::N);
      class07299 class07299 = this.L.method_73183();
      class06731 class06731 = class07299.method_75728().N(class00608.l, this.L.method_73189());
      class03556<class04891> class03556 = class06731.N().orElse(null);
      if (!Objects.equals(class03556, this.B)) {
         this.B = class03556;
         this.R.values().forEach(class05386::b);
         if (class03556 != null) {
            this.R.compute(class03556, (var2, var3x) -> {
               if (var3x == null) {
                  var3x = new class05386(class03556.N());
                  this.u.N((class00044)var3x);
               }

               var3x.j();
               return var3x;
            });
         }
      }

      for (class01368 class01368 : class06731.L()) {
         if (this.i.U() < class01368.y()) {
            this.u.N(class00040.y(class01368.N().N()));
         }
      }

      class06731.y()
         .ifPresent(
            var2 -> {
               int ix = var2.L() * 2 + 1;
               class07209 class07209 = class07209.method_49637(
                  this.L.method_23317() + this.i.y(ix) - var2.L(),
                  this.L.method_23320() + this.i.y(ix) - var2.L(),
                  this.L.method_23321() + this.i.y(ix) - var2.L()
               );
               class00772 class00772 = class00772.field_9284;
               this.N(class07299, var2, null, class07209);
               int j = class07299.method_8314(class00772, class07209);
               if (j > 0) {
                  this.M -= j / 15.0F * 0.001F;
               } else {
                  this.M = this.M - (float)(class07299.method_8314(class00772.field_9282, class07209) - 1) / var2.y();
               }

               if (this.M >= 1.0F) {
                  double d0 = class07209.method_10263() + 0.5;
                  double d1 = class07209.method_10264() + 0.5;
                  double d2 = class07209.method_10260() + 0.5;
                  double d3 = d0 - this.L.method_23317();
                  double d4 = d1 - this.L.method_23320();
                  double d5 = d2 - this.L.method_23321();
                  double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                  double d7 = d6 + var2.u();
                  class00040 class00040 = class00040.N(
                     var2.N().N(), this.i, this.L.method_23317() + d3 / d6 * d7, this.L.method_23320() + d4 / d6 * d7, this.L.method_23321() + d5 / d6 * d7
                  );
                  this.u.N(class00040);
                  this.M = 0.0F;
               } else {
                  this.M = Math.max(this.M, 0.0F);
               }
            }
         );
   }

   public float getConstantMood() {
      return this.Z;
   }
}
