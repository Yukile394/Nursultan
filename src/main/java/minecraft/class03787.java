package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class03787 extends class07036 {
   public static final MapCodec<class03787> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(class07036::L), t()).apply(var0, class03787::new)
   );
   public static final class08071 L = class06665.yR;
   public static final class06667 u = class06665.N;
   private static final class00494 i = class00891.y(10.0, 0.0, 16.0);
   private static final Map<Integer, class00494> R = class00389.L(class00891.N(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap(var0 -> class03795.N(var0.getKey()), Entry::getValue));

   public class03787(class05904 var1, class01362 var2) {
      super(var1, var2.N(var1.i()));
      this.P(this.Q.y().y(L, 0).y(u, false).y(N, false));
   }

   @Override
   public float U(class00500 var1) {
      return class03795.y(var1.L(L));
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      return this.N(var1, var2, var3, class06092.N());
   }

   @Override
   public MapCodec<class03787> N() {
      return y;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class03786(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u, N);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(L, var2.N(var1.L(L), 16));
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_40330, class07267::N);
   }

   private boolean N(class08036 var1, class06183 var2, class07267 var3, class06584 var4) {
      return !var3.N(var3.N(var1), var1) && var4.B() instanceof class03759 && var2.i().equals(class07211.field_11033);
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class04688 class04688 = class07299.method_8316(var1.method_8037());
      class07209 class07209 = var1.method_8037().method_10084();
      class00500 class00500 = class07299.method_8320(class07209);
      boolean flag = class00500.N(class01210.NX);
      class07211 class07211x = class07211.N((double)var1.method_8044());
      boolean flag1 = !class00891.N(class00500.M(class07299, class07209), class07211.field_11033) || var1.method_8046();
      if (flag && !var1.method_8046()) {
         if (class00500.y(class03792.L)) {
            class07211 class07211x = class00500.L(class03792.L);
            if (class07211x.z().test(class07211x)) {
               flag1 = false;
            }
         } else if (class00500.y(L)) {
            Optional<class07211> optional = class03795.N(class00500.L(L));
            if (optional.isPresent() && optional.get().z().test(class07211x)) {
               flag1 = false;
            }
         }
      }

      int ix = !flag1 ? class03795.N(class07211x.b()) : class03795.N(var1.method_8044() + 180.0F);
      return this.W().y(u, flag1).y(L, ix).y(N, class04688.N() == class04684.L);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R.getOrDefault(var1.L(L), i);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L), 16));
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      return (class07082)(var3.method_8321(var4) instanceof class07267 class07267 && this.N(var5, var7, class07267, var1)
         ? class07082.i
         : super.N(var1, var2, var3, var4, var5, var6, var7));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11036 && !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10084()).N(var2, var3.method_10084(), class07211.field_11033, class01020.field_25823);
   }
}
