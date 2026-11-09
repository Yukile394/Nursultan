package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class04166(class08780 format, String overlay) implements class08736 {
   static final Codec<class04166> N = RecordCodecBuilder.create(
      var0 -> var0.group(class08780.y.forGetter(class04166::N), Codec.STRING.validate(class04150::N).fieldOf("directory").forGetter(class04166::y))
         .apply(var0, class04166::new)
   );

   class04166(class08780 format, String overlay) {
      this.format = format;
      this.overlay = overlay;
   }

   @Override
   public String toString() {
      return this.overlay;
   }

   public String y() {
      return this.overlay;
   }

   @Override
   public class08780 N() {
      return this.format;
   }
}
