package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.fabric.mixin.content.registry.GiveGiftToHeroAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06285 extends class05765<class08041> implements GiveGiftToHeroAccessor {
   private static final int N = 5;
   private static final int y = 600;
   private static final int L = 6600;
   private static final int u = 20;
   private static Map<class05946<class05672>, class05946<class05074>> i = ImmutableMap.builder()
      .put(class05672.L, class06273.Nb)
      .put(class05672.u, class06273.Nj)
      .put(class05672.i, class06273.Nv)
      .put(class05672.R, class06273.Nn)
      .put(class05672.M, class06273.Nt)
      .put(class05672.B, class06273.NG)
      .put(class05672.Z, class06273.Nl)
      .put(class05672.z, class06273.Nd)
      .put(class05672.U, class06273.Nw)
      .put(class05672.E, class06273.Nk)
      .put(class05672.m, class06273.NY)
      .put(class05672.P, class06273.NQ)
      .put(class05672.s, class06273.NO)
      .build();
   private static final float R = 0.5F;
   private int Z = 600;
   private boolean z;
   private long U;

   private Optional<class08036> L(class08041 var1) {
      return var1.method_18868().L(class05378.U).filter(this::N);
   }

   protected void L(class04782 var1, class08041 var2, long var3) {
      class08036 class08036 = this.L(var2).get();
      class06293.N(var2, class08036);
      if (this.N(var2, class08036)) {
         if (var3 - this.U > 20L) {
            this.N(var1, var2, class08036);
            this.z = true;
         }
      } else {
         class06293.N(var2, class08036, 0.5F, 5);
      }
   }

   public class06285(int var1) {
      super(
         ImmutableMap.of(
            class05378.m,
            class05367.field_18458,
            class05378.P,
            class05367.field_18458,
            class05378.b,
            class05367.field_18458,
            class05378.U,
            class05367.field_18456
         ),
         var1
      );
   }

   static {
      N(null);
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      this.Z = N(var1);
      var2.method_18868().y(class05378.b);
      var2.method_18868().y(class05378.m);
      var2.method_18868().y(class05378.P);
   }

   private boolean y(class08041 var1) {
      return this.L(var1).isPresent();
   }

   protected boolean y(class04782 var1, class08041 var2, long var3) {
      return this.y(var2) && !this.z;
   }

   private static void N(CallbackInfo var0) {
      i = new HashMap<>(i);
   }

   private static class05946<class05074> N(class08041 var0) {
      if (var0.method_6109()) {
         return class06273.NI;
      } else {
         Optional<class05946<class05672>> optional = var0.t().y().i();
         return optional.isEmpty() ? class06273.Ng : i.getOrDefault(optional.get(), class06273.Ng);
      }
   }

   private void N(class04782 var1, class08041 var2, class07438 var3) {
      var2.method_64169(var1, N(var2), (var2x, var3x) -> class06293.N(var2, var3x, var3.method_73189()));
   }

   protected void N(class04782 var1, class08041 var2, long var3) {
      this.z = false;
      this.U = var3;
      class08036 class08036 = this.L(var2).get();
      var2.method_18868().N(class05378.b, class08036);
      class06293.N(var2, class08036);
   }

   protected boolean N(class04782 var1, class08041 var2) {
      if (!this.y(var2)) {
         return false;
      } else if (this.Z > 0) {
         this.Z--;
         return false;
      } else {
         return true;
      }
   }

   private static int N(class04782 var0) {
      return 600 + var0.field_9229.y(6001);
   }

   private boolean N(class08041 var1, class08036 var2) {
      class07209 class07209 = var2.method_24515();
      return var1.method_24515().method_19771(class07209, 5.0);
   }

   private boolean N(class08036 var1) {
      return var1.method_6059(class07047.I);
   }
}
