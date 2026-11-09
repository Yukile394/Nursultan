package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class class05585 extends class05765<class07475> {
   public static final int N = 100;
   public static final double y = 2.5;
   public static final double L = 3.5;
   private final Function<class07438, Float> u;
   private final Function<class07438, Double> i;
   private final boolean R;

   protected void L(class04782 var1, class07475 var2, long var3) {
      class01289<?> class01289 = var2.method_18868();
      class01289.N(class05378.p, 100);
      class01289.y(class05378.A);
      class01289.y(class05378.m);
      class01289.y(class05378.P);
   }

   public class05585(Function<class07438, Float> var1) {
      this(var1, var0 -> 2.5);
   }

   public class05585(Function<class07438, Float> var1, Function<class07438, Double> var2, boolean var3) {
      super(class07536.N(() -> {
         Builder builder = ImmutableMap.builder();
         builder.put(class05378.P, class05367.field_18458);
         builder.put(class05378.m, class05367.field_18458);
         builder.put(class05378.p, class05367.field_18457);
         builder.put(class05378.A, class05367.field_18457);
         builder.put(class05378.a, class05367.field_18456);
         builder.put(class05378.j, class05367.field_18457);
         builder.put(class05378.NN, class05367.field_18457);
         return builder.build();
      }));
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   public class05585(Function<class07438, Float> var1, Function<class07438, Double> var2) {
      this(var1, var2, false);
   }

   protected void u(class04782 var1, class07475 var2, long var3) {
      class08036 class08036 = this.y(var2).get();
      class01289<?> class01289 = var2.method_18868();
      class01289.N(class05378.P, new class05751(class08036, true));
      double d0 = this.i.apply(var2);
      if (var2.method_5858(class08036) < class04995.E(d0)) {
         class01289.y(class05378.m);
      } else {
         class01289.N(class05378.m, new class05352(new class05751(class08036, this.R, this.R), this.N(var2), 2));
      }
   }

   private Optional<class08036> y(class07475 var1) {
      return var1.method_18868().L(class05378.a);
   }

   protected void y(class04782 var1, class07475 var2, long var3) {
      var2.method_18868().N(class05378.A, true);
   }

   protected float N(class07475 var1) {
      return this.u.apply(var1);
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   protected boolean N(class04782 var1, class07475 var2, long var3) {
      return this.y(var2).isPresent() && !var2.method_18868().N(class05378.j) && !var2.method_18868().N(class05378.NN);
   }
}
