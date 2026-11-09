package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class08241 {
   private float N = 1.6F;
   private class06509 y = class06509.field_8950;
   private class03556<class04891> L = class04909.EF;
   private boolean u = true;
   private final List<class08200> i = new ArrayList<>();

   class08241() {
      super();
   }

   public class08241 y(class03556<class04891> var1) {
      return this.N(new class08229(var1));
   }

   public class08209 N() {
      return new class08209(this.N, this.y, this.L, this.u, this.i);
   }

   public class08241 N(class08200 var1) {
      this.i.add(var1);
      return this;
   }

   public class08241 N(boolean var1) {
      this.u = var1;
      return this;
   }

   public class08241 N(float var1) {
      this.N = var1;
      return this;
   }

   public class08241 N(class03556<class04891> var1) {
      this.L = var1;
      return this;
   }

   public class08241 N(class06509 var1) {
      this.y = var1;
      return this;
   }
}
