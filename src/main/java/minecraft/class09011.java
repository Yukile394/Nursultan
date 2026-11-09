package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class09011(int width, class00392 label, String labelFormat, class09041 rangeInfo) implements class09015 {
   public static final MapCodec<class09011> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class09037.y.optionalFieldOf("width", 200).forGetter(class09011::y),
            class03748.N.fieldOf("label").forGetter(class09011::L),
            Codec.STRING.optionalFieldOf("label_format", "options.generic_value").forGetter(class09011::u),
            class09041.N.forGetter(class09011::i)
         )
         .apply(var0, class09011::new)
   );

   public class00392 L() {
      return this.label;
   }

   public class09011(int width, class00392 label, String labelFormat, class09041 rangeInfo) {
      super();
      this.width = width;
      this.label = label;
      this.labelFormat = labelFormat;
      this.rangeInfo = rangeInfo;
   }

   public class09041 i() {
      return this.rangeInfo;
   }

   public String u() {
      return this.labelFormat;
   }

   public int y() {
      return this.width;
   }

   @Override
   public MapCodec<class09011> N() {
      return N;
   }

   public class00392 N(String var1) {
      return class00392.N(this.labelFormat, this.label, var1);
   }
}
