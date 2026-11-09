package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06867 extends class00891 {
   public static final MapCodec<class06867> N = y(class06867::new);
   public static final class08064<class08089> y = class06665.yU;
   public static final class06667 L = class06665.k;
   public static final class08071 u = class06665.NS;
   public static final int i = 3;

   public class06867(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class08089.field_12648).y(u, 0).y(L, false));
   }

   public static float y(int var0) {
      return (float)Math.pow(2.0, (var0 - 12) / 12.0);
   }

   @Override
   protected boolean N(class00500 var1, class07299 var2, class07209 var3, int var4, int var5) {
      class08089 class08089 = var1.L(y);
      float f;
      if (class08089.y()) {
         int var8 = var1.L(u);
         f = y(var8);
         var2.method_8406(class07107.Ni, var3.method_10263() + 0.5, var3.method_10264() + 1.2, var3.method_10260() + 0.5, var8 / 24.0, 0.0, 0.0);
      } else {
         f = 1.0F;
      }

      class03556<class04891> class03556;
      if (class08089.L()) {
         class01894 class01894 = this.N(var2, var3);
         if (class01894 == null) {
            return false;
         }

         class03556 = class03556.N(class04891.N(class01894));
      } else {
         class03556 = class08089.N();
      }

      var2.method_8465(
         null,
         var3.method_10263() + 0.5,
         var3.method_10264() + 0.5,
         var3.method_10260() + 0.5,
         class03556,
         class04911.field_15247,
         3.0F,
         f,
         var2.field_9229.B()
      );
      return true;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var1 = var1.N(u);
         var2.method_8652(var3, var1, 3);
         this.N(var4, var1, var2, var3);
         var4.method_7281(class01235.NZ);
      }

      return class07082.N;
   }

   @Nullable
   private class01894 N(class07299 var1, class07209 var2) {
      class00394 class00394 = var1.method_8321(var2.method_10084());
      return class00394 instanceof class07237 ? ((class07237)class00394).L() : null;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
         var1.setReturnValue(class07082.N);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.z() == class07185.field_11052 ? this.N(var2, var4, var1) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.N(var1.method_8045(), var1.method_8037(), this.W());
   }

   private class00500 N(class05487 var1, class07209 var2, class00500 var3) {
      class08089 class08089xx = var1.method_8320(var2.method_10084()).I();
      if (class08089xx.u()) {
         return var3.y(y, class08089xx);
      } else {
         class08089 class08089x = var1.method_8320(var2.method_10074()).I();
         class08089 class08089xx = class08089x.u() ? class08089.field_12648 : class08089x;
         return var3.y(y, class08089xx);
      }
   }

   @Override
   public MapCodec<class06867> N() {
      return N;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         return (class07082)(var1.N(class01226.yp) && var7.i() == class07211.field_11036 ? class07082.i : super.N(var1, var2, var3, var4, var5, var6, var7));
      }
   }

   private void N(@Nullable class07049 var1, class00500 var2, class07299 var3, class07209 var4) {
      if (var2.L(y).u() || var3.method_8320(var4.method_10084()).P()) {
         var3.method_8427(var4, this, 0, 0);
         var3.N(var1, class01194.o, var4);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      boolean flag = var2.W(var3);
      if (flag != var1.L(L)) {
         if (flag) {
            this.N(null, var1, var2, var3);
         }

         var2.method_8652(var3, var1.y(L, flag), 3);
      }
   }

   @Override
   protected void a_(class00500 var1, class07299 var2, class07209 var3, class08036 var4) {
      if (!var2.method_8608()) {
         this.N(var4, var1, var2, var3);
         var4.method_7281(class01235.NB);
      }
   }
}
