package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02552(class00753 offset, Optional<class04025> predicate, class01471 blockState, Optional<class03556<class01194>> triggerGameEvent)
   implements class02560 {
   public static final MapCodec<class02552> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00753.field_25123.optionalFieldOf("offset", class00753.field_11176).forGetter(class02552::y),
            class04025.y.optionalFieldOf("predicate").forGetter(class02552::L),
            class01471.N.fieldOf("block_state").forGetter(class02552::u),
            class01194.Nz.optionalFieldOf("trigger_game_event").forGetter(class02552::i)
         )
         .apply(var0, class02552::new)
   );

   public Optional<class04025> L() {
      return this.predicate;
   }

   public class02552(class00753 offset, Optional<class04025> predicate, class01471 blockState, Optional<class03556<class01194>> triggerGameEvent) {
      super();
      this.offset = offset;
      this.predicate = predicate;
      this.blockState = blockState;
      this.triggerGameEvent = triggerGameEvent;
   }

   public Optional<class03556<class01194>> i() {
      return this.triggerGameEvent;
   }

   public class01471 u() {
      return this.blockState;
   }

   public class00753 y() {
      return this.offset;
   }

   @Override
   public MapCodec<class02552> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class07209 class07209 = class07209.method_49638(var5).method_10081(this.offset);
      if (this.predicate.map(var2x -> var2x.test(var1, class07209)).orElse(true)
         && var1.method_8501(class07209, this.blockState.N(var4.method_59922(), class07209))) {
         this.triggerGameEvent.ifPresent(var3x -> var1.N(var4, (class03556<class01194>)var3x, class07209));
      }
   }
}
