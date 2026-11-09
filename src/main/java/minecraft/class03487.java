package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03487(class01894 id) implements class06270 {
   public static final MapCodec<class03487> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("id").forGetter(class03487::L)).apply(var0, class03487::new)
   );

   public class01894 L() {
      return this.id;
   }

   public class03487(class01894 id) {
      super();
      this.id = id;
   }

   @Override
   public Either<class06246, class06254> y() {
      return Either.right(new class06254(this.id));
   }

   @Override
   public class05855 N() {
      return class05855.field_44761;
   }
}
