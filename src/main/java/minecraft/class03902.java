package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03902(int fromY, int toY, double fromValue, double toValue) implements class03908 {
   private static final MapCodec<class03902> Z = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.intRange(class07376.i * 2, class07376.u * 2).fieldOf("from_y").forGetter(class03902::u),
            Codec.intRange(class07376.i * 2, class07376.u * 2).fieldOf("to_y").forGetter(class03902::i),
            class03865.y.fieldOf("from_value").forGetter(class03902::W),
            class03865.y.fieldOf("to_value").forGetter(class03902::m)
         )
         .apply(var0, class03902::new)
   );
   public static final class03979<class03902> N = class03865.N(Z);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   class03902(int fromY, int toY, double fromValue, double toValue) {
      super();
      this.fromY = fromY;
      this.toY = toY;
      this.fromValue = fromValue;
      this.toValue = toValue;
   }

   public int i() {
      return this.toY;
   }

   public double m() {
      return this.toValue;
   }

   public int u() {
      return this.fromY;
   }

   @Override
   public double y() {
      return Math.max(this.fromValue, this.toValue);
   }

   @Override
   public double N(class03875 var1) {
      return class04995.N((double)var1.L(), (double)this.fromY, (double)this.toY, this.fromValue, this.toValue);
   }

   @Override
   public double N() {
      return Math.min(this.fromValue, this.toValue);
   }

   public double W() {
      return this.fromValue;
   }
}
