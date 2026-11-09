package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class class01281<E> implements Codec<class03556<E>> {
   private final class05946<? extends class00751<E>> N;
   private final Codec<E> y;
   private final boolean L;

   private class01281(class05946<? extends class00751<E>> var1, Codec<E> var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.N + " " + this.y + "]";
   }

   public <T> DataResult<Pair<class03556<E>, T>> decode(DynamicOps<T> var1, T var2) {
      if (var1 instanceof class03519) {
         Optional optional = ((class03519)var1).y(this.N);
         if (optional.isEmpty()) {
            return DataResult.error(() -> "Registry does not exist: " + this.N);
         } else {
            class02055 class02055 = (class02055)optional.get();
            DataResult dataresult = class01894.N.decode(var1, var2);
            if (dataresult.result().isEmpty()) {
               return !this.L
                  ? DataResult.error(() -> "Inline definitions not allowed here")
                  : this.y.decode(var1, var2).map(var0 -> var0.mapFirst(class03556::N));
            } else {
               Pair pair = (Pair)dataresult.result().get();
               class05946 class05946 = class05946.N(this.N, (class01894)pair.getFirst());
               return class02055.N(class05946)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Failed to get element " + class05946))
                  .map(var1x -> Pair.of(var1x, pair.getSecond()))
                  .setLifecycle(Lifecycle.stable());
            }
         }
      } else {
         return this.y.decode(var1, var2).map(var0 -> var0.mapFirst(class03556::N));
      }
   }

   public static <E> class01281<E> N(class05946<? extends class00751<E>> var0, Codec<E> var1) {
      return N(var0, var1, true);
   }

   public static <E> class01281<E> N(class05946<? extends class00751<E>> var0, Codec<E> var1, boolean var2) {
      return new class01281<>(var0, var1, var2);
   }

   public <T> DataResult<T> encode(class03556<E> var1, DynamicOps<T> var2, T var3) {
      if (var2 instanceof class03519) {
         Optional optional = ((class03519)var2).N(this.N);
         if (optional.isPresent()) {
            if (!var1.N((class02042<T>)optional.get())) {
               return DataResult.error(() -> "Element " + var1 + " is not valid in current registry set");
            }

            return (DataResult<T>)var1.u().map(var2x -> class01894.N.encode(var2x.N(), var2, var3), var3x -> this.y.encode(var3x, var2, var3));
         }
      }

      return this.y.encode(var1.N(), var2, var3);
   }
}
