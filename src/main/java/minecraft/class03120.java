package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record class03120(class05946<class05281> alias, class04540<class05946<class05281>> targets) implements class03129 {
   static MapCodec<class03120> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05946.N(class04227.yv).fieldOf("alias").forGetter(class03120::L),
            class04540.y(class05946.N(class04227.yv)).fieldOf("targets").forGetter(class03120::u)
         )
         .apply(var0, class03120::new)
   );

   public class05946<class05281> L() {
      return this.alias;
   }

   public class03120(class05946<class05281> alias, class04540<class05946<class05281>> targets) {
      super();
      this.alias = alias;
      this.targets = targets;
   }

   public class04540<class05946<class05281>> u() {
      return this.targets;
   }

   @Override
   public MapCodec<class03120> y() {
      return N;
   }

   @Override
   public void N(class06069 var1, BiConsumer<class05946<class05281>, class05946<class05281>> var2) {
      this.targets.N(var1).ifPresent(var2x -> var2.accept(this.alias, var2x));
   }

   @Override
   public Stream<class05946<class05281>> N() {
      return this.targets.u().stream().map(class04523::N);
   }
}
