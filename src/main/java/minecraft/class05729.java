package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class class05729<E extends class05729<E>> extends class01202<E> implements class01295 {
   @Nullable
   private class04654 field_19077;
   @Nullable
   private class03434 field_33782;
   private boolean field_19078;

   public class05729() {
      super();
   }

   @Nullable
   @Override
   public class04654 method_25399() {
      return this.field_19077;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      if (var1 instanceof class02116 class02116) {
         byte b0 = switch (class02116.y()) {
            case field_41828 -> -1;
            case field_41829 -> 1;
            case field_41826, field_41827 -> 0;
         };
         if (b0 == 0) {
            return null;
         }

         for (int i = class04995.N(b0 + this.method_25396().indexOf(this.method_25399()), 0, this.method_25396().size() - 1);
            i >= 0 && i < this.method_25396().size();
            i += b0
         ) {
            class02106 class02106 = this.method_25396().get(i).method_48205(var1);
            if (class02106 != null) {
               return class02106.N(this, class02106);
            }
         }
      }

      return class01295.super.method_48205(var1);
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      if (this.field_19077 != null) {
         this.field_19077.method_25365(false);
      }

      if (var1 != null) {
         var1.method_25365(true);
      }

      this.field_19077 = var1;
   }

   @Override
   public void method_25398(boolean var1) {
      this.field_19078 = var1;
   }

   @Override
   public boolean method_25397() {
      return this.field_19078;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      return class01295.super.method_25402(var1, var2);
   }

   public abstract List<? extends class03434> method_37025();

   @Nullable
   public class02106 method_48208(class02089 var1, int var2) {
      if (this.method_25396().isEmpty()) {
         return null;
      } else {
         class02106 class02106 = this.method_25396().get(Math.min(var2, this.method_25396().size() - 1)).method_48205(var1);
         return class02106.N(this, class02106);
      }
   }

   public void method_37024(class03428 var1) {
      List<? extends class03434> list = this.method_37025();
      class05117 class05117 = class05096.method_37061(list, this.field_33782);
      if (class05117 != null) {
         if (class05117.L().N()) {
            this.field_33782 = class05117.N();
         }

         if (list.size() > 1) {
            var1.N(class03457.field_33789, class00392.N("narrator.position.object_list", class05117.y() + 1, list.size()));
         }

         class05117.N().method_37020(var1.N());
      }
   }
}
