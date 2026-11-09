package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01977 extends class07796 implements class06084 {
   public static final MapCodec<class01977> N = y(class01977::new);
   public static final class01894 y = class01894.y("sherds");
   public static final class08064<class07211> L = class06665.f;
   public static final class06667 u = class06665.yY;
   public static final class06667 i = class06665.q;
   private static final class00494 R = class00891.y(14.0, 0.0, 16.0);

   private class07041 L() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? class07082.L : class07082.N;
   }

   public class01977(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, class07211.field_11043).y(i, false).y(u, false));
   }

   @Override
   protected class07752 j(class00500 var1) {
      return var1.L(u) ? class07752.yM : class07752.yR;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class01958) {
         class03490 class03490 = ((class01958)class00394).z();
         return class01958.N(class03490);
      } else {
         return super.N(var1, var2, var3, var4);
      }
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      class07209 class07209 = var3.u();
      if (var1 instanceof class04782 class04782 && var4.method_36971(class04782, class07209) && var4.N(class04782)) {
         var1.method_8652(class07209, var2.y(u, true), 260);
         var1.N(class07209, true, var4);
      }
   }

   private void N(
      class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7, CallbackInfoReturnable var8
   ) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
         var8.setReturnValue(class07082.i);
      }
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8321(var3) instanceof class01958 class01958) {
         var2.method_8396(null, var3, class04909.Bh, class04911.field_15245, 1.0F, 1.0F);
         class01958.N(class01967.field_46665);
         var2.N(var4, class01194.L, var3);
         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else if (var3.method_8321(var4) instanceof class01958 class01958) {
         if (var3.method_8608()) {
            return this.L();
         } else {
            class06584 class06584 = class01958.N();
            if (!var1.R() && (class06584.R() || class06584.L(class06584, var1) && class06584.c() < class06584.U())) {
               class01958.N(class01967.field_46664);
               var5.method_7259(class01235.L.y(var1.B()));
               class06584 class06584x = var1.y(1, var5);
               float f;
               if (class01958.method_5442()) {
                  class01958.N(class06584x);
                  f = (float)class06584x.c() / class06584x.U();
               } else {
                  class06584.M(1);
                  f = (float)class06584.c() / class06584.U();
               }

               var3.method_8396(null, var4, class04909.BD, class04911.field_15245, 1.0F, 0.7F + 0.5F * f);
               if (var3 instanceof class04782) {
                  ((class04782)var3)
                     .method_65096(class07107.yy, var4.method_10263() + 0.5, var4.method_10264() + 1.2, var4.method_10260() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               class01958.method_5431();
               var3.N(var5, class01194.L, var4);
               return class07082.N;
            } else {
               return class07082.R;
            }
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(L, var1.method_8042()).y(i, class04688.N() == class04684.L).y(u, false);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public MapCodec<class01977> N() {
      return N;
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      class06584 class06584 = var4.method_6047();
      class00500 class00500 = var3;
      if (class06584.N(class01226.LM) && !class07323.N(class06584, class02625.b)) {
         class00500 = var3.y(u, true);
         var1.method_8652(var2, class00500, 260);
      }

      return super.N(var1, var2, class00500, var4);
   }

   @Override
   protected List<class06584> N(class00500 var1, class04160 var2) {
      class00394 class00394 = var2.y(class06551.z);
      if (class00394 instanceof class01958 class01958) {
         var2.N(y, var1x -> {
            for (class06581 class06581 : class01958.z().N()) {
               var1x.accept(class06581.E());
            }
         });
      }

      return super.N(var1, var2);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class01958(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, i, u);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R;
   }
}
