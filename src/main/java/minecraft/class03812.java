package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03812(String name, long size) {
   public static final Codec<class03812> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.STRING.fieldOf("name").forGetter(class03812::N), Codec.LONG.fieldOf("size").forGetter(class03812::y))
         .apply(var0, class03812::new)
   );

   class03812(String name, long size) {
      super();
      this.name = name;
      this.size = size;
   }

   public long y() {
      return this.size;
   }

   public String N() {
      return this.name;
   }
}
