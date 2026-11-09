package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class05724<E extends class05699<E>> extends class01212<E> {
   private static final class00392 field_33783 = class00392.L("narration.selection.usage");

   public class05724(class06202 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      if (this.method_25340() == 0) {
         return null;
      } else if (this.method_25370() && var1 instanceof class02116 class02116) {
         class05699 class05699 = this.method_48197(class02116.y());
         if (class05699 != null) {
            return class02106.N(this, class02106.N(class05699));
         } else {
            this.method_25395(null);
            this.method_25313(null);
            return null;
         }
      } else if (!this.method_25370()) {
         class05699 class05699x = this.method_25334();
         if (class05699x == null) {
            class05699x = this.method_48197(var1.N());
         }

         return class05699x == null ? null : class02106.N(this, class02106.N(class05699x));
      } else {
         return null;
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      class05699 class05699x = this.method_37019();
      if (class05699x != null) {
         this.method_37017(var1.N(), (E)class05699x);
         class05699x.method_37020(var1);
      } else {
         class05699 class05699x = this.method_25334();
         if (class05699x != null) {
            this.method_37017(var1.N(), (E)class05699x);
            class05699x.method_37020(var1);
         }
      }

      if (this.method_25370()) {
         var1.N(class03457.field_33791, field_33783);
      }
   }
}
