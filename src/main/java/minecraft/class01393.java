package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01393(class00836 composite) {
   public static final Codec<class01393> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00836.u.optionalFieldOf("light", class00836.L).forGetter(class01393::N)).apply(var0, class01393::new)
   );

   public class01393(class00836 composite) {
      this.composite = composite;
   }

   public class00836 N() {
      return this.composite;
   }

   public boolean N(class04782 var1, class07209 var2) {
      return !var1.method_8477(var2) ? false : this.composite.u(var1.U(var2));
   }
}
