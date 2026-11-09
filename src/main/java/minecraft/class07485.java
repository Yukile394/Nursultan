package minecraft;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07485 extends class02763 {
   private static final int y = 3;
   private static final int L = 3;
   public static final int N = 0;
   private static final int u = 1;
   private static final int i = 9;
   private static final int R = 10;
   private static final int j = 10;
   private static final int v = 37;
   private static final int n = 37;
   private static final int t = 46;
   private final class05880 G;
   private final class08036 l;
   private boolean d;

   @Override
   public class01015 P() {
      return class01015.field_25763;
   }

   public class07485(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class07485(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17333, var1, 3, 3);
      this.G = var3;
      this.l = var2.z;
      this.N(this.l, 124, 35);
      this.u(30, 17);
      this.L(var2, 8, 84);
   }

   @Override
   protected class08036 s() {
      return this.l;
   }

   @Override
   public List<class06937> m() {
      return this.T.subList(1, 10);
   }

   @Override
   public void y(class06695 var1) {
      this.N(var1, null);
      if (!this.d) {
         this.G.N_53((var1x, var2) -> {
            if (var1x instanceof class04782 class04782) {
               N(this, class04782, this.l, this.I, this.J, null);
            }
         });
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.G.N_53((var2, var3) -> this.N(var1, this.I));
   }

   @Override
   public void E() {
      this.d = true;
   }

   private boolean N(class07485 var1, class06584 var2, int var3, int var4, boolean var5) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_4) && this.N(var2, var3, var4, var5);
   }

   private void N(class06695 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
         Recipes1_11_2.setCraftingResultSlot(this.b, this, this.I);
      }
   }

   @Override
   public void N(class04782 var1, class03729<class05857> var2) {
      this.d = false;
      N(this, var1, this.l, this.I, this.J, var2);
   }

   protected static void N(class07482 var0, class04782 var1, class08036 var2, class03507 var3, class06919 var4, @Nullable class03729<class05857> var5) {
      class02903 class02903 = var3.u();
      class04770 class04770 = (class04770)var2;
      class06584 class06584x = class06584.E;
      Optional<class03729<class05857>> optional = var1.method_8503().yM().N(class05838.N, class02903, var1, var5);
      if (optional.isPresent()) {
         class03729<class05857> class03729 = optional.get();
         class05857 class05857 = class03729.y();
         if (var4.N(class04770, class03729)) {
            class06584 class06584x = class05857.method_8116(class02903, var1.method_30349());
            if (class06584x.N(var1.method_45162())) {
               class06584x = class06584x;
            }
         }
      }

      var4.method_5447(0, class06584x);
      var0.N(0, class06584x);
      class04770.field_13987.method_14364(new class00496(var0.b, var0.U(), 0, class06584x));
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == 0) {
            class06584x.B().L(class06584x, var1);
            if (!this.N(class06584x, 10, 46, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 >= 10 && var2 < 46) {
            boolean flag = false;
            byte b1 = 10;
            byte b0 = 1;
            if (!this.N(this, class06584x, b0, b1, flag)) {
               if (var2 < 37) {
                  if (!this.N(class06584x, 37, 46, false)) {
                     return class06584.E;
                  }
               } else if (!this.N(class06584x, 10, 37, false)) {
                  return class06584.E;
               }
            }
         } else if (!this.N(class06584x, 10, 46, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
         if (var2 == 0) {
            var1.method_7328(class06584x, false);
         }
      }

      return class06584x;
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      return var2.L != this.J && super.N(var1, var2);
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.G, var1, class00869.LD);
   }

   @Override
   public class06937 W() {
      return this.T.get(0);
   }
}
