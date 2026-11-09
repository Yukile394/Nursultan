package minecraft;

public class class05744 implements class05779 {
   private final class07209 N;
   private final class06889 y;

   public class05744(class07209 var1) {
      super();
      this.N = var1.method_10062();
      this.y = class06889.y(var1);
   }

   public class05744(class06889 var1) {
      super();
      this.N = class07209.method_49638(var1);
      this.y = var1;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.N + ", centerPosition=" + this.y + "}";
   }

   @Override
   public class07209 y() {
      return this.N;
   }

   @Override
   public boolean N(class07438 var1) {
      return true;
   }

   @Override
   public class06889 N() {
      return this.y;
   }
}
