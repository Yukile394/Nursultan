package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class class03865 {
   private static final Codec<class03877> u = class04206.Nu.T().dispatch(var0 -> var0.L().N(), Function.identity());
   protected static final double N = 1000000.0;
   static final Codec<Double> y = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<class03877> L = Codec.either(y, u)
      .xmap(
         var0 -> (class03877)var0.map(class03865::N, Function.identity()),
         var0 -> var0 instanceof class03879 ? Either.left(((class03879)var0).u()) : Either.right(var0)
      );

   public static class03877 L(class03877 var0, class03877 var1) {
      return class03871.N(class03892.field_36546, var0, var1);
   }

   public static class03877 L() {
      return class03886.field_36551;
   }

   public static class03877 L(class03556<class05056> var0) {
      return new class03888(new class03876(var0));
   }

   public static class03877 L(class03877 var0) {
      return new class03897(class03909.field_36564, var0);
   }

   private class03865() {
      super();
   }

   public static class03877 i(class03877 var0) {
      return new class03897(class03909.field_36566, var0);
   }

   public static class03877 u(class03877 var0) {
      return new class03897(class03909.field_36565, var0);
   }

   public static class03877 u(class03556<class05056> var0) {
      return new class03910(new class03876(var0));
   }

   public static class03877 u(class03877 var0, class03877 var1) {
      return class03871.N(class03892.field_36547, var0, var1);
   }

   public static class03877 y(class03877 var0, class03877 var1) {
      return class03871.N(class03892.field_36545, var0, var1);
   }

   public static class03877 y(class03556<class05056> var0, double var1, double var3) {
      return new class03870(new class03876(var0), var1, var3);
   }

   public static class03877 y(class03556<class05056> var0) {
      return new class03898(new class03876(var0));
   }

   public static class03877 y() {
      return class03884.field_36549;
   }

   public static class03877 y(class03877 var0) {
      return new class03897(class03909.field_36563, var0);
   }

   public static class03877 N(class04562<class03903, class03890> var0) {
      return new class03887(var0);
   }

   public static class03877 N() {
      return class03879.L;
   }

   public static class03877 N(class03877 var0, double var1, class03877 var3) {
      return N(y(var0, N(var3, N(-var1))), N(var1));
   }

   public static class03877 N(class03877 var0, class03877 var1, int var2, int var3) {
      return new class03889(var0, var1, var2, var3);
   }

   public static class03877 N(class03877 var0, class03891 var1) {
      return class03883.N(var1, var0);
   }

   public static class03877 N(int var0, int var1, double var2, double var4) {
      return new class03902(var0, var1, var2, var4);
   }

   public static class03877 N(double var0) {
      return new class03879(var0);
   }

   public static class03877 N(class03877 var0, class03877 var1, class03877 var2) {
      if (var1 instanceof class03879 class03879) {
         return N(var0, class03879.u(), var2);
      } else {
         class03877 class03877x = u(var0);
         class03877 class03877x = N(y(class03877x, N(-1.0)), N(1.0));
         return N(y(var1, class03877x), y(var2, class03877x));
      }
   }

   private static class03877 N(class03877 var0, double var1, double var3) {
      double d0 = (var1 + var3) * 0.5;
      double d1 = (var3 - var1) * 0.5;
      return N(N(d0), y(N(d1), var0));
   }

   static <O> class03979<O> N(MapCodec<O> var0) {
      return class03979.N(var0);
   }

   public static class03877 N(class03877 var0) {
      return new class03897(class03909.field_36562, var0);
   }

   public static class03877 N(class03556<class05056> var0, @Deprecated double var1, double var3, double var5, double var7) {
      return N(new class03870(new class03876(var0), var1, var3), var5, var7);
   }

   public static class03877 N(class03556<class05056> var0, double var1, double var3, double var5) {
      return N(var0, 1.0, var1, var3, var5);
   }

   public static class03877 N(class03556<class05056> var0, double var1, double var3) {
      return N(var0, 1.0, 1.0, var1, var3);
   }

   private static MapCodec<? extends class03877> N(class00751<MapCodec<? extends class03877>> var0, String var1, class03979<? extends class03877> var2) {
      return class00751.N(var0, var1, var2.N());
   }

   static <A, O> class03979<O> N(Codec<A> var0, Function<A, O> var1, Function<O, A> var2) {
      return class03979.N(var0.fieldOf("argument").xmap(var1, var2));
   }

   static <O> class03979<O> N(Function<class03877, O> var0, Function<O, class03877> var1) {
      return N(class03877.R, var0, var1);
   }

   static <O> class03979<O> N(BiFunction<class03877, class03877, O> var0, Function<O, class03877> var1, Function<O, class03877> var2) {
      return class03979.N(
         RecordCodecBuilder.mapCodec(
            var3 -> var3.group(class03877.R.fieldOf("argument1").forGetter(var1), class03877.R.fieldOf("argument2").forGetter(var2)).apply(var3, var0)
         )
      );
   }

   public static MapCodec<? extends class03877> N(class00751<MapCodec<? extends class03877>> var0) {
      N(var0, "blend_alpha", class03884.field_37079);
      N(var0, "blend_offset", class03886.field_37081);
      N(var0, "beardifier", class03904.L);
      N(var0, "old_blended_noise", class06066.N);

      for (class03909 class03909 : class03909.values()) {
         N(var0, class03909.method_15434(), class03909.field_37089);
      }

      N(var0, "noise", class03870.y);
      N(var0, "end_islands", class03906.N);
      N(var0, "weird_scaled_sampler", class03872.N);
      N(var0, "shifted_noise", class03878.N);
      N(var0, "range_choice", class03893.y);
      N(var0, "shift_a", class03898.N);
      N(var0, "shift_b", class03888.N);
      N(var0, "shift", class03910.N);
      N(var0, "blend_density", class03868.N);
      N(var0, "clamp", class03900.N);

      for (class03891 class03891 : class03891.values()) {
         N(var0, class03891.method_15434(), class03891.field_37087);
      }

      for (class03892 class03892 : class03892.values()) {
         N(var0, class03892.method_15434(), class03892.field_37111);
      }

      N(var0, "spline", class03887.N);
      N(var0, "constant", class03879.y);
      N(var0, "y_clamped_gradient", class03902.N);
      return N(var0, "find_top_surface", class03889.N);
   }

   public static class03877 N(long var0) {
      return new class03906(var0);
   }

   public static class03877 N(class03877 var0, class03556<class05056> var1, class03873 var2) {
      return new class03872(var0, new class03876(var1), var2);
   }

   public static class03877 N(class03877 var0, class03877 var1) {
      return class03871.N(class03892.field_36544, var0, var1);
   }

   public static class03877 N(class03877 var0, class03877 var1, double var2, class03556<class05056> var4) {
      return new class03878(var0, N(), var1, var2, 0.0, new class03876(var4));
   }

   public static class03877 N(class03556<class05056> var0) {
      return y(var0, 1.0, 1.0);
   }

   public static class03877 N(class03556<class05056> var0, double var1) {
      return y(var0, 1.0, var1);
   }

   public static class03877 N(class03877 var0, double var1, double var3, class03877 var5, class03877 var6) {
      return new class03893(var0, var1, var3, var5, var6);
   }

   public static class03877 R(class03877 var0) {
      return new class03868(var0);
   }
}
