package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class03195(long min, long max) {
   public static final Codec<class03195> N = class06338.N(
      Codec.floatRange(-2.0F, 2.0F),
      "min",
      "max",
      (var0, var1) -> var0.compareTo(var1) > 0
         ? DataResult.error(() -> "Cannon construct interval, min > max (" + var0 + " > " + var1 + ")")
         : DataResult.success(new class03195(class03216.N(var0), class03216.N(var1))),
      var0 -> class03216.N(var0.N()),
      var0 -> class03216.N(var0.y())
   );

   public class03195(long min, long max) {
      super();
      this.min = min;
      this.max = max;
   }

   @Override
   public String toString() {
      return this.min == this.max ? String.format(Locale.ROOT, "%d", this.min) : String.format(Locale.ROOT, "[%d-%d]", this.min, this.max);
   }

   public class03195 y(@Nullable class03195 var1) {
      return var1 == null ? this : new class03195(Math.min(this.min, var1.N()), Math.max(this.max, var1.y()));
   }

   public long y() {
      return this.max;
   }

   public static class03195 N(float var0) {
      return N(var0, var0);
   }

   public static class03195 N(class03195 var0, class03195 var1) {
      if (var0.N() > var1.y()) {
         throw new IllegalArgumentException("min > max: " + var0 + " " + var1);
      } else {
         return new class03195(var0.N(), var1.y());
      }
   }

   public long N(long var1) {
      long i = var1 - this.max;
      long j = this.min - var1;
      return i > 0L ? i : Math.max(j, 0L);
   }

   public long N(class03195 var1) {
      long i = var1.N() - this.max;
      long j = this.min - var1.y();
      return i > 0L ? i : Math.max(j, 0L);
   }

   public static class03195 N(float var0, float var1) {
      if (var0 > var1) {
         throw new IllegalArgumentException("min > max: " + var0 + " " + var1);
      } else {
         return new class03195(class03216.N(var0), class03216.N(var1));
      }
   }

   public long N() {
      return this.min;
   }
}
