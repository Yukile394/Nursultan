package minecraft;

import org.jspecify.annotations.Nullable;

public record class08956(class08961 owner, class06889 offset) implements class08961 {
   @Override
   public float method_73188() {
      return this.owner.method_73188();
   }

   @Override
   public class07299 method_73183() {
      return this.owner.method_73183();
   }

   @Override
   public class06889 method_73189() {
      return this.owner.method_73189().i(this.offset);
   }

   public class08956(class08961 owner, class06889 offset) {
      super();
      this.owner = owner;
      this.offset = offset;
   }

   public class06889 y() {
      return this.offset;
   }

   public class08961 N() {
      return this.owner;
   }

   @Nullable
   @Override
   public class07438 method_72393() {
      return this.owner.method_72393();
   }
}
