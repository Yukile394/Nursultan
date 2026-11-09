package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import org.slf4j.Logger;

public record class08735(int major, int minor) implements Comparable<class08735> {
   private static final Logger i = LogUtils.getLogger();
   public static final Codec<class08735> N = y(0);
   public static final Codec<class08735> y = y(Integer.MAX_VALUE);

   public int L() {
      return this.minor;
   }

   public class08735(int major, int minor) {
      this.major = major;
      this.minor = minor;
   }

   @Override
   public String toString() {
      return this.minor == Integer.MAX_VALUE ? String.format(Locale.ROOT, "%d.*", this.y()) : String.format(Locale.ROOT, "%d.%d", this.y(), this.L());
   }

   private static Codec<class08735> y(int var0) {
      return class06338.L(class06338.T, class06338.T.listOf(1, 256))
         .xmap(
            var1 -> var1.size() > 1 ? N((Integer)var1.getFirst(), (Integer)var1.get(1)) : N((Integer)var1.getFirst(), var0),
            var1 -> var1.minor != var0 ? List.of(var1.y(), var1.L()) : List.of(var1.y())
         );
   }

   public static MapCodec<class04548<class08735>> y(class01603 var0) {
      int ix = N(var0);
      return class08780.N.flatXmap(var1x -> var1x.N(ix, true, false, "Pack", "supported_formats"), var1x -> DataResult.success(class08780.N(var1x, ix)));
   }

   public int y() {
      return this.major;
   }

   public static int N(class01603 var0) {
      return switch (var0) {
         case field_14188 -> 64;
         case field_14190 -> 81;
      };
   }

   public class04548<class08735> N() {
      return new class04548<>(this, N(this.major, Integer.MAX_VALUE));
   }

   public int compareTo(class08735 var1) {
      int ix = Integer.compare(this.y(), var1.y());
      return ix != 0 ? ix : Integer.compare(this.L(), var1.L());
   }

   public static class08735 N(int var0, int var1) {
      return new class08735(var0, var1);
   }

   public static <ResultType, HolderType extends class08736> DataResult<List<ResultType>> N(
      List<HolderType> var0, int var1, BiFunction<HolderType, class04548<class08735>, ResultType> var2
   ) {
      int ix = var0.stream().map(class08736::N).mapToInt(class08780::N).min().orElse(Integer.MAX_VALUE);
      ArrayList arraylist = new ArrayList(var0.size());

      for (class08736 class08736 : var0) {
         class08780 class08780 = class08736.N();
         if (class08780.y().isEmpty() && class08780.L().isEmpty() && class08780.i().isEmpty()) {
            i.warn("Unknown or broken overlay entry {}", class08736);
         } else {
            DataResult dataresult = class08780.N(var1, false, ix <= var1, "Overlay \"" + class08736 + "\"", "formats");
            if (!dataresult.isSuccess()) {
               return DataResult.error(((Error)dataresult.error().get())::message);
            }

            arraylist.add(var2.apply(class08736, (class04548)dataresult.getOrThrow()));
         }
      }

      return DataResult.success(List.copyOf(arraylist));
   }

   public static class08735 N(int var0) {
      return new class08735(var0, 0);
   }
}
