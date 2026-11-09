package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record class03141(class05946<class05281> alias, class05946<class05281> target) implements class03129 {
   static MapCodec<class03141> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05946.N(class04227.yv).fieldOf("alias").forGetter(class03141::L), class05946.N(class04227.yv).fieldOf("target").forGetter(class03141::u)
         )
         .apply(var0, class03141::new)
   );

   public class05946<class05281> L() {
      return this.alias;
   }

   public class03141(class05946<class05281> alias, class05946<class05281> target) {
      super();
      this.alias = alias;
      this.target = target;
   }

   public class05946<class05281> u() {
      return this.target;
   }

   @Override
   public MapCodec<class03141> y() {
      return N;
   }

   @Override
   public Stream<class05946<class05281>> N() {
      return Stream.of(this.target);
   }

   @Override
   public void N(class06069 var1, BiConsumer<class05946<class05281>, class05946<class05281>> var2) {
      var2.accept(this.alias, this.target);
   }
}
