package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05332 implements class06386 {
   public static final Codec<class05332> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00500.N.fieldOf("contents").forGetter(var0x -> var0x.y),
            class00500.N.fieldOf("rim").forGetter(var0x -> var0x.L),
            class02142.N(0, 16).fieldOf("size").forGetter(var0x -> var0x.u),
            class02142.N(0, 16).fieldOf("rim_size").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class05332::new)
   );
   private final class00500 y;
   private final class00500 L;
   private final class02142 u;
   private final class02142 i;

   public class02142 L() {
      return this.u;
   }

   public class05332(class00500 var1, class00500 var2, class02142 var3, class02142 var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   public class02142 i() {
      return this.i;
   }

   public class00500 y() {
      return this.L;
   }

   public class00500 N() {
      return this.y;
   }
}
