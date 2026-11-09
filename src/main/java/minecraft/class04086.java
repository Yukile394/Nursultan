package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04086(class03556<class06581> displayItem, class01584 settings) {
   public static final Codec<class04086> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06581.u.fieldOf("display").forGetter(var0x -> var0x.displayItem), class01584.N.fieldOf("settings").forGetter(var0x -> var0x.settings)
         )
         .apply(var0, class04086::new)
   );
   public static final Codec<class03556<class04086>> y = class01281.N(class04227.yM, N);

   public class04086(class03556<class06581> displayItem, class01584 settings) {
      super();
      this.displayItem = displayItem;
      this.settings = settings;
   }

   public class01584 y() {
      return this.settings;
   }

   public class03556<class06581> N() {
      return this.displayItem;
   }
}
