package minecraft;

public record class02596(int slot, class06584 contents) implements class00381<class07280> {
   public static final class02362<class04247, class02596> N = class02362.N(class02389.B, class02596::N, class06584.B, class02596::y, class02596::new);

   public class02596(int slot, class06584 contents) {
      super();
      this.slot = slot;
      this.contents = contents;
   }

   public class06584 y() {
      return this.contents;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.slot;
   }

   @Override
   public class02897<class02596> method_65080() {
      return class04248.Lk;
   }
}
