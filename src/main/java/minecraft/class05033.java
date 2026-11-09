package minecraft;

import Nursultan.class10486;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public interface class05033 {
   int L = 16;

   static Keyable y(class05033[] var0) {
      return new class10486(var0);
   }

   static <T extends class05033> Codec<T> y(Supplier<T[]> var0) {
      class05033[] aclass05033 = (class05033[])var0.get();
      Function function = N(aclass05033);
      ToIntFunction tointfunction = class07536.R(Arrays.asList(aclass05033));
      return new class04997<>((T[])aclass05033, function, tointfunction);
   }

   static <T> Function<String, T> N(T[] var0, Function<T, String> var1) {
      return var0.length > 16 ? Arrays.stream(var0).collect(Collectors.toMap(var1, var0x -> var0x))::get : var2 -> {
         for (Object object : var0) {
            if (((String)var1.apply(object)).equals(var2)) {
               return (T)object;
            }
         }

         return null;
      };
   }

   static <E extends Enum<E> & class05033> class05031<E> N(Supplier<E[]> var0) {
      return N(var0, var0x -> var0x);
   }

   static <E extends Enum<E> & class05033> class05031<E> N(Supplier<E[]> var0, Function<String, String> var1) {
      Enum[] aenum = (Enum[])var0.get();
      Function function = N(aenum, var1x -> (String)var1.apply(((class05033)var1x).method_15434()));
      return new class05031<>((E[])aenum, function);
   }

   static <T extends class05033> Function<String, T> N(T[] var0) {
      return N((T[])var0, class05033::method_15434);
   }

   String method_15434();
}
