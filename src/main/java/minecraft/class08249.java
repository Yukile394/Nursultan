package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class08249(class08264 format, class08269 entry) {
   public static final Codec<class08249> N = RecordCodecBuilder.create(
      var0 -> var0.group(class08264.field_53710.fieldOf("format").forGetter(class08249::N), class08269.N.forGetter(class08249::y)).apply(var0, class08249::new)
   );

   class08249(class08264 format, class08269 entry) {
      super();
      this.format = format;
      this.entry = entry;
   }

   public class08269 y() {
      return this.entry;
   }

   public class08264 N() {
      return this.format;
   }
}
