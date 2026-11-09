package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class class04421 {
   public static final Codec<class04421> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.G.optionalFieldOf("namespace").forGetter(var0x -> var0x.y), class06338.G.optionalFieldOf("path").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class04421::new)
   );
   private final Optional<Pattern> y;
   private final Predicate<String> L;
   private final Optional<Pattern> u;
   private final Predicate<String> i;
   private final Predicate<class01894> R;

   public Predicate<class01894> L() {
      return this.R;
   }

   private class04421(Optional<Pattern> var1, Optional<Pattern> var2) {
      super();
      this.y = var1;
      this.L = var1.map(Pattern::asPredicate).orElse(var0 -> true);
      this.u = var2;
      this.i = var2.map(Pattern::asPredicate).orElse(var0 -> true);
      this.R = var1x -> this.L.test(var1x.y()) && this.i.test(var1x.N());
   }

   public Predicate<String> y() {
      return this.i;
   }

   public Predicate<String> N() {
      return this.L;
   }
}
