package minecraft;

import org.jspecify.annotations.Nullable;

public class class06565 extends class06913 {
   private final class07078<? extends class07079> N;
   private final class04891 y;

   public class06565(class07078<? extends class07079> var1, class04651 var2, class04891 var3, class06573 var4) {
      super(var2, var4);
      this.N = var1;
      this.y = var3;
   }

   private void N(class04782 var1, class06584 var2, class07209 var3) {
      class07079 class07079 = this.N.y(var1, class07078.N(var1, var2, null), var3, class06113.field_16473, true, false);
      if (class07079 instanceof class05549 class05549) {
         class02837 class02837 = var2.a_(class02484.NM, class02837.N);
         class05549.N(class02837.y());
         class05549.N(true);
      }

      if (class07079 != null) {
         var1.y(class07079);
         class07079.D();
      }
   }

   @Override
   protected void N(@Nullable class07438 var1, class07284 var2, class07209 var3) {
      var2.method_8396(var1, var3, this.y, class04911.field_15254, 1.0F, 1.0F);
   }

   @Override
   public void N(@Nullable class07438 var1, class07299 var2, class06584 var3, class07209 var4) {
      if (var2 instanceof class04782) {
         this.N((class04782)var2, var3, var4);
         var2.N(var1, class01194.v, var4);
      }
   }
}
