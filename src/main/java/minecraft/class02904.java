package minecraft;

public record class02904(class06584 item) implements class02950 {
   public class06584 L() {
      return this.item;
   }

   public class02904(class06584 item) {
      super();
      this.item = item;
   }

   @Override
   public class06584 N(int var1) {
      if (var1 != 0) {
         throw new IllegalArgumentException("No item for index " + var1);
      } else {
         return this.item;
      }
   }

   @Override
   public int N() {
      return 1;
   }
}
