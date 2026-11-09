package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

public record class05056(int firstOctave, DoubleList amplitudes) {
   public static final Codec<class05056> L = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("firstOctave").forGetter(class05056::N), Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(class05056::y))
         .apply(var0, class05056::new)
   );
   public static final Codec<class03556<class05056>> u = class01281.N(class04227.yW, L);

   public class05056(int firstOctave, DoubleList amplitudes) {
      super();
      this.firstOctave = firstOctave;
      this.amplitudes = amplitudes;
   }

   public class05056(int var1, double var2, double... var4) {
      this(var1, class07536.N(new DoubleArrayList(var4), var2x -> var2x.add(0, var2)));
   }

   public class05056(int var1, List<Double> var2) {
      this(var1, new DoubleArrayList(var2));
   }

   public DoubleList y() {
      return this.amplitudes;
   }

   public int N() {
      return this.firstOctave;
   }
}
