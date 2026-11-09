package minecraft;

public enum class05915 implements class05033, class07611<class06584> {
   field_63054("tool", class06551.U);

   private final String field_63055;
   private final class07491<? extends class06584> field_63056;

   private class05915(String var3, class07491<? extends class06584> var4) {
      this.field_63055 = var3;
      this.field_63056 = var4;
   }

   @Override
   public class07491<? extends class06584> N() {
      return this.field_63056;
   }

   @Override
   public String method_15434() {
      return this.field_63055;
   }
}
