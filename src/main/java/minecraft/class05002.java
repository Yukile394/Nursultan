package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05002 extends class06318<class04992> {
   private static final int N = 310;
   private static final int y = 25;
   private final class05914 L;

   public void L(class04370<?> var1) {
      for (class04992 class04992 : this.method_25396()) {
         if (class04992 instanceof class05009) {
            for (class05037 class05037 : ((class05009)class04992).N) {
               if (class05037.y() == var1) {
                  class06478 class06478 = class05037.N();
                  if (class06478 instanceof class06744) {
                     ((class06744)class06478).N();
                     return;
                  }
               }
            }
         }
      }
   }

   public class05002(class06202 var1, int var2, class05914 var3) {
      super(var1, var2, var3.field_49503.u(), var3.field_49503.L(), 25);
      this.field_22744 = false;
      this.L = var3;
   }

   @Nullable
   public class06478 y(class04370<?> var1) {
      for (class04992 class04992 : this.method_25396()) {
         if (class04992 instanceof class05009) {
            class06478 class06478 = ((class05009)class04992).N(var1);
            if (class06478 != null) {
               return class06478;
            }
         }
      }

      return null;
   }

   public void y() {
      for (class04992 class04992 : this.method_25396()) {
         if (class04992 instanceof class05009) {
            for (class05037 class05037 : ((class05009)class04992).N) {
               if (class05037.y() != null) {
                  class06478 class06478 = class05037.N();
                  if (class06478 instanceof class04357) {
                     ((class04357)class06478).y();
                  }
               }
            }
         }
      }
   }

   public void N(class00392 var1) {
      byte b0 = 9;
      int i = this.method_25396().isEmpty() ? 0 : b0 * 2;
      this.method_73370(new class05014(this.L, var1, i), i + b0 + 4);
   }

   public void N(class06478 var1, class04370<?> var2, @Nullable class06478 var3) {
      this.method_25321(class05009.N(var1, var2, var3, this.L));
   }

   public void N(class04370<?>... var1) {
      for (byte b0 = 0; b0 < var1.length; b0 += 2) {
         class04370 class04370 = b0 < var1.length - 1 ? var1[b0 + 1] : null;
         this.method_25321(class05009.N((class05630)this.field_22740.i_7, var1[b0], class04370, this.L));
      }
   }

   public void N(List<class06478> var1) {
      for (byte b0 = 0; b0 < var1.size(); b0 += 2) {
         this.N((class06478)var1.get(b0), b0 < var1.size() - 1 ? (class06478)var1.get(b0 + 1) : null);
      }
   }

   public void N(class06478 var1, @Nullable class06478 var2) {
      this.method_25321(class05009.N(var1, var2, this.L));
   }

   public void N(class04370<?> var1) {
      this.method_25321(class05009.N((class05630)this.field_22740.i_7, var1, this.L));
   }

   @Override
   public int method_25322() {
      return 310;
   }
}
