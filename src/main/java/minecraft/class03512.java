package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class03512 {
   public static final Codec<class03512> N = RecordCodecBuilder.create(
      var0 -> var0.group(class04042.y.fieldOf("source").forGetter(var0x -> var0x.y)).apply(var0, class03512::new)
   );
   private final class04042 y;

   public class03512(long var1, Optional<class01894> var3) {
      this(N(var1, var3));
   }

   public class03512(long var1, class01894 var3) {
      this(N(var1, Optional.of(var3)));
   }

   public class03512(class04042 var1) {
      super();
      this.y = var1;
   }

   public static class04037 N(class01894 var0) {
      return class04043.N(var0.toString());
   }

   public class06069 N() {
      return this.y;
   }

   private static class04042 N(long var0, Optional<class01894> var2) {
      class04037 class04037 = class04043.y(var0);
      if (var2.isPresent()) {
         class04037 = class04037.N(N((class01894)var2.get()));
      }

      return new class04042(class04037.N());
   }
}
