package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09035(int width, class00392 label, boolean labelVisible, String initial, int maxLength, Optional<class00102> multiline) implements class09015 {
   public static final MapCodec<class09035> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class09037.y.optionalFieldOf("width", 200).forGetter(class09035::y),
               class03748.N.fieldOf("label").forGetter(class09035::L),
               Codec.BOOL.optionalFieldOf("label_visible", true).forGetter(class09035::u),
               Codec.STRING.optionalFieldOf("initial", "").forGetter(class09035::i),
               class06338.b.optionalFieldOf("max_length", 32).forGetter(class09035::R),
               class00102.y.optionalFieldOf("multiline").forGetter(class09035::M)
            )
            .apply(var0, class09035::new)
      )
      .validate(var0 -> var0.initial.length() > var0.R() ? DataResult.error(() -> "Default text length exceeds allowed size") : DataResult.success(var0));

   public class00392 L() {
      return this.label;
   }

   public Optional<class00102> M() {
      return this.multiline;
   }

   public class09035(int width, class00392 label, boolean labelVisible, String initial, int maxLength, Optional<class00102> multiline) {
      this.width = width;
      this.label = label;
      this.labelVisible = labelVisible;
      this.initial = initial;
      this.maxLength = maxLength;
      this.multiline = multiline;
   }

   public String i() {
      return this.initial;
   }

   public boolean u() {
      return this.labelVisible;
   }

   public int y() {
      return this.width;
   }

   @Override
   public MapCodec<class09035> N() {
      return N;
   }

   public int R() {
      return this.maxLength;
   }
}
