package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.RewriteResult;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.View;
import com.mojang.datafixers.functions.PointFreeRule;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.BitSet;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class02269 {
   public class02269() {
      super();
   }

   public static <T> Typed<?> N(Typed<?> var0, OpticFinder<T> var1, Dynamic<?> var2) {
      return var0.set(var1, class07536.N(var1.type(), var2, true));
   }

   public static String N(int var0) {
      return switch (var0) {
         case 1 -> "orange";
         case 2 -> "magenta";
         case 3 -> "light_blue";
         case 4 -> "yellow";
         case 5 -> "lime";
         case 6 -> "pink";
         case 7 -> "gray";
         case 8 -> "light_gray";
         case 9 -> "cyan";
         case 10 -> "purple";
         case 11 -> "blue";
         case 12 -> "brown";
         case 13 -> "green";
         case 14 -> "red";
         case 15 -> "black";
         default -> "white";
      };
   }

   public static Dynamic<?> N(Dynamic<?> var0, String var1, UnaryOperator<String> var2) {
      return var0.update(var1, var2x -> (Dynamic)DataFixUtils.orElse(var2x.asString().map(var2).map(var0::createString).result(), var2x));
   }

   public static Dynamic<?> N(String var0) {
      return N(var0, Map.of());
   }

   public static <T> Typed<T> N(Type<T> var0, Object var1, DynamicOps<?> var2) {
      return new Typed(var0, var2, var1);
   }

   public static <T, R> Typed<R> N(Type<R> var0, Typed<T> var1) {
      return new Typed(var0, var1.getOps(), var1.getValue());
   }

   public static Dynamic<?> N(Dynamic<?> var0, int var1, int var2, int var3) {
      return var0.createIntList(IntStream.of(var1, var2, var3));
   }

   public static Dynamic<?> N(Dynamic<?> var0, String var1, String var2, String var3, String var4) {
      Optional<Number> optional = var0.get(var1).asNumber().result();
      Optional<Number> optional1 = var0.get(var2).asNumber().result();
      Optional<Number> optional2 = var0.get(var3).asNumber().result();
      return !optional.isEmpty() && !optional1.isEmpty() && !optional2.isEmpty()
         ? var0.remove(var1).remove(var2).remove(var3).set(var4, N(var0, optional.get().intValue(), optional1.get().intValue(), optional2.get().intValue()))
         : var0;
   }

   public static Dynamic<?> N(Dynamic<?> var0) {
      Optional<Number> optional = var0.get("X").asNumber().result();
      Optional<Number> optional1 = var0.get("Y").asNumber().result();
      Optional<Number> optional2 = var0.get("Z").asNumber().result();
      return !optional.isEmpty() && !optional1.isEmpty() && !optional2.isEmpty()
         ? N(var0, optional.get().intValue(), optional1.get().intValue(), optional2.get().intValue())
         : var0;
   }

   public static Dynamic<?> N(String var0, Map<String, String> var1) {
      Dynamic dynamic = new Dynamic(class07713.N, new class07001());
      Dynamic dynamic1 = dynamic.set("Name", dynamic.createString(var0));
      if (!var1.isEmpty()) {
         dynamic1 = dynamic1.set(
            "Properties",
            dynamic.createMap(
               var1.entrySet()
                  .stream()
                  .collect(Collectors.toMap(var1x -> dynamic.createString((String)var1x.getKey()), var1x -> dynamic.createString((String)var1x.getValue())))
            )
         );
      }

      return dynamic1;
   }

   @SafeVarargs
   public static <T> Function<Typed<?>, Typed<?>> N(Function<Typed<?>, Typed<?>>... var0) {
      return var1 -> {
         Function[] afunction = var0;
         int i = var0.length;

         for (int j = 0; j < i; j++) {
            var1 = (Typed<?>)afunction[j].apply(var1);
         }

         return var1;
      };
   }

   private static <A, B> TypeRewriteRule N(Type<A> var0, Type<B> var1) {
      RewriteResult rewriteresult = RewriteResult.create(View.create("Patcher", var0, var1, var0x -> var0xx -> {
         throw new UnsupportedOperationException();
      }), new BitSet());
      return TypeRewriteRule.everywhere(TypeRewriteRule.ifSame(var0, rewriteresult), PointFreeRule.nop(), true, true);
   }

   public static Type<?> N(Type<?> var0, Type<?> var1, Type<?> var2) {
      return var0.all(N(var1, var2), true, false).view().newType();
   }
}
