package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01677(class01650 scaling) {
   public static final class01677 N = new class01677(class01650.y);
   public static final Codec<class01677> y = RecordCodecBuilder.create(
      var0 -> var0.group(class01650.N.optionalFieldOf("scaling", class01650.y).forGetter(class01677::N)).apply(var0, class01677::new)
   );
   public static final class02968<class01677> L = new class02968<>("gui", y);

   public class01677(class01650 scaling) {
      super();
      this.scaling = scaling;
   }

   public class01650 N() {
      return this.scaling;
   }
}
