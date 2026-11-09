package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06261(class06270 definition, class02263 filter) {
   public static final Codec<class06261> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06270.y.forGetter(class06261::N), class02263.N.optionalFieldOf("filter", class02263.y).forGetter(class06261::y))
         .apply(var0, class06261::new)
   );

   public class06261(class06270 definition, class02263 filter) {
      super();
      this.definition = definition;
      this.filter = filter;
   }

   public class02263 y() {
      return this.filter;
   }

   public class06270 N() {
      return this.definition;
   }
}
