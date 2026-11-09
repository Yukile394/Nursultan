package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

record class04886(List<class06261> providers) {
   public static final Codec<class04886> y = RecordCodecBuilder.create(
      var0 -> var0.group(class06261.N.listOf().fieldOf("providers").forGetter(class04886::N)).apply(var0, class04886::new)
   );

   private class04886(List<class06261> providers) {
      this.providers = providers;
   }

   public List<class06261> N() {
      return this.providers;
   }
}
