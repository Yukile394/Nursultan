package minecraft;

public record class01932(class06143 sprite) implements class04417<class01904> {
   public class01932(class06143 sprite) {
      this.sprite = sprite;
   }

   public class04406 method_3090(
      class01904 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class01928 class01928 = new class01928(var2, var3, var5, var7, var9, var11, var13, this.sprite);
      class01928.method_74308(1.0F);
      class01928.method_34753(var9, var11, var13);
      class01928.field_62638 = var1.N();
      class01928.field_62637 = var1.N();
      class01928.method_3077(var15.y(12) + 8);
      return class01928;
   }

   public class06143 N() {
      return this.sprite;
   }
}
