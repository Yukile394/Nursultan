package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02717(class03556<class00412> pattern, class06563 color) {
   public static final Codec<class02717> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00412.L.fieldOf("pattern").forGetter(class02717::y), class06563.field_41600.fieldOf("color").forGetter(class02717::L))
         .apply(var0, class02717::new)
   );
   public static final class02362<class04247, class02717> y = class02362.N(class00412.u, class02717::y, class06563.field_49259, class02717::L, class02717::new);

   public class06563 L() {
      return this.color;
   }

   public class02717(class03556<class00412> pattern, class06563 color) {
      this.pattern = pattern;
      this.color = color;
   }

   public class03556<class00412> y() {
      return this.pattern;
   }

   public class05216 N() {
      return class00392.L(this.pattern.N().y() + "." + this.color.y());
   }
}
