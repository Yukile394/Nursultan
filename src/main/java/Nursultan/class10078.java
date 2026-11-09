package Nursultan;

import com.mojang.datafixers.util.Function3;
import java.util.function.Function;
import minecraft.class02362;

public class class10078<B, C> implements class02362<B, C> {
   public class10078(class02362 var1, class02362 var2, class02362 var3, Function3 var4, Function var5, Function var6, Function var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   @Override
   public C decode(B var1) {
      Object object = this.N.decode((B)var1);
      Object object1 = this.y.decode((B)var1);
      Object object2 = this.L.decode((B)var1);
      return (C)this.u.apply(object, object1, object2);
   }

   @Override
   public void encode(B var1, C var2) {
      this.N.encode((B)var1, this.i.apply(var2));
      this.y.encode((B)var1, this.R.apply(var2));
      this.L.encode((B)var1, this.M.apply(var2));
   }
}
