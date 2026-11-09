package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;

record class04885(int id, class04877 raid) {
   public static final Codec<class04885> L = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("id").forGetter(class04885::N), class04877.y.forGetter(class04885::y)).apply(var0, class04885::new)
   );

   private class04885(int id, class04877 raid) {
      this.id = id;
      this.raid = raid;
   }

   public class04877 y() {
      return this.raid;
   }

   public int N() {
      return this.id;
   }

   public static class04885 N(Entry<class04877> var0) {
      return new class04885(var0.getIntKey(), (class04877)var0.getValue());
   }
}
