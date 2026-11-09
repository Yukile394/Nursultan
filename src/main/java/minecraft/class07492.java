package minecraft;

import com.viaversion.viafabricplus.features.recipe.Recipes1_11_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07492 extends class02763 {
   public static final int N = 0;
   public static final int y = 0;
   private static final int o = 2;
   private static final int q = 2;
   public static final int L = 1;
   public static final int u = 4;
   public static final int i = 5;
   public static final int R = 5;
   public static final int j = 4;
   public static final int v = 9;
   public static final int n = 9;
   public static final int t = 36;
   public static final int G = 36;
   public static final int l = 45;
   public static final int d = 45;
   public static final class01894 w = class01894.y("container/slot/helmet");
   public static final class01894 k = class01894.y("container/slot/chestplate");
   public static final class01894 Y = class01894.y("container/slot/leggings");
   public static final class01894 Q = class01894.y("container/slot/boots");
   public static final class01894 O = class01894.y("container/slot/shield");
   private static final Map<class07085, class01894> K = Map.of(
      class07085.field_6166, Q, class07085.field_6172, Y, class07085.field_6174, k, class07085.field_6169, w
   );
   private static final class07085[] V = new class07085[]{class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166};
   public final boolean g;
   private final class08036 e;

   @Override
   public class01015 P() {
      return class01015.field_25763;
   }

   public class03507 T() {
      return this.I;
   }

   public class07492(class08044 var1, boolean var2, class08036 var3) {
      super(null, 0, 2, 2);
      this.g = var2;
      this.e = var3;
      this.N(var3, 154, 28);
      this.u(98, 18);

      for (int ix = 0; ix < 4; ix++) {
         class07085 class07085 = V[ix];
         class01894 class01894 = K.get(class07085);
         this.N(new class02932(var1, var3, class07085, 39 - ix, 8, 8 + ix * 18, class01894));
      }

      this.L(var1, 8, 84);
      class07516 class07516 = new class07516(this, var1, 40, 77, 62, var3);
      this.N(this, class07516);
   }

   @Override
   protected class08036 s() {
      return this.e;
   }

   @Override
   public List<class06937> m() {
      return this.T.subList(1, 5);
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.J.method_5448();
      if (!var1.method_73183().method_8608()) {
         this.N(var1, this.I);
      }
   }

   @Override
   public void y(class06695 var1) {
      this.N(var1, null);
      if (this.e.method_73183() instanceof class04782 class04782) {
         class07485.N(this, class04782, this.e, this.I, this.J, null);
      }
   }

   private class06937 N(class07492 var1, class06937 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? null : this.N(var2);
   }

   public static boolean N(int var0) {
      return var0 >= 36 && var0 < 45 || var0 == 45;
   }

   @Override
   public boolean N(class08036 var1) {
      return true;
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         class07085 class07085 = var1.method_32326(class06584x);
         if (var2 == 0) {
            if (!this.N(class06584x, 9, 45, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 >= 1 && var2 < 5) {
            if (!this.N(class06584x, 9, 45, false)) {
               return class06584.E;
            }
         } else if (var2 >= 5 && var2 < 9) {
            if (!this.N(class06584x, 9, 45, false)) {
               return class06584.E;
            }
         } else if (class07085.N() == class07043.field_6178 && !this.T.get(8 - class07085.y()).R()) {
            int ix = 8 - class07085.y();
            if (!this.N(class06584x, ix, ix + 1, false)) {
               return class06584.E;
            }
         } else if (class07085 == class07085.field_6171 && !this.T.get(45).R()) {
            if (!this.N(class06584x, 45, 46, false)) {
               return class06584.E;
            }
         } else if (var2 >= 9 && var2 < 36) {
            if (!this.N(class06584x, 36, 45, false)) {
               return class06584.E;
            }
         } else if (var2 >= 36 && var2 < 45) {
            if (!this.N(class06584x, 9, 36, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 9, 45, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.N(class06584.E, class06584x);
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

   private void N(class06695 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
         Recipes1_11_2.setCraftingResultSlot(this.b, this, this.I);
      }
   }

   @Override
   public class06937 W() {
      return this.T.get(0);
   }
}
