package minecraft;

import java.util.List;

public abstract class class07313 extends class06184 {
   private final class03774 N;
   private final float y;
   private final int L;

   public int M() {
      return this.L;
   }

   public class07313(String var1, class03774 var2, class06510 var3, class06584 var4, float var5, int var6) {
      super(var1, var3, var4);
      this.N = var2;
      this.y = var5;
      this.L = var6;
   }

   public class03774 B() {
      return this.N;
   }

   protected abstract class06581 Z();

   @Override
   public abstract class05838<? extends class07313> u();

   @Override
   public List<class00265> N() {
      return List.of(new class00240(this.z().method_64673(), class00294.L, new class00302(this.U()), new class00330(this.Z()), this.L, this.y));
   }

   @Override
   public abstract class06514<? extends class07313> method_8119();

   public float R() {
      return this.y;
   }
}
