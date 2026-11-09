package minecraft;

import java.util.UUID;

record class07270(class00392 name) implements class07238 {
   public class07270(class04247 var1) {
      this(class03748.u.decode(var1));
   }

   class07270(class00392 name) {
      super();
      this.name = name;
   }

   public class00392 y() {
      return this.name;
   }

   @Override
   public void N(class04247 var1) {
      class03748.u.encode(var1, this.name);
   }

   @Override
   public class07239 N() {
      return class07239.field_29110;
   }

   @Override
   public void N(UUID var1, class07262 var2) {
      var2.N(var1, this.name);
   }
}
