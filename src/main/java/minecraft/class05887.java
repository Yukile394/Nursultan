package minecraft;

public enum class05887 implements class05033, class07611<class00394> {
   field_49436("block_entity", class06551.z);

   private final String field_49438;
   private final class07491<? extends class00394> field_63053;

   private class05887(String var3, class07491<? extends class00394> var4) {
      this.field_49438 = var3;
      this.field_63053 = var4;
   }

   @Override
   public class07491<? extends class00394> N() {
      return this.field_63053;
   }

   @Override
   public String method_15434() {
      return this.field_49438;
   }
}
