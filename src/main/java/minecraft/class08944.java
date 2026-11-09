package minecraft;

public record class08944(class00392 label, float sortKey) {
   public static final class08944 N = new class08944(class00392.L("debug.options.category.text"), 1.0F);
   public static final class08944 y = new class08944(class00392.L("debug.options.category.renderer"), 2.0F);

   public class08944(class00392 label, float sortKey) {
      this.label = label;
      this.sortKey = sortKey;
   }

   public float y() {
      return this.sortKey;
   }

   public class00392 N() {
      return this.label;
   }
}
