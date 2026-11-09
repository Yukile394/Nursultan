package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04685 implements class06386 {
   public static final Codec<class04685> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter(var0x -> var0x.y),
            class01076.N.listOf().fieldOf("spikes").forGetter(var0x -> var0x.L),
            class07209.field_25064.optionalFieldOf("crystal_beam_target").forGetter(var0x -> Optional.ofNullable(var0x.u))
         )
         .apply(var0, class04685::new)
   );
   private final boolean y;
   private final List<class01076> L;
   @Nullable
   private final class07209 u;

   @Nullable
   public class07209 L() {
      return this.u;
   }

   public class04685(boolean var1, List<class01076> var2, @Nullable class07209 var3) {
      this(var1, var2, Optional.ofNullable(var3));
   }

   private class04685(boolean var1, List<class01076> var2, Optional<class07209> var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = (class07209)var3.orElse(null);
   }

   public List<class01076> y() {
      return this.L;
   }

   public boolean N() {
      return this.y;
   }
}
