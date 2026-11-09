package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08635(class07209 pos, class00392 text) {
   public static final Codec<class08635> N = RecordCodecBuilder.create(
      var0 -> var0.group(class07209.field_25064.fieldOf("pos").forGetter(class08635::N), class03748.N.fieldOf("text").forGetter(class08635::y))
         .apply(var0, class08635::new)
   );
   public static final Codec<List<class08635>> y = N.listOf();

   public class08635(class07209 pos, class00392 text) {
      this.pos = pos;
      this.text = text;
   }

   public class00392 y() {
      return this.text;
   }

   public class07209 N() {
      return this.pos;
   }
}
