package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class08981 extends class07796 implements class06084 {
   public static final MapCodec<class08981> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02774.field_46493.fieldOf("weathering_state").forGetter(class08981::y), t()).apply(var0, class08981::new)
   );
   public static final class08064<class07211> y = class06665.f;
   public static final class08064<class08973> L = class06665.yK;
   public static final class06667 u = class06665.q;
   private static final class00494 i = class00891.y(10.0, 0.0, 14.0);
   private final class02774 R;

   public class08981(class02774 var1, class01362 var2) {
      super(var2);
      this.R = var1;
      this.P(this.W().y(y, class07211.field_11043).y(L, class08973.field_61414).y(u, false));
   }

   @Override
   public boolean i(class00500 var1) {
      return var1.N(class01210.NW);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   public class02774 y() {
      return this.R;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      class00394 class00394 = var1.method_8321(var2);
      return class00394 instanceof class08965 ? ((class08965)class00394).N(this.B().E(), var3.L(L)) : super.N(var1, var2, var3, var4);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return var1.L(L).ordinal() + 1;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      var2.method_8455(var3, var1.i());
   }

   @Override
   public MapCodec<? extends class08981> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(y, var1.method_8042().b()).y(u, class04688.N() == class04684.L);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      super.N(var1);
      var1.N(y, L, u);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class08965(var1, var2);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return var2 == class08791.field_48 && var1.Y().N(class01231.N);
   }

   void N(class07299 var1, class00500 var2, class07209 var3, class08036 var4) {
      var1.N(null, var3, class04909.MH, class04911.field_15245);
      var1.method_8652(var3, var2.y(L, var2.L(L).N()), 3);
      var1.N(var4, class01194.L, var3);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var1.N(class01226.Ly)) {
         return class07082.i;
      } else {
         this.N(var3, var2, var4, var5);
         return class07082.N;
      }
   }
}
