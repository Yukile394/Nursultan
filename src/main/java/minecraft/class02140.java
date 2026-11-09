package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class02140<E extends class07475> extends class05765<E> {
   private static final int N = 100;
   private static final int y = 120;
   private static final int L = 5;
   private static final int u = 4;
   private final float i;
   private final Function<class07475, class03530<class03689>> R;
   private final Function<E, class06889> Z;

   protected void L(class04782 var1, E var2, long var3) {
      var2.method_18868().y(class05378.NN);
   }

   public class02140(float var1) {
      this(var1, var0 -> class03696.I, var0 -> class05456.N(var0, 5, 4));
   }

   public class02140(float var1, int var2) {
      this(var1, var0 -> class03696.I, var1x -> class05444.N(var1x, 5, 4, var2, var1x.method_5828(0.0F).M, var1x.method_5828(0.0F).Z, (float) (Math.PI / 2)));
   }

   public class02140(float var1, Function<class07475, class03530<class03689>> var2) {
      this(var1, var2, var0 -> class05456.N(var0, 5, 4));
   }

   public class02140(float var1, Function<class07475, class03530<class03689>> var2, Function<E, class06889> var3) {
      super(Map.of(class05378.NN, class05367.field_18458, class05378.d, class05367.field_18458), 100, 120);
      this.i = var1;
      this.R = var2;
      this.Z = var3;
   }

   protected void u(class04782 var1, E var2, long var3) {
      if (var2.f().U()) {
         class06889 class06889 = this.N((E)var2, var1);
         if (class06889 != null) {
            var2.method_18868().N(class05378.m, new class05352(class06889, this.i, 0));
         }
      }
   }

   protected void y(class04782 var1, E var2, long var3) {
      var2.method_18868().N(class05378.NN, true);
      var2.method_18868().y(class05378.m);
      var2.f().W();
   }

   protected boolean N(class04782 var1, E var2) {
      return var2.method_18868().L(class05378.d).map(var2x -> var2x.N(this.R.apply(var2))).orElse(false) || var2.method_18868().N(class05378.NN);
   }

   @Nullable
   private class06889 N(E var1, class04782 var2) {
      if (var1.method_5809()) {
         Optional optional = this.N((class07290)var2, var1).map(class06889::L);
         if (optional.isPresent()) {
            return (class06889)optional.get();
         }
      }

      return this.Z.apply((E)var1);
   }

   private Optional<class07209> N(class07290 var1, class07049 var2) {
      class07209 class07209 = var2.method_24515();
      if (!var1.method_8320(class07209).M(var1, class07209).method_1110()) {
         return Optional.empty();
      } else {
         Predicate predicate;
         if (class04995.u(var2.method_17681()) == 2) {
            predicate = var1x -> class07209.method_51686(var1x).allMatch(var1xx -> var1.method_8316(var1xx).N(class01231.N));
         } else {
            predicate = var1x -> var1.method_8316(var1x).N(class01231.N);
         }

         return class07209.method_25997(class07209, 5, 1, predicate);
      }
   }

   protected boolean N(class04782 var1, E var2, long var3) {
      return true;
   }
}
