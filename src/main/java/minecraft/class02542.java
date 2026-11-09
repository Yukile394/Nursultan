package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02542(class02841 properties, class00753 offset, Optional<class03556<class01194>> triggerGameEvent) implements class02560 {
   public static final MapCodec<class02542> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02841.y.fieldOf("properties").forGetter(class02542::y),
            class00753.field_25123.optionalFieldOf("offset", class00753.field_11176).forGetter(class02542::L),
            class01194.Nz.optionalFieldOf("trigger_game_event").forGetter(class02542::u)
         )
         .apply(var0, class02542::new)
   );

   public class00753 L() {
      return this.offset;
   }

   public class02542(class02841 var1) {
      this(var1, class00753.field_11176, Optional.of(class01194.L));
   }

   public class02542(class02841 properties, class00753 offset, Optional<class03556<class01194>> triggerGameEvent) {
      super();
      this.properties = properties;
      this.offset = offset;
      this.triggerGameEvent = triggerGameEvent;
   }

   public Optional<class03556<class01194>> u() {
      return this.triggerGameEvent;
   }

   public class02841 y() {
      return this.properties;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class07209 class07209 = class07209.method_49638(var5).method_10081(this.offset);
      class00500 class00500x = var4.method_73183().method_8320(class07209);
      class00500 class00500x = this.properties.N(class00500x);
      if (class00500x != class00500x && var4.method_73183().method_8652(class07209, class00500x, 3)) {
         this.triggerGameEvent.ifPresent(var3x -> var1.N(var4, (class03556<class01194>)var3x, class07209));
      }
   }

   @Override
   public MapCodec<class02542> N() {
      return N;
   }
}
