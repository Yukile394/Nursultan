package minecraft;

public abstract class class06249<S extends class08800, M extends class06078<? super S>> {
   private final class06252<S, M> N;

   public class06249(class06252<S, M> var1) {
      super();
      this.N = var1;
   }

   public M u() {
      return this.N.L();
   }

   protected static <S extends class08476> void y(
      class06271<? super S> var0, class01894 var1, class01421 var2, class01237 var3, int var4, S var5, int var6, int var7
   ) {
      var3.N(var7).N(var0, var5, var2, class06851.M(var1), var4, class02294.N(var5, 0.0F), var6, null, var5.l, null);
   }

   protected static <S extends class08476> void N(
      class06271<? super S> var0, class01894 var1, class01421 var2, class01237 var3, int var4, S var5, int var6, int var7
   ) {
      if (!var5.v) {
         y(var0, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public abstract void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6);
}
