package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class06318<E extends class05729<E>> extends class01212<E> {
   public class06318(class06202 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      if (this.method_25340() == 0) {
         return null;
      } else if (!(var1 instanceof class02116 class02116)) {
         return super.method_48205(var1);
      } else {
         class05729 class05729x = this.method_25336();
         if (class02116.y().N() == class03287.field_41822 && class05729x != null) {
            return class02106.N(this, class05729x.method_48205(var1));
         } else {
            int i = -1;
            class03249 class03249 = class02116.y();
            if (class05729x != null) {
               i = class05729x.method_25396().indexOf(class05729x.method_25399());
            }

            if (i == -1) {
               switch (class03249) {
                  case field_41828:
                     i = Integer.MAX_VALUE;
                     class03249 = class03249.field_41827;
                     break;
                  case field_41829:
                     i = 0;
                     class03249 = class03249.field_41827;
                     break;
                  default:
                     i = 0;
               }
            }

            class05729 class05729x = class05729x;

            class02106 class02106;
            do {
               class05729x = this.method_48199(class03249, var0 -> !var0.method_25396().isEmpty(), (E)class05729x);
               if (class05729x == null) {
                  return null;
               }

               class02106 = class05729x.method_48208(class02116, i);
            } while (class02106 == null);

            return class02106.N(this, class02106);
         }
      }
   }

   @Override
   public class03432 method_37018() {
      return this.method_25370() ? class03432.field_33786 : super.method_37018();
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      if (this.method_25336() != var1) {
         super.method_25395(var1);
         if (var1 == null) {
            this.method_25313(null);
         }
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      if (this.method_37019() instanceof class05729 class05729x) {
         class05729x.method_37024(var1.N());
         this.method_37017(var1, (E)class05729x);
      } else if (this.method_25336() instanceof class05729 class05729) {
         class05729.method_37024(var1.N());
         this.method_37017(var1, (E)class05729);
      }
   }

   @Override
   protected boolean method_73379() {
      return false;
   }
}
