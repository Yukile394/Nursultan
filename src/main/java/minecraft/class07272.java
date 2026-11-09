package minecraft;

import java.util.UUID;

record class07272(float progress) implements class07238 {
   public class07272(class04247 var1) {
      this(var1.readFloat());
   }

   class07272(float progress) {
      super();
      this.progress = progress;
   }

   public float y() {
      return this.progress;
   }

   @Override
   public void N(class04247 var1) {
      var1.writeFloat(this.progress);
   }

   @Override
   public class07239 N() {
      return class07239.field_29109;
   }

   @Override
   public void N(UUID var1, class07262 var2) {
      var2.N(var1, this.progress);
   }
}
