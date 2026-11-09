package minecraft;

import org.jspecify.annotations.Nullable;

public record class07041(class07064 swingSource, class07056 itemContext) implements class07082 {
   public boolean L() {
      return this.itemContext.N();
   }

   public class07041(class07064 swingSource, class07056 itemContext) {
      super();
      this.swingSource = swingSource;
      this.itemContext = itemContext;
   }

   public class07064 i() {
      return this.swingSource;
   }

   @Nullable
   public class06584 u() {
      return this.itemContext.y();
   }

   public class07041 y() {
      return new class07041(this.swingSource, class07056.L);
   }

   @Override
   public boolean N() {
      return true;
   }

   public class07041 N(class06584 var1) {
      return new class07041(this.swingSource, new class07056(true, var1));
   }

   public class07056 R() {
      return this.itemContext;
   }
}
