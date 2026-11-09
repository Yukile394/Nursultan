package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record class04491(Map<Character, class06510> key, List<String> pattern) {
   private static final Codec<List<String>> u = Codec.STRING.listOf().comapFlatMap(var0 -> {
      if (var0.size() > 3) {
         return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
      } else if (var0.isEmpty()) {
         return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
      } else {
         int ix = ((String)var0.getFirst()).length();

         for (String s : var0) {
            if (s.length() > 3) {
               return DataResult.error(() -> "Invalid pattern: too many columns, 3 is maximum");
            }

            if (ix != s.length()) {
               return DataResult.error(() -> "Invalid pattern: each row must be the same width");
            }
         }

         return DataResult.success(var0);
      }
   }, Function.identity());
   private static final Codec<Character> i = Codec.STRING.comapFlatMap(var0 -> {
      if (var0.length() != 1) {
         return DataResult.error(() -> "Invalid key entry: '" + var0 + "' is an invalid symbol (must be 1 character only).");
      } else {
         return " ".equals(var0) ? DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.") : DataResult.success(var0.charAt(0));
      }
   }, String::valueOf);
   public static final MapCodec<class04491> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.y(i, class06510.field_46095).fieldOf("key").forGetter(var0x -> var0x.key), u.fieldOf("pattern").forGetter(var0x -> var0x.pattern)
         )
         .apply(var0, class04491::new)
   );

   public class04491(Map<Character, class06510> key, List<String> pattern) {
      super();
      this.key = key;
      this.pattern = pattern;
   }

   public List<String> y() {
      return this.pattern;
   }

   public Map<Character, class06510> N() {
      return this.key;
   }
}
