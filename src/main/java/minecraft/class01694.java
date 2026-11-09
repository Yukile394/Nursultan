package minecraft;

import Nursultan.class09500;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class class01694<E extends class07475> extends class05765<E> {
   public static final int N = 160;
   private final ToIntFunction<E> y;
   private final int L;
   private final int u;
   private final float i;
   private final class01328 R;
   private final int Z;
   private final Function<E, class04891> z;
   private Optional<Long> U = Optional.empty();
   private Optional<class09500> E = Optional.empty();

   protected boolean L(class04782 var1, class07475 var2, long var3) {
      return this.E.isPresent() && this.E.get().L().method_5805();
   }

   public class01694(ToIntFunction<E> var1, int var2, int var3, float var4, class01328 var5, int var6, Function<E, class04891> var7) {
      super(
         ImmutableMap.of(
            class05378.P,
            class05367.field_18458,
            class05378.x,
            class05367.field_18457,
            class05378.B,
            class05367.field_18456,
            class05378.D,
            class05367.field_18457
         ),
         160
      );
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.Z = var6;
      this.z = var7;
   }

   protected void u(class04782 var1, E var2, long var3) {
      if (!this.E.isEmpty()) {
         var2.method_18868().N(class05378.m, new class05352(this.E.get().N(), this.i, 0));
         var2.method_18868().N(class05378.P, new class05751(this.E.get().L(), true));
         if (!this.E.get().L().method_24515().equals(this.E.get().y())) {
            var1.method_8421(var2, (byte)59);
            var2.f().W();
            this.y(var2, this.E.get().N);
         } else {
            class07209 class07209 = var2.method_24515();
            if (class07209.equals(this.E.get().N())) {
               var1.method_8421(var2, (byte)58);
               if (this.U.isEmpty()) {
                  this.U = Optional.of(var3);
               }

               if (var3 - this.U.get() >= this.Z) {
                  var2.method_18868().N(class05378.D, this.N(class07209, this.E.get().y()));
                  var1.method_43129(null, var2, this.z.apply((E)var2), class04911.field_15254, 1.0F, var2.method_6017());
                  this.E = Optional.empty();
               }
            }
         }
      }
   }

   private void y(class07475 var1, class07438 var2) {
      this.U = Optional.empty();
      this.E = this.N(var1, var2).map(var1x -> new class09500(var1x, var2.method_24515(), var2));
   }

   protected void y(class04782 var1, E var2, long var3) {
      class01289<?> class01289 = var2.method_18868();
      if (!class01289.N(class05378.D)) {
         var1.method_8421(var2, (byte)59);
         class01289.N(class05378.x, this.y.applyAsInt((E)var2));
      }
   }

   protected void N(class04782 var1, class07475 var2, long var3) {
      var2.method_18868().L(class05378.B).flatMap(var3x -> var3x.N(var3xx -> this.R.N(var1, var2, var3xx))).ifPresent(var2x -> this.y(var2, var2x));
   }

   private class06889 N(class07209 var1, class07209 var2) {
      double d0 = 0.5;
      double d1 = 0.5 * class04995.U((double)(var2.method_10263() - var1.method_10263()));
      double d2 = 0.5 * class04995.U((double)(var2.method_10260() - var1.method_10260()));
      return class06889.L(var2).y(d1, 0.0, d2);
   }

   private Optional<class07209> N(class07475 var1, class07438 var2) {
      class07209 class07209 = var2.method_24515();
      if (!this.N(var1, class07209)) {
         return Optional.empty();
      } else {
         ArrayList arraylist = Lists.newArrayList();
         class07218 class07218 = class07209.method_25503();

         for (class07211 class07211 : class07221.field_11062) {
            class07218.N(class07209);

            for (int ix = 0; ix < this.u; ix++) {
               if (!this.N(var1, class07218.N(class07211))) {
                  class07218.N(class07211.b());
                  break;
               }
            }

            if (class07218.method_19455(class07209) >= this.L) {
               arraylist.add(class07218.method_10062());
            }
         }

         class07623 class07623 = var1.f();
         return arraylist.stream().sorted(Comparator.comparingDouble(var1.method_24515()::method_10262)).filter(var1x -> {
            class00143 class00143 = class07623.N(var1x, 0);
            return class00143 != null && class00143.z();
         }).findFirst();
      }
   }

   private boolean N(class07475 var1, class07209 var2) {
      return var1.f().N(var2) && var1.N(class07955.N(var1, var2)) == 0.0F;
   }
}
