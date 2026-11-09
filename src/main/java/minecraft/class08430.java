package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08430(String region, String name, boolean bidirectional) {
   public static final Codec<class08430> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.H.fieldOf("region").forGetter(class08430::y),
            class06338.H.fieldOf("name").forGetter(class08430::L),
            Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(class08430::u)
         )
         .apply(var0, class08430::new)
   );

   public String L() {
      return this.name;
   }

   public class08430(String region, String name, boolean bidirectional) {
      super();
      this.region = region;
      this.name = name;
      this.bidirectional = bidirectional;
   }

   public boolean u() {
      return this.bidirectional;
   }

   public String y() {
      return this.region;
   }

   public class00392 N() {
      return class00392.y(this.name + " (" + this.region + ")");
   }
}
