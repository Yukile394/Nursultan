package Nursultan;

import java.util.List;
import minecraft.class04803;
import minecraft.class06584;

public class class10471 implements class04803 {
   public class10471(List var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class06584 N() {
      return (class06584)this.N.get(this.y);
   }

   @Override
   public boolean N(class06584 var1) {
      this.N.set(this.y, var1);
      return true;
   }
}
