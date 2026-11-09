package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class05057 extends class04872 {
   public static final MapCodec<class05057> R = RecordCodecBuilder.mapCodec(var0 -> var0.group(u(), y(), R(), L()).apply(var0, class05057::new));

   public class05057(Either<class01894, class01207> var1, class03556<class05483> var2, class05246 var3, Optional<class02610> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.y + "]";
   }

   @Override
   public class05267<?> N() {
      return class05267.i;
   }

   @Override
   protected class01233 N(class06993 var1, class05163 var2, class02610 var3, boolean var4) {
      class01233 class01233 = super.N(var1, var2, var3, var4);
      class01233.y(class05282.y);
      class01233.N(class05282.u);
      return class01233;
   }
}
