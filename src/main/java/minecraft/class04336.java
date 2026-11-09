package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record class04336(class03556<class03238<?, ?>> feature, List<class04297> placement) {
   public static final Codec<class04336> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03238.y.fieldOf("feature").forGetter(var0x -> var0x.feature), class04297.y.listOf().fieldOf("placement").forGetter(var0x -> var0x.placement)
         )
         .apply(var0, class04336::new)
   );
   public static final Codec<class03556<class04336>> y = class01281.N(class04227.ys, N);
   public static final Codec<class03543<class04336>> L = class03541.N(class04227.ys, N);
   public static final Codec<List<class03543<class04336>>> u = class03541.N(class04227.ys, N, true).listOf();

   public List<class04297> L() {
      return this.placement;
   }

   public class04336(class03556<class03238<?, ?>> feature, List<class04297> placement) {
      super();
      this.feature = feature;
      this.placement = placement;
   }

   @Override
   public String toString() {
      return "Placed " + this.feature;
   }

   public boolean y(class05974 var1, class08088 var2, class06069 var3, class07209 var4) {
      return this.N(new class01034(var1, var2, Optional.of(this)), var3, var4);
   }

   public class03556<class03238<?, ?>> y() {
      return this.feature;
   }

   private boolean N(class01034 var1, class06069 var2, class07209 var3) {
      Stream stream = Stream.of(var3);

      for (class04297 class04297 : this.placement) {
         stream = stream.flatMap(var3x -> class04297.N(var1, var2, var3x));
      }

      class03238 class03238 = this.feature.N();
      MutableBoolean mutableboolean = new MutableBoolean();
      stream.forEach(var4x -> {
         if (class03238.N(var1.y(), var1.u(), var2, var4x)) {
            mutableboolean.setTrue();
            if (class07529.Na) {
               class04320.N(var1.y().method_8410(), class03238, var1.L());
            }
         }
      });
      return mutableboolean.isTrue();
   }

   public Stream<class03238<?, ?>> N() {
      return this.feature.N().N();
   }

   public boolean N(class05974 var1, class08088 var2, class06069 var3, class07209 var4) {
      return this.N(new class01034(var1, var2, Optional.empty()), var3, var4);
   }
}
