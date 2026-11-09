package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import java.util.function.BiConsumer;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class07196 extends class00891 {
   public static final MapCodec<class07196> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01960.N.fieldOf("block_set_type").forGetter(class07196::y), t()).apply(var0, class07196::new)
   );
   public static final class08064<class07211> y = class07101.R;
   public static final class08064<class08059> L = class06665.NB;
   public static final class08064<class08058> u = class06665.yz;
   public static final class06667 i = class06665.d;
   public static final class06667 R = class06665.k;
   private static final Map<class07211, class00494> M = class00389.L(class00891.L(16.0, 13.0, 16.0));
   private final class01960 B;
   private static final Map Z;

   private Map L() {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? Z : M;
   }

   public class07196(class01960 var1, class01362 var2) {
      super(var2.N(var1.M()));
      this.B = var1;
      this.P(this.Q.y().y(y, class07211.field_11043).y(i, false).y(u, class08058.field_12588).y(R, false).y(L, class08059.field_12607));
   }

   public boolean U(class00500 var1) {
      return var1.L(i);
   }

   @Override
   public class00494 z(class00500 var1) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? M.get(var1.L(y)) : super.z(var1);
   }

   private class08058 y(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209xxxxx = var1.method_8037();
      class07211 class07211xx = var1.method_8042();
      class07209 class07209x = class07209xxxxx.method_10084();
      class07211 class07211x = class07211xx.M();
      class07209 class07209xx = class07209xxxxx.method_10093(class07211x);
      class00500 class00500xxx = class07299.method_8320(class07209xx);
      class07209 class07209xxx = class07209x.method_10093(class07211x);
      class00500 class00500x = class07299.method_8320(class07209xxx);
      class07211 class07211xx = class07211xx.R();
      class07209 class07209xxxx = class07209xxxxx.method_10093(class07211xx);
      class00500 class00500xx = class07299.method_8320(class07209xxxx);
      class07209 class07209xxxxx = class07209x.method_10093(class07211xx);
      class00500 class00500xxx = class07299.method_8320(class07209xxxxx);
      int ix = (class00500xxx.W(class07299, class07209xx) ? -1 : 0)
         + (class00500x.W(class07299, class07209xxx) ? -1 : 0)
         + (class00500xx.W(class07299, class07209xxxx) ? 1 : 0)
         + (class00500xxx.W(class07299, class07209xxxxx) ? 1 : 0);
      boolean flag = class00500xxx.i() instanceof class07196 && class00500xxx.L(L) == class08059.field_12607;
      boolean flag1 = class00500xx.i() instanceof class07196 && class00500xx.L(L) == class08059.field_12607;
      if ((!flag || flag1) && ix <= 0) {
         if ((!flag1 || flag) && ix >= 0) {
            int j = class07211xx.P();
            int k = class07211xx.T();
            class06889 class06889 = var1.method_17698();
            double d0 = class06889.M - class07209xxxxx.method_10263();
            double d1 = class06889.Z - class07209xxxxx.method_10260();
            return (j >= 0 || !(d1 < 0.5)) && (j <= 0 || !(d1 > 0.5)) && (k >= 0 || !(d0 > 0.5)) && (k <= 0 || !(d0 < 0.5))
               ? class08058.field_12588
               : class08058.field_12586;
         } else {
            return class08058.field_12588;
         }
      } else {
         return class08058.field_12586;
      }
   }

   public class01960 y() {
      return this.B;
   }

   public static boolean E(class00500 var0) {
      class00891 class00891 = var0.i();
      return class00891 instanceof class07196 && ((class07196)class00891).y().L();
   }

   @Override
   protected long N(class00500 var1, class07209 var2) {
      return class04995.y(var2.method_10263(), var2.method_10087(var1.L(L) == class08059.field_12607 ? 0 : 1).method_10264(), var2.method_10260());
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var2 == class07111.field_11302 ? var1 : var1.N(var2.N(var1.L(y))).N(u);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   private void N(@Nullable class07049 var1, class07299 var2, class07209 var3, boolean var4) {
      var2.method_8396(var1, var3, var4 ? this.B.Z() : this.B.B(), class04911.field_15245, 1.0F, var2.method_8409().z() * 0.1F + 0.9F);
   }

   @Override
   public MapCodec<? extends class07196> N() {
      return N;
   }

   public static boolean N(class07299 var0, class07209 var1) {
      return E(var0.method_8320(var1));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, y, i, u, R);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class07211 class07211x = var1.L(y);
      class07211 class07211x = var1.L(i) ? (var1.L(u) == class08058.field_12586 ? class07211x.M() : class07211x.R()) : class07211x;
      return (class00494)this.L().get(class07211x);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return switch (var2) {
         case field_50, field_51 -> var1.L(i);
         case field_48 -> false;
      };
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608() && (var4.method_66324() || !var4.method_7305(var3))) {
         class06761.y(var1, var2, var3, var4);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M() && var1.L(L) == class08059.field_12607 && this.B.u() && !var1.L(R)) {
         this.N(null, var2, var1, var3, !this.U(var1));
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class08059 class08059 = var1.L(L);
      if (var5.z() != class07185.field_11052 || class08059 == class08059.field_12607 != (var5 == class07211.field_11036)) {
         return class08059 == class08059.field_12607 && var5 == class07211.field_11033 && !var1.N(var2, var4)
            ? class00869.N.W()
            : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return var7.i() instanceof class07196 && var7.L(L) != class08059 ? var7.y(L, class08059) : class00869.N.W();
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      if (class07209.method_10264() < class07299.method_31600() && class07299.method_8320(class07209.method_10084()).N(var1)) {
         boolean flag = class07299.W(class07209) || class07299.W(class07209.method_10084());
         return this.W().y(y, var1.method_8042()).y(u, this.y(var1)).y(R, flag).y(i, flag).y(L, class08059.field_12607);
      } else {
         return null;
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      boolean flag = var2.W(var3) || var2.W(var3.method_10093(var1.L(L) == class08059.field_12607 ? class07211.field_11036 : class07211.field_11033));
      if (!this.W().N(var4) && flag != var1.L(R)) {
         if (flag != var1.L(i)) {
            this.N(null, var2, var3, flag);
            var2.N(null, flag ? class01194.B : class01194.u, var3);
         }

         var2.method_8652(var3, var1.y(R, flag).y(i, flag), 2);
      }
   }

   public void N(@Nullable class07049 var1, class07299 var2, class00500 var3, class07209 var4, boolean var5) {
      if (var3.N(this) && var3.L(i) != var5) {
         var2.method_8652(var4, var3.y(i, var5), 10);
         this.N(var1, var2, var4, var5);
         var2.N(var1, var5 ? class01194.B : class01194.u, var4);
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!this.B.L()) {
         return class07082.i;
      } else {
         var1 = var1.N(i);
         var2.method_8652(var3, var1, 10);
         this.N(var4, var2, var3, var1.L(i));
         var2.N(var4, this.U(var1) ? class01194.B : class01194.u, var3);
         return class07082.N;
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      var1.method_8652(var2.method_10084(), var3.y(L, class08059.field_12609), 3);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      return var1.L(L) == class08059.field_12607 ? class00500.L(var2, class07209, class07211.field_11036) : class00500.N(this);
   }
}
