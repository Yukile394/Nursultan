package minecraft;

import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class class04028 implements class04025 {
   protected final class00753 i;

   public class04028(class00753 var1) {
      super();
      this.i = var1;
   }

   protected abstract boolean N(class00500 var1);

   public final boolean test(class05974 var1, class07209 var2) {
      return this.N(var1.method_8320(var2.method_10081(this.i)));
   }

   protected static <P extends class04028> P1<Mu<P>, class00753> N(Instance<P> var0) {
      return var0.group(class00753.method_39677(16).optionalFieldOf("offset", class00753.field_11176).forGetter(var0x -> var0x.i));
   }
}
