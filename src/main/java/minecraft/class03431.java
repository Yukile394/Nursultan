package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03431 extends class07137 {
   public static final MapCodec<class03431> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("host").forGetter(class07137::y), t()).apply(var0, class03431::new)
   );

   public class03431(class00891 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.W().y(class07004.L, class07185.field_11052));
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(class07004.L, var1.method_8038().z());
   }

   @Override
   public MapCodec<class03431> N() {
      return y;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(class07004.L);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return class07004.y(var1, var2);
   }
}
