package minecraft;

public class class07591 extends class06738 {
   private final class01686 L;

   public class07591(class01686 var1) {
      super(var1);
      class01686 class01686 = this.y.y("shell");
      this.L = class01686.y("corals");
   }

   @Override
   public void method_2819(class06729 var1) {
      super.method_2819(var1);
      this.L.U = var1.y.R();
   }

   public static class04806 N() {
      class04792 class04792 = L();
      class04839 class04839xxx = class04792.N().y("root").y("shell").N("corals", class04822.L(), class04838.N(8.0F, 4.5F, -8.0F));
      class04839 class04839x = class04839xxx.N("yellow_coral", class04822.L(), class04838.N(0.0F, -11.0F, 11.0F));
      class04839x.N(
         "yellow_coral_second", class04822.L().N(0, 85).N(-4.5F, -3.5F, 0.0F, 6.0F, 8.0F, 0.0F), class04838.N(0.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.0F)
      );
      class04839x.N("yellow_coral_first", class04822.L().N(0, 85).N(-4.5F, -3.5F, 0.0F, 6.0F, 8.0F, 0.0F), class04838.N(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
      class04839xxx.N("pink_coral", class04822.L().N(-8, 94).N(-4.5F, 4.5F, 0.0F, 6.0F, 0.0F, 8.0F), class04838.N(-12.5F, -18.0F, 11.0F))
         .N("pink_coral_second", class04822.L().N(-8, 94).N(-3.0F, 0.0F, -4.0F, 6.0F, 0.0F, 8.0F), class04838.N(-1.5F, 4.5F, 4.0F, 0.0F, 0.0F, 1.5708F));
      class04839 class04839xx = class04839xxx.N("blue_coral", class04822.L(), class04838.N(-14.0F, 0.0F, 5.5F));
      class04839xx.N("blue_second", class04822.L().N(0, 102).N(-3.5F, -5.5F, 0.0F, 5.0F, 10.0F, 0.0F), class04838.N(0.0F, 0.0F, -2.0F, 0.0F, 0.7854F, 0.0F));
      class04839xx.N("blue_first", class04822.L().N(0, 102).N(-3.5F, -5.5F, 0.0F, 5.0F, 10.0F, 0.0F), class04838.N(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
      class04839 class04839xxx = class04839xxx.N("red_coral", class04822.L(), class04838.N(0.0F, 0.0F, 0.0F));
      class04839xxx.N(
         "red_coral_second", class04822.L().N(0, 112).N(-2.5F, -5.5F, 0.0F, 4.0F, 10.0F, 0.0F), class04838.N(-0.5F, -1.0F, 1.5F, 0.0F, -0.829F, 0.0F)
      );
      class04839xxx.N("red_coral_first", class04822.L().N(0, 112).N(-4.5F, -5.5F, 0.0F, 6.0F, 10.0F, 0.0F), class04838.N(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
      return class04806.N(class04792, 128, 128);
   }
}
