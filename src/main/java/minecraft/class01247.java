package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class01247 {
   public static final class01247 N = new class01247(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<class01247> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.listOf().fieldOf("Enabled").forGetter(var0x -> var0x.L), Codec.STRING.listOf().fieldOf("Disabled").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01247::new)
   );
   private final List<String> L;
   private final List<String> u;

   public class01247(List<String> var1, List<String> var2) {
      super();
      this.L = ImmutableList.copyOf(var1);
      this.u = ImmutableList.copyOf(var2);
   }

   public List<String> y() {
      return this.u;
   }

   public List<String> N() {
      return this.L;
   }
}
