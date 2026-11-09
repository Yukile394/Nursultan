package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00923(class00926 contents) implements class04439 {
   private static final String L = Character.toString('￼');
   public static final MapCodec<class00923> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06628.N.forGetter(class00923::y)).apply(var0, class00923::new)
   );

   public class00923(class00926 contents) {
      super();
      this.contents = contents;
   }

   public class00926 y() {
      return this.contents;
   }

   @Override
   public MapCodec<class00923> N() {
      return N;
   }

   @Override
   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return var1.accept(var2.N(this.contents.y()), L);
   }

   @Override
   public <T> Optional<T> method_27659(class05977<T> var1) {
      return var1.accept(this.contents.L());
   }
}
