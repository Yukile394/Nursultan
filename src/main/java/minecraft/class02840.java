package minecraft;

public abstract class class02840<T extends class07079, S extends class08476, M extends class06078<? super S>> extends class02294<T, S, M> {
   public class02840(class04832 var1, M var2, float var3) {
      super(var1, (M)var2, var3);
   }

   @Override
   protected float method_55831(S var1) {
      return super.method_55831((S)var1) * var1.Nu;
   }

   protected static boolean N(class07049 var0, String var1) {
      class00392 class00392 = var0.method_5797();
      return class00392 != null && var1.equals(class00392.getString());
   }

   protected boolean method_3921(T var1, double var2) {
      return super.method_3921((T)var1, var2) && (var1.method_5733() || var1.method_16914() && var1 == this.field_4676.L);
   }
}
