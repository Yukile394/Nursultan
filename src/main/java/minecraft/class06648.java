package minecraft;

import org.jspecify.annotations.Nullable;

public record class06648(int entityId, class03556<class07084> effect) implements class00381<class07280> {
   public static final class02362<class04247, class06648> N = class02362.N(class02389.B, class06648::N, class07084.y, class06648::y, class06648::new);

   public class06648(int entityId, class03556<class07084> effect) {
      super();
      this.entityId = entityId;
      this.effect = effect;
   }

   public class03556<class07084> y() {
      return this.effect;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.entityId;
   }

   @Nullable
   public class07049 N(class07299 var1) {
      return var1.method_8469(this.entityId);
   }

   @Override
   public class02897<class06648> method_65080() {
      return class04248.Nv;
   }
}
