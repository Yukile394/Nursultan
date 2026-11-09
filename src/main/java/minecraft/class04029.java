package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

class class04029 implements class04025 {
   public static final MapCodec<class04029> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04025.y.fieldOf("predicate").forGetter(var0x -> var0x.i)).apply(var0, class04029::new)
   );
   private final class04025 i;

   public class04029(class04025 var1) {
      super();
      this.i = var1;
   }

   @Override
   public class04054<?> N() {
      return class04054.U;
   }

   public boolean test(class05974 var1, class07209 var2) {
      return !this.i.test(var1, var2);
   }
}
