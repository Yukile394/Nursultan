package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class03649(class01471 fallback, List<class04448> rules) {
   public static final Codec<class03649> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01471.N.fieldOf("fallback").forGetter(class03649::N), class04448.N.listOf().fieldOf("rules").forGetter(class03649::y))
         .apply(var0, class03649::new)
   );

   public class03649(class01471 fallback, List<class04448> rules) {
      this.fallback = fallback;
      this.rules = rules;
   }

   public List<class04448> y() {
      return this.rules;
   }

   public static class03649 N(class01471 var0) {
      return new class03649(var0, List.of());
   }

   public static class03649 N(class00891 var0) {
      return N(class01471.N(var0));
   }

   public class01471 N() {
      return this.fallback;
   }

   public class00500 N(class05974 var1, class06069 var2, class07209 var3) {
      for (class04448 class04448 : this.rules) {
         if (class04448.N().test(var1, var3)) {
            return class04448.y().N(var2, var3);
         }
      }

      return this.fallback.N(var2, var3);
   }
}
