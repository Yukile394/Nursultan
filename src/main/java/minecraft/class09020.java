package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class09020(class00392 label, boolean initial, String onTrue, String onFalse) implements class09015 {
   public static final MapCodec<class09020> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03748.N.fieldOf("label").forGetter(class09020::y),
            Codec.BOOL.optionalFieldOf("initial", false).forGetter(class09020::L),
            Codec.STRING.optionalFieldOf("on_true", "true").forGetter(class09020::u),
            Codec.STRING.optionalFieldOf("on_false", "false").forGetter(class09020::i)
         )
         .apply(var0, class09020::new)
   );

   public boolean L() {
      return this.initial;
   }

   public class09020(class00392 label, boolean initial, String onTrue, String onFalse) {
      this.label = label;
      this.initial = initial;
      this.onTrue = onTrue;
      this.onFalse = onFalse;
   }

   public String i() {
      return this.onFalse;
   }

   public String u() {
      return this.onTrue;
   }

   public class00392 y() {
      return this.label;
   }

   @Override
   public MapCodec<class09020> N() {
      return N;
   }
}
