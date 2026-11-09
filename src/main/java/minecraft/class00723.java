package minecraft;

import com.mojang.serialization.MapCodec;

public class class00723 extends class07004 {
   public static final MapCodec<class00723> N = y(class00723::new);

   public class00723(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, class07185.field_11052));
   }

   @Override
   public MapCodec<class00723> N() {
      return N;
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      var4.method_5747(var5, 0.2F, var1.method_48963().E());
   }
}
