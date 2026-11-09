package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class06414 implements class06386 {
   public static final Codec<class06414> N = RecordCodecBuilder.create(
      var0 -> var0.group(class07209.field_25064.optionalFieldOf("exit").forGetter(var0x -> var0x.y), Codec.BOOL.fieldOf("exact").forGetter(var0x -> var0x.L))
         .apply(var0, class06414::new)
   );
   private final Optional<class07209> y;
   private final boolean L;

   public boolean L() {
      return this.L;
   }

   private class06414(Optional<class07209> var1, boolean var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public Optional<class07209> y() {
      return this.y;
   }

   public static class06414 N() {
      return new class06414(Optional.empty(), false);
   }

   public static class06414 N(class07209 var0, boolean var1) {
      return new class06414(Optional.of(var0), var1);
   }
}
