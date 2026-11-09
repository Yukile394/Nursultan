package minecraft;

public record class00427(class07321 chunkPos, class00442<?> update) implements class00381<class07280> {
   public static final class02362<class04247, class00427> N = class02362.N(class07321.y, class00427::N, class00442.N, class00427::y, class00427::new);

   public class00427(class07321 chunkPos, class00442<?> update) {
      super();
      this.chunkPos = chunkPos;
      this.update = update;
   }

   public class00442<?> y() {
      return this.update;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07321 N() {
      return this.chunkPos;
   }

   @Override
   public class02897<class00427> method_65080() {
      return class04248.k;
   }
}
