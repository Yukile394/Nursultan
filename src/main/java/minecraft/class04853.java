package minecraft;

public enum class04853 implements class05033 {
   field_23329("rollable"),
   field_23330("aligned");

   public static final class05031<class04853> field_54790 = class05033.N(class04853::values);
   private final String field_23331;

   private class04853(String var3) {
      this.field_23331 = var3;
   }

   public class00392 N() {
      return class00392.L("jigsaw_block.joint." + this.field_23331);
   }

   @Override
   public String method_15434() {
      return this.field_23331;
   }
}
