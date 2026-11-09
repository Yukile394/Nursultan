package minecraft;

import com.google.common.collect.Comparators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public record class07606<T>(List<class07581<T>> keyframes, class07586 easingType) {
   public class07606(List<class07581<T>> keyframes, class07586 easingType) {
      if (keyframes.isEmpty()) {
         throw new IllegalArgumentException("Track has no keyframes");
      } else {
         this.keyframes = keyframes;
         this.easingType = easingType;
      }
   }

   public class07586 y() {
      return this.easingType;
   }

   public static <T> MapCodec<class07606<T>> N(Codec<T> var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(var0x.fieldOf("keyframes").forGetter(class07606::N), class07586.y.optionalFieldOf("ease", class07586.u).forGetter(class07606::y))
            .apply(var1, class07606::new)
      );
   }

   public class07592<T> N(Optional<Integer> var1, class00610<T> var2) {
      return new class07592<>(this, var1, var2);
   }

   static <T> DataResult<List<class07581<T>>> N(List<class07581<T>> var0) {
      if (var0.isEmpty()) {
         return DataResult.error(() -> "Keyframes must not be empty");
      } else if (!Comparators.isInOrder(var0, Comparator.comparingInt(class07581::N))) {
         return DataResult.error(() -> "Keyframes must be ordered by ticks field");
      } else {
         if (var0.size() > 1) {
            int i = 0;
            int j = ((class07581)var0.getLast()).N();

            for (class07581 class07581 : var0) {
               if (class07581.N() == j) {
                  if (++i > 2) {
                     return DataResult.error(() -> "More than 2 keyframes on same tick: " + class07581.N());
                  }
               } else {
                  i = 0;
               }

               j = class07581.N();
            }
         }

         return DataResult.success(var0);
      }
   }

   public List<class07581<T>> N() {
      return this.keyframes;
   }

   public static DataResult<class07606<?>> N(class07606<?> var0, int var1) {
      for (class07581 class07581 : var0.N()) {
         int i = class07581.N();
         if (i < 0 || i > var1) {
            return DataResult.error(() -> "Keyframe at tick " + class07581.N() + " must be in range [0; " + var1 + "]");
         }
      }

      return DataResult.success(var0);
   }
}
