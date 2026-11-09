package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public record class01449(class01894 id) implements class04457 {
   public static final MapCodec<class01449> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("storage").forGetter(class01449::y)).apply(var0, class01449::new)
   );

   public class01449(class01894 id) {
      this.id = id;
   }

   @Override
   public String toString() {
      return "storage=" + this.id;
   }

   public class01894 y() {
      return this.id;
   }

   @Override
   public MapCodec<class01449> N() {
      return N;
   }

   @Override
   public Stream<class07001> N(class07701 var1) {
      return Stream.of(var1.W().yZ().N(this.id));
   }
}
