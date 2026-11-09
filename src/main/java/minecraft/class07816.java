package minecraft;

import java.util.UUID;

public record class07816(String name, UUID profileId) implements class00381<class07845> {
   public static final class02362<class00667, class07816> N = class00381.N(class07816::N, class07816::new);

   private class07816(class00667 var1) {
      this(var1.u(16), var1.m());
   }

   public class07816(String name, UUID profileId) {
      super();
      this.name = name;
      this.profileId = profileId;
   }

   public UUID y() {
      return this.profileId;
   }

   private void N(class00667 var1) {
      var1.N(this.name, 16);
      var1.N(this.profileId);
   }

   public String N() {
      return this.name;
   }

   public void method_65081(class07845 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class07816> method_65080() {
      return class04271.M;
   }
}
