package minecraft;

import java.util.Optional;
import java.util.UUID;

public record class03807(Optional<UUID> id) implements class00381<class01662> {
   public static final class02362<class00667, class03807> N = class00381.N(class03807::N, class03807::new);

   private class03807(class00667 var1) {
      this(var1.y(class01487.M));
   }

   public class03807(Optional<UUID> id) {
      this.id = id;
   }

   public Optional<UUID> N() {
      return this.id;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.N_13(this.id, class01487.M);
   }

   @Override
   public class02897<class03807> method_65080() {
      return class02885.M;
   }
}
