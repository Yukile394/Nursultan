package minecraft;

public record class00449(int entityId, class00442<?> update) implements class00381<class07280> {
   public static final class02362<class04247, class00449> N = class02362.N(class02389.B, class00449::N, class00442.N, class00449::y, class00449::new);

   public class00449(int entityId, class00442<?> update) {
      this.entityId = entityId;
      this.update = update;
   }

   public class00442<?> y() {
      return this.update;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.entityId;
   }

   @Override
   public class02897<class00449> method_65080() {
      return class04248.Y;
   }
}
