package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02522(
   class02546 radius,
   class02546 height,
   class00753 offset,
   Optional<class04025> predicate,
   class01471 blockState,
   Optional<class03556<class01194>> triggerGameEvent
) implements class02560 {
   public static final MapCodec<class02522> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02546.y.fieldOf("radius").forGetter(class02522::y),
            class02546.y.fieldOf("height").forGetter(class02522::L),
            class00753.field_25123.optionalFieldOf("offset", class00753.field_11176).forGetter(class02522::u),
            class04025.y.optionalFieldOf("predicate").forGetter(class02522::i),
            class01471.N.fieldOf("block_state").forGetter(class02522::R),
            class01194.Nz.optionalFieldOf("trigger_game_event").forGetter(class02522::M)
         )
         .apply(var0, class02522::new)
   );

   public class02546 L() {
      return this.height;
   }

   public Optional<class03556<class01194>> M() {
      return this.triggerGameEvent;
   }

   public class02522(
      class02546 radius,
      class02546 height,
      class00753 offset,
      Optional<class04025> predicate,
      class01471 blockState,
      Optional<class03556<class01194>> triggerGameEvent
   ) {
      super();
      this.radius = radius;
      this.height = height;
      this.offset = offset;
      this.predicate = predicate;
      this.blockState = blockState;
      this.triggerGameEvent = triggerGameEvent;
   }

   public Optional<class04025> i() {
      return this.predicate;
   }

   public class00753 u() {
      return this.offset;
   }

   public class02546 y() {
      return this.radius;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class07209 class07209x = class07209.method_49638(var5).method_10081(this.offset);
      class06069 class06069 = var4.method_59922();
      int i = (int)this.radius.N(var2);
      int j = (int)this.height.N(var2);

      for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-i, 0, -i), class07209x.method_10069(i, Math.min(j - 1, 0), i))) {
         if (class07209x.method_10268(var5.N(), class07209x.method_10264() + 0.5, var5.L()) < class04995.Z(i)
            && this.predicate.map(var2x -> var2x.test(var1, class07209)).orElse(true)
            && var1.method_8501(class07209x, this.blockState.N(class06069, class07209x))) {
            this.triggerGameEvent.ifPresent(var3x -> var1.N(var4, (class03556<class01194>)var3x, class07209));
         }
      }
   }

   @Override
   public MapCodec<class02522> N() {
      return N;
   }

   public class01471 R() {
      return this.blockState;
   }
}
