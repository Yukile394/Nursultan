package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.regex.Pattern;

public record class04150(List<class04152> overlays) {
   private static final Pattern u = Pattern.compile("[-_a-zA-Z0-9.]+");
   public static final class02968<class04150> N = new class02968<>("overlays", N(class01603.field_14188));
   public static final class02968<class04150> y = new class02968<>("overlays", N(class01603.field_14190));

   public class04150(List<class04152> overlays) {
      this.overlays = overlays;
   }

   public static class02968<class04150> y(class01603 var0) {
      return switch (var0) {
         case field_14188 -> N;
         case field_14190 -> y;
      };
   }

   public static Codec<class04150> N(class01603 var0) {
      return RecordCodecBuilder.create(var1 -> var1.group(class04152.N(var0).fieldOf("entries").forGetter(class04150::N)).apply(var1, class04150::new));
   }

   public List<class04152> N() {
      return this.overlays;
   }

   public static DataResult<String> N(String var0) {
      return !u.matcher(var0).matches() ? DataResult.error(() -> var0 + " is not accepted directory name") : DataResult.success(var0);
   }

   public List<String> N(class08735 var1) {
      return this.overlays.stream().filter(var1x -> var1x.N(var1)).map(class04152::y).toList();
   }
}
