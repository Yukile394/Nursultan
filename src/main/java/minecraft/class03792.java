package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class03792 extends class07036 {
   public static final MapCodec<class03792> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(class07036::L), t()).apply(var0, class03792::new)
   );
   public static final class08064<class07211> L = class07101.R;
   private static final Map<class07185, class00494> u = class00389.N(class00891.N(16.0, 4.0, 14.0, 16.0));
   private static final Map<class07185, class00494> i = class00389.N(class00389.N(u.get(class07185.field_11051), class00891.N(14.0, 2.0, 0.0, 10.0)));

   public class03792(class05904 var1, class01362 var2) {
      super(var1, var2.N(var1.i()));
      this.P(this.Q.y().y(L, class07211.field_11043).y(N, false));
   }

   @Override
   public float U(class00500 var1) {
      return var1.L(L).U();
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      return this.N(var1, var2, var3, class06092.N());
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u.get(var1.L(L).z());
   }

   public boolean y(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211x = var1.L(L).R();
      class07211 class07211x = var1.L(L).M();
      return this.N(var2, var1, var3.method_10093(class07211x), class07211x) || this.N(var2, var1, var3.method_10093(class07211x), class07211x);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, N);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   public MapCodec<class03792> N() {
      return y;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_40330, class07267::N);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class03786(var1, var2);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i.get(var1.L(L).z());
   }

   private boolean N(class06183 var1, class00500 var2) {
      return var1.i().z() == var2.L(L).z();
   }

   private boolean N(class00500 var1, class08036 var2, class06183 var3, class07267 var4, class06584 var5) {
      return !var4.N(var4.N(var2), var2) && var5.B() instanceof class03759 && !this.N(var3, var1);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      return (class07082)(var3.method_8321(var4) instanceof class07267 class07267 && this.N(var2, var5, var7, class07267, var1)
         ? class07082.i
         : super.N(var1, var2, var3, var4, var5, var6, var7));
   }

   public boolean N(class05487 var1, class00500 var2, class07209 var3, class07211 var4) {
      class00500 class00500 = var1.method_8320(var3);
      return class00500.N(class01210.Nc) ? class00500.L(L).z().test(var2.L(L)) : class00500.N(var1, var3, var4, class01020.field_25822);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L() && !class07211x.z().test(var1.method_8038())) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(L, class07211x);
            if (class00500.N((class05487)class07299, class07209) && this.y(class00500, class07299, class07209)) {
               return class00500.y(N, class04688.N() == class04684.L);
            }
         }
      }

      return null;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.z() == var1.L(L).R().z() && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
