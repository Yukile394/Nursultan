package minecraft;

import com.mojang.serialization.MapCodec;

public class class00738 extends class07101 {
   public static final MapCodec<class00738> N = y(class00738::new);

   public class00738(class01362 var1) {
      super(var1);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(R, var1.method_8042().b());
   }

   @Override
   public MapCodec<class00738> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R);
   }
}
