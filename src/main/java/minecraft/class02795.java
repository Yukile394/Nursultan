package minecraft;

@Deprecated
public abstract class class02795<T extends class07079, S extends class08476, M extends class06078<? super S>> extends class02840<T, S, M> {
   private final M N;
   private final M i;

   public class02795(class04832 var1, M var2, M var3, float var4) {
      super(var1, (M)var2, var4);
      this.N = (M)var2;
      this.i = (M)var3;
   }

   @Override
   public void method_3936(S var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y = var1.NB ? this.i : this.N;
      super.method_3936((S)var1, var2, var3, var4);
   }
}
