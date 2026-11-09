package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public final class class03539<E> implements Codec<class03556<E>> {
   private final class05946<? extends class00751<E>> N;

   private class03539(class05946<? extends class00751<E>> var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "RegistryFixedCodec[" + this.N + "]";
   }

   public <T> DataResult<Pair<class03556<E>, T>> decode(DynamicOps<T> var1, T var2) {
      if (var1 instanceof class03519) {
         Optional optional = ((class03519)var1).y(this.N);
         if (optional.isPresent()) {
            return class01894.N
               .decode(var1, var2)
               .flatMap(
                  var2x -> {
                     class01894 class01894 = (class01894)var2x.getFirst();
                     return ((class02055)optional.get())
                        .N(class05946.N(this.N, class01894))
                        .<DataResult>map(DataResult::success)
                        .orElseGet(() -> DataResult.error(() -> "Failed to get element " + class01894))
                        .map(var1xx -> Pair.of(var1xx, var2x.getSecond()))
                        .setLifecycle(Lifecycle.stable());
                  }
               );
         }
      }

      return DataResult.error(() -> "Can't access registry " + this.N);
   }

   public static <E> class03539<E> N(class05946<? extends class00751<E>> var0) {
      return new class03539<>(var0);
   }

   public <T> DataResult<T> encode(class03556<E> var1, DynamicOps<T> var2, T var3) {
      if (var2 instanceof class03519) {
         Optional optional = ((class03519)var2).N(this.N);
         if (optional.isPresent()) {
            if (!var1.N((class02042<T>)optional.get())) {
               return DataResult.error(() -> "Element " + var1 + " is not valid in current registry set");
            }

            return (DataResult<T>)var1.u()
               .map(
                  var2x -> class01894.N.encode(var2x.N(), var2, var3),
                  var1x -> DataResult.error(() -> "Elements from registry " + this.N + " can't be serialized to a value")
               );
         }
      }

      return DataResult.error(() -> "Can't access registry " + this.N);
   }
}
