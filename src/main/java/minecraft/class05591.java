package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class05591 implements class06386 {
   public static final Codec<class05591> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.list(class06209.N).fieldOf("targets").forGetter(var0x -> var0x.y)).apply(var0, class05591::new)
   );
   public final List<class06209> y;

   public class05591(class00500 var1, class00500 var2) {
      this(ImmutableList.of(class06191.N(new class05256(var1), var2)));
   }

   public class05591(List<class06209> var1) {
      super();
      this.y = var1;
   }
}
