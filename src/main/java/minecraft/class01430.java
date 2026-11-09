package minecraft;

public abstract class class01430<S extends class08800, M extends class06078<S>> extends class06249<S, M> {
   protected abstract M L();

   public class01430(class06252<S, M> var1) {
      super(var1);
   }

   protected abstract float N(float var1);

   protected abstract class01894 N();

   @Override
   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      if (this.N(var4)) {
         float f = var4.P;
         class06078 class06078 = this.L();
         var2.N(1).N(class06078, var4, var1, class06851.y(this.N(), this.N(f) % 1.0F, f * 0.01F % 1.0F), var3, class01384.u, -8355712, null, var4.l, null);
      }
   }

   protected abstract boolean N(S var1);
}
