package minecraft;

public record class00437(class07209 blockPos, class00442<?> update) implements class00381<class07280> {
   public static final class02362<class04247, class00437> N = class02362.N(class07209.field_48404, class00437::N, class00442.N, class00437::y, class00437::new);

   public class00437(class07209 blockPos, class00442<?> update) {
      super();
      this.blockPos = blockPos;
      this.update = update;
   }

   public class00442<?> y() {
      return this.update;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07209 N() {
      return this.blockPos;
   }

   @Override
   public class02897<class00437> method_65080() {
      return class04248.w;
   }
}
