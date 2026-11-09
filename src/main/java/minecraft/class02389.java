package minecraft;

import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;

public interface class02389 {
   int N = 65536;
   class02362<ByteBuf, Boolean> y = new class02376();
   class02362<ByteBuf, Byte> L = new class02383();
   class02362<ByteBuf, Float> u = L.N_10(class04995::N, class04995::i);
   class02362<ByteBuf, Short> i = new class02394();
   class02362<ByteBuf, Integer> R = new class02375();
   class02362<ByteBuf, Integer> M = new class02373();
   class02362<ByteBuf, Integer> B = new class02388();
   class02362<ByteBuf, OptionalInt> Z = B.N_10(
      var0 -> var0 == 0 ? OptionalInt.empty() : OptionalInt.of(var0 - 1), var0 -> var0.isPresent() ? var0.getAsInt() + 1 : 0
   );
   class02362<ByteBuf, Long> z = new class02368();
   class02362<ByteBuf, Long> U = new class02369();
   class02362<ByteBuf, Float> E = new class02395();
   class02362<ByteBuf, Double> W = new class02377();
   class02362<ByteBuf, byte[]> m = new class02397();
   class02362<ByteBuf, long[]> P = new class02370();
   class02362<ByteBuf, String> s = y(32767);
   class02362<ByteBuf, class07709> T = y(class07726::N);
   class02362<ByteBuf, class07709> b = y(class07726::L);
   class02362<ByteBuf, class07001> j = L(class07726::N);
   class02362<ByteBuf, class07001> v = L(class07726::L);
   class02362<ByteBuf, Optional<class07001>> n = new class02363();
   class02362<ByteBuf, Vector3fc> t = new class02404();
   class02362<ByteBuf, Quaternionfc> G = new class02378();
   class02362<ByteBuf, Integer> l = new class02364();
   class02362<ByteBuf, PropertyMap> d = new class02392();
   class02362<ByteBuf, String> w = y(16);
   class02362<ByteBuf, GameProfile> k = class02362.N(class01487.M, GameProfile::id, w, GameProfile::name, d, GameProfile::properties, GameProfile::new);
   class02362<ByteBuf, Integer> Y = new class02386();

   static <T> class02362<class04247, class03543<T>> L(class05946<? extends class00751<T>> var0) {
      return new class02366<>(var0);
   }

   static class02362<ByteBuf, class07001> L(Supplier<class07726> var0) {
      return y(var0).N_10(var0x -> {
         if (var0x instanceof class07001) {
            return (class07001)var0x;
         } else {
            throw new DecoderException("Not a compound tag: " + var0x);
         }
      }, var0x -> (class07709)var0x);
   }

   static <T> class02362<class04247, T> L(Codec<T> var0) {
      return y(var0, class07726::L);
   }

   static <B extends ByteBuf, V> class02876<B, V, List<V>> L(int var0) {
      return var1 -> N(ArrayList::new, var1, var0);
   }

   static <V> class02876<class04247, V, V> i(int var0) {
      return N(var0, (var0x, var1) -> new class04247(var1, var0x.J()));
   }

   static <T> class02362<class04247, T> u(Codec<T> var0) {
      return y(var0, class07726::N);
   }

   static <V> class02876<ByteBuf, V, V> u(int var0) {
      return N(var0, (var0x, var1) -> var1);
   }

   static <T> class02362<class04247, class03556<T>> y(class05946<? extends class00751<T>> var0) {
      return N(var0, class00751::v);
   }

   static <T> class02362<class04247, T> y(Codec<T> var0, Supplier<class07726> var1) {
      class02362 class02362 = y(var1);
      return new class02371<>(class02362, var0);
   }

   static <T> class02362<ByteBuf, T> y(Codec<T> var0) {
      return N(var0, class07726::N);
   }

   static class02362<ByteBuf, String> y(int var0) {
      return new class02379(var0);
   }

   static class02362<ByteBuf, class07709> y(Supplier<class07726> var0) {
      return new class02367(var0);
   }

   static <T> class02362<class04247, class03556<T>> N(class05946<? extends class00751<T>> var0, class02362<? super class04247, T> var1) {
      return new class02399<>(var0, var1);
   }

   private static <T, R> class02362<class04247, R> N(class05946<? extends class00751<T>> var0, Function<class00751<T>, class00750<R>> var1) {
      return new class02401<>(var1, var0);
   }

   static class02362<ByteBuf, byte[]> N(int var0) {
      return new class02382(var0);
   }

   static <T> class02362<class04247, T> N(class05946<? extends class00751<T>> var0) {
      return N(var0, var0x -> var0x);
   }

   static <B extends ByteBuf, V> class02362<B, Optional<V>> N(class02362<? super B, V> var0) {
      return new class02380<>(var0);
   }

   static int N(ByteBuf var0, int var1) {
      int ix = class01657.N(var0);
      if (ix > var1) {
         throw new DecoderException(ix + " elements exceeded max size of: " + var1);
      } else {
         return ix;
      }
   }

   static void N(ByteBuf var0, int var1, int var2) {
      if (var1 > var2) {
         throw new EncoderException(var1 + " elements exceeded max size of: " + var2);
      } else {
         class01657.N(var0, var1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> class02362<B, C> N(IntFunction<C> var0, class02362<? super B, V> var1) {
      return N(var0, var1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> class02362<B, C> N(IntFunction<C> var0, class02362<? super B, V> var1, int var2) {
      return new class02393<>(var2, var0, var1);
   }

   static class02362<ByteBuf, Optional<class07709>> N_35(Supplier<class07726> var0) {
      return new class02387(var0);
   }

   static <T> class02362<ByteBuf, T> N(Codec<T> var0) {
      return N(var0, class07726::L);
   }

   static <T, B extends ByteBuf, V> class02876<B, T, V> N(DynamicOps<T> var0, Codec<V> var1) {
      return var2 -> new class02385<>(var2, var1, var0);
   }

   static <T> class02362<ByteBuf, T> N(Codec<T> var0, Supplier<class07726> var1) {
      return y(var1).N_33(N(class07713.N, var0));
   }

   static <T> class02362<ByteBuf, T> N(class00750<T> var0) {
      return N(var0::y, var0::L);
   }

   static <B extends ByteBuf, L, R> class02362<B, Either<L, R>> N(class02362<? super B, L> var0, class02362<? super B, R> var1) {
      return new class02398<>(var0, var1);
   }

   static <B extends ByteBuf, V> class02876<B, V, V> N(int var0, BiFunction<B, ByteBuf, B> var1) {
      return var2 -> new class02384<>(var0, var1, var2);
   }

   static <T> class02362<ByteBuf, T> N(IntFunction<T> var0, ToIntFunction<T> var1) {
      return new class02390<>(var0, var1);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> class02876<B, V, C> N(IntFunction<C> var0) {
      return var1 -> N(var0, var1);
   }

   static <B extends ByteBuf, V> class02876<B, V, List<V>> N() {
      return var0 -> N(ArrayList::new, var0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> class02362<B, M> N(
      IntFunction<? extends M> var0, class02362<? super B, K> var1, class02362<? super B, V> var2
   ) {
      return N(var0, var1, var2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> class02362<B, M> N(
      IntFunction<? extends M> var0, class02362<? super B, K> var1, class02362<? super B, V> var2, int var3
   ) {
      return new class02374<>(var3, var1, var2, var0);
   }

   static class02362<ByteBuf, JsonElement> R(int var0) {
      return new class02402(var0);
   }
}
