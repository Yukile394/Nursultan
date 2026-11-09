package minecraft;

import java.util.Optional;

public class class08091 implements class00381<class07280> {
   public static final class02362<class04247, class08091> N = class00381.N(class08091::N, class08091::new);
   public static final int y = 0;
   public static final int L = 1;
   public static final int u = 2;
   private final String i;
   private final class00392 R;
   private final class06640 M;
   private final Optional<class01762> B;
   private final int Z;

   public int L() {
      return this.Z;
   }

   public Optional<class01762> M() {
      return this.B;
   }

   public class08091(class00518 var1, int var2) {
      super();
      this.i = var1.L();
      this.R = var1.i();
      this.M = var1.Z();
      this.B = Optional.ofNullable(var1.M());
      this.Z = var2;
   }

   private class08091(class04247 var1) {
      super();
      this.i = var1.s();
      this.Z = var1.readByte();
      if (this.Z != 0 && this.Z != 2) {
         this.R = class05220.N;
         this.M = class06640.field_1472;
         this.B = Optional.empty();
      } else {
         this.R = class03748.u.decode(var1);
         this.M = var1.y(class06640.class);
         this.B = class01787.u.decode(var1);
      }
   }

   public class06640 u() {
      return this.M;
   }

   public class00392 y() {
      return this.R;
   }

   public String N() {
      return this.i;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      var1.N(this.i);
      var1.writeByte(this.Z);
      if (this.Z == 0 || this.Z == 2) {
         class03748.u.encode(var1, this.R);
         var1.N(this.M);
         class01787.u.encode(var1, this.B);
      }
   }

   @Override
   public class02897<class08091> method_65080() {
      return class04248.NF;
   }
}
