package minecraft;

import baritone.utils.accessor.IPalettedContainer.IData;

public record class07365<T>(class06617 configuration, class04552 storage, class07340<T> palette) implements IData {

   public class04552 L() {
      return this.storage;
   }

   public class07365(class06617 configuration, class04552 storage, class07340<T> palette) {
      super();
      this.configuration = configuration;
      this.storage = storage;
      this.palette = palette;
   }

   public class07340<T> u() {
      return this.palette;
   }

   public class06617 y() {
      return this.configuration;
   }

   public void N(class07340<T> var1, class04552 var2) {
      class07342 class07342 = class07342.N();

      for (int i = 0; i < var2.y(); i++) {
         Object object = var1.method_12288(var2.N(i));
         this.storage.y(i, this.palette.method_12291((T)object, class07342));
      }
   }

   public class07365<T> N() {
      return new class07365<>(this.configuration, this.storage.u(), this.palette.method_39956());
   }

   public void N(class00667 var1, class00750<T> var2) {
      var1.writeByte(this.storage.L());
      this.palette.method_12287(var1, var2);
      var1.y(this.storage.N());
   }

   public int N(class00750<T> var1) {
      return 1 + this.palette.method_12290(var1) + this.storage.N().length * 8;
   }
}
