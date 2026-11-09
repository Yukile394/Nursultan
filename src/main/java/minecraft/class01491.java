package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class01491<T> {
   private final T N;
   private long y;

   public T L() {
      return this.N;
   }

   public class01491(T var1, long var2) {
      super();
      this.N = (T)var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return this.N + (this.i() ? " (ttl: " + this.y + ")" : "");
   }

   public boolean i() {
      return this.y != Long.MAX_VALUE;
   }

   public boolean u() {
      return this.y <= 0L;
   }

   public long y() {
      return this.y;
   }

   public static <T> class01491<T> N(T var0, long var1) {
      return new class01491<>((T)var0, var1);
   }

   public static <T> Codec<class01491<T>> N(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
               var0.fieldOf("value").forGetter(var0xx -> var0xx.N),
               Codec.LONG.lenientOptionalFieldOf("ttl").forGetter(var0xx -> var0xx.i() ? Optional.of(var0xx.y) : Optional.empty())
            )
            .apply(var1, (var0xx, var1x) -> new class01491<>(var0xx, var1x.orElse(Long.MAX_VALUE)))
      );
   }

   public void N() {
      if (this.i()) {
         this.y--;
      }
   }

   public static <T> class01491<T> N(T var0) {
      return new class01491<>((T)var0, Long.MAX_VALUE);
   }
}
