package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07188 extends class07101 {
   public static final MapCodec<class07188> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(var0x -> var0x.A), t()).apply(var0, class07188::new)
   );
   public static final class06667 y = class06665.d;
   public static final class06667 L = class06665.k;
   public static final class06667 u = class06665.v;
   private static final Map<class07185, class00494> i = class00389.N(class00891.N(16.0, 16.0, 4.0));
   private static final Map<class07185, class00494> M = Maps.newEnumMap(
      class07536.N(i, (Function<? super class00494, class00494>)(var0 -> class00389.N(var0, class00891.y(16.0, 13.0, 16.0), class07003.i)))
   );
   private static final Map<class07185, class00494> B = class00389.N(class00891.N(16.0, 4.0, 0.0, 24.0));
   private static final Map<class07185, class00494> Z = class00389.N(class00891.N(16.0, 4.0, 5.0, 24.0));
   private static final Map<class07185, class00494> O = class00389.N(
      class00389.N(class00891.N(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), class00891.N(14.0, 5.0, 7.0, 16.0, 16.0, 9.0))
   );
   private static final Map<class07185, class00494> F = Maps.newEnumMap(
      class07536.N(O, (Function<? super class00494, class00494>)(var0 -> var0.method_1096(0.0, -0.1875, 0.0).method_1097()))
   );
   private final class05904 A;
   private static final class00494 f;

   public class07188(class05904 var1, class01362 var2) {
      super(var2.N(var1.u()));
      this.A = var1;
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false));
   }

   private boolean U(class00500 var1) {
      return var1.N(class01210.q);
   }

   @Override
   protected class00494 z(class00500 var1) {
      class07185 class07185 = var1.L(R).z();
      return (var1.L(u) ? F : O).get(class07185);
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      class07185 class07185 = var1.L(R).z();
      return var1.L(y) ? class00389.N() : Z.get(class07185);
   }

   private void y(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (!var1.L(y) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
         var5.setReturnValue(f);
      }
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         class07185 class07185 = var1.L(R).z();
         return var1.L(y) ? class00389.N() : B.get(class07185);
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (!var1.L(u) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
         var5.setReturnValue(class00389.y());
      }
   }

   @Override
   public MapCodec<class07188> N() {
      return N;
   }

   public static boolean N(class00500 var0, class07211 var1) {
      return var0.L(R).z() == var1.R().z();
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      boolean flag = class07299.W(class07209);
      class07211 class07211 = var1.method_8042();
      class07185 class07185 = class07211.z();
      boolean flag1 = class07185 == class07185.field_11051
            && (this.U(class07299.method_8320(class07209.method_10067())) || this.U(class07299.method_8320(class07209.method_10078())))
         || class07185 == class07185.field_11048
            && (this.U(class07299.method_8320(class07209.method_10095())) || this.U(class07299.method_8320(class07209.method_10072())));
      return this.W().y(R, class07211).y(y, flag).y(L, flag).y(u, flag1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      switch (var2) {
         case field_50:
            return var1.L(y);
         case field_48:
            return false;
         case field_51:
            return var1.L(y);
         default:
            return false;
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class07185 class07185 = var5.z();
      if (var1.L(R).R().z() != class07185) {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         boolean flag = this.U(var7) || this.U(var2.method_8320(var4.method_10093(var5.b())));
         return var1.y(u, flag);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         class07185 class07185 = var1.L(R).z();
         return (var1.L(u) ? M : i).get(class07185);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, y, L, u);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         boolean flag = var2.W(var3);
         if (var1.L(L) != flag) {
            var2.method_8652(var3, var1.y(L, flag).y(y, flag), 2);
            if (var1.L(y) != flag) {
               var2.method_8396(null, var3, flag ? this.A.M() : this.A.R(), class04911.field_15245, 1.0F, var2.method_8409().z() * 0.1F + 0.9F);
               var2.N(null, flag ? class01194.B : class01194.u, var3);
            }
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M() && !var1.L(L)) {
         boolean flag = var1.L(y);
         var2.method_8501(var3, var1.y(y, !flag));
         var2.method_8396(null, var3, flag ? this.A.R() : this.A.M(), class04911.field_15245, 1.0F, var2.method_8409().z() * 0.1F + 0.9F);
         var2.N(flag ? class01194.u : class01194.B, var3, class01164.N(var1));
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(y)) {
         var1 = var1.y(y, false);
         var2.method_8652(var3, var1, 10);
      } else {
         class07211 class07211 = var4.method_5735();
         if (var1.L(R) == class07211.b()) {
            var1 = var1.y(R, class07211);
         }

         var1 = var1.y(y, true);
         var2.method_8652(var3, var1, 10);
      }

      boolean flag = var1.L(y);
      var2.method_8396(var4, var3, flag ? this.A.M() : this.A.R(), class04911.field_15245, 1.0F, var2.method_8409().z() * 0.1F + 0.9F);
      var2.N(var4, flag ? class01194.B : class01194.u, var3);
      return class07082.N;
   }
}
