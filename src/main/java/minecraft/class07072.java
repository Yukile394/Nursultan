package minecraft;

import org.jspecify.annotations.Nullable;

public class class07072 {
   private final class03556<class03689> N;
   @Nullable
   private final class07049 y;
   @Nullable
   private final class07049 L;
   @Nullable
   private final class06889 u;

   @Nullable
   public class07049 L() {
      return this.L;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean M() {
      return switch (this.U().y()) {
         case field_42285 -> false;
         case field_42286 -> this.y instanceof class07438 && !(this.y instanceof class08036);
         case field_42287 -> true;
      };
   }

   public class07072(class03556<class03689> var1) {
      this(var1, null, null, null);
   }

   public class07072(class03556<class03689> var1, @Nullable class07049 var2, @Nullable class07049 var3) {
      this(var1, var2, var3, null);
   }

   public class07072(class03556<class03689> var1, @Nullable class07049 var2) {
      this(var1, var2, var2);
   }

   private class07072(class03556<class03689> var1, @Nullable class07049 var2, @Nullable class07049 var3, @Nullable class06889 var4) {
      super();
      this.N = var1;
      this.y = var3;
      this.L = var2;
      this.u = var4;
   }

   public class07072(class03556<class03689> var1, class06889 var2) {
      this(var1, null, null, var2);
   }

   @Override
   public String toString() {
      return "DamageSource (" + this.U().N() + ")";
   }

   public boolean B() {
      class07049 class07049 = this.u();
      return class07049 instanceof class08036 && ((class08036)class07049).method_31549().u;
   }

   @Nullable
   public class06889 Z() {
      if (this.u != null) {
         return this.u;
      } else {
         return this.L != null ? this.L.method_73189() : null;
      }
   }

   @Nullable
   public class06584 i() {
      return this.L != null ? this.L.method_59958() : null;
   }

   public class03689 U() {
      return this.N.N();
   }

   @Nullable
   public class06889 z() {
      return this.u;
   }

   @Nullable
   public class07049 u() {
      return this.y;
   }

   public boolean y() {
      return this.y == this.L;
   }

   public class03556<class03689> E() {
      return this.N;
   }

   public class00392 N(class07438 var1) {
      String s = "death.attack." + this.U().N();
      if (this.y == null && this.L == null) {
         class07438 class07438 = var1.method_6124();
         String s1 = s + ".player";
         return class07438 != null ? class00392.N(s1, var1.method_5476(), class07438.method_5476()) : class00392.N(s, var1.method_5476());
      } else {
         class00392 class00392 = this.y == null ? this.L.method_5476() : this.y.method_5476();
         class07049 class07049 = this.y;
         class06584 class06584 = class07049 instanceof class07438 ? ((class07438)class07049).method_6047() : class06584.E;
         return !class06584.R() && class06584.L(class02484.B)
            ? class00392.N(s + ".item", var1.method_5476(), class00392, class06584.V())
            : class00392.N(s, var1.method_5476(), class00392);
      }
   }

   public boolean N(class05946<class03689> var1) {
      return this.N.N(var1);
   }

   public boolean N(class03530<class03689> var1) {
      return this.N.N(var1);
   }

   public float N() {
      return this.U().L();
   }

   public String R() {
      return this.U().N();
   }
}
