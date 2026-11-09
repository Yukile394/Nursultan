package minecraft;

import java.util.List;
import java.util.UUID;

public record class02079(List<UUID> profileIds) implements class00381<class07280> {
   public static final class02362<class00667, class02079> N = class00381.N(class02079::N, class02079::new);

   private class02079(class00667 var1) {
      this(var1.N_16(class01487.M));
   }

   public class02079(List<UUID> profileIds) {
      this.profileIds = profileIds;
   }

   public List<UUID> N() {
      return this.profileIds;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.N_12(this.profileIds, class01487.M);
   }

   @Override
   public class02897<class02079> method_65080() {
      return class04248.NU;
   }
}
