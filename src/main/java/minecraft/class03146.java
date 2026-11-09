package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record class03146(class04540<List<class03129>> groups) implements class03129 {
   static MapCodec<class03146> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04540.y(Codec.list(class03129.y)).fieldOf("groups").forGetter(class03146::L)).apply(var0, class03146::new)
   );

   public class04540<List<class03129>> L() {
      return this.groups;
   }

   public class03146(class04540<List<class03129>> groups) {
      this.groups = groups;
   }

   @Override
   public MapCodec<class03146> y() {
      return N;
   }

   @Override
   public Stream<class05946<class05281>> N() {
      return this.groups.u().stream().flatMap(var0 -> var0.N().stream()).flatMap(class03129::N);
   }

   @Override
   public void N(class06069 var1, BiConsumer<class05946<class05281>, class05946<class05281>> var2) {
      this.groups.N(var1).ifPresent(var2x -> var2x.forEach(var2xx -> var2xx.N(var1, var2)));
   }
}
