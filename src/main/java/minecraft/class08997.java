package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class08997(int width, List<class09025> entries, class00392 label, boolean labelVisible) implements class09015 {
   public static final MapCodec<class08997> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class09037.y.optionalFieldOf("width", 200).forGetter(class08997::L),
               class06338.y(class09025.y.listOf()).fieldOf("options").forGetter(class08997::u),
               class03748.N.fieldOf("label").forGetter(class08997::i),
               Codec.BOOL.optionalFieldOf("label_visible", true).forGetter(class08997::R)
            )
            .apply(var0, class08997::new)
      )
      .validate(var0 -> var0.entries.stream().filter(class09025::u).count() > 1L ? DataResult.error(() -> "Multiple initial values") : DataResult.success(var0));

   public int L() {
      return this.width;
   }

   public class08997(int width, List<class09025> entries, class00392 label, boolean labelVisible) {
      this.width = width;
      this.entries = entries;
      this.label = label;
      this.labelVisible = labelVisible;
   }

   public class00392 i() {
      return this.label;
   }

   public List<class09025> u() {
      return this.entries;
   }

   public Optional<class09025> y() {
      return this.entries.stream().filter(class09025::u).findFirst();
   }

   @Override
   public MapCodec<class08997> N() {
      return N;
   }

   public boolean R() {
      return this.labelVisible;
   }
}
