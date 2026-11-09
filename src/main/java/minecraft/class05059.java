package minecraft;

import java.util.stream.Stream;

public class class05059 extends class05724<class05068> {
   static final class01894 N = class01894.y("transferable_list/select_highlighted");
   static final class01894 y = class01894.y("transferable_list/select");
   static final class01894 L = class01894.y("transferable_list/unselect_highlighted");
   static final class01894 u = class01894.y("transferable_list/unselect");
   static final class01894 i = class01894.y("transferable_list/move_up_highlighted");
   static final class01894 R = class01894.y("transferable_list/move_up");
   static final class01894 M = class01894.y("transferable_list/move_down_highlighted");
   static final class01894 B = class01894.y("transferable_list/move_down");
   static final class00392 Z = class00392.L("pack.incompatible");
   static final class00392 z = class00392.L("pack.incompatible.confirm.title");
   private static final int E = 2;
   private final class00392 W;
   final class01270 U;

   public class05059(class06202 var1, class01270 var2, int var3, int var4, class00392 var5) {
      super(var1, var3, var4, 33, 36);
      this.U = var2;
      this.W = var5;
      this.field_22744 = false;
   }

   public void N(Stream<class01272> var1, class01250 var2) {
      this.method_25339();
      class05216 class05216 = class00392.i().y(this.W).N(class06541.field_1073, class06541.field_1067);
      this.method_73370(new class05045(this, (class01590)this.field_22740.i_3, class05216), (int)(9.0F * 1.5F));
      this.method_25313(null);
      var1.forEach(var2x -> {
         class05066 class05066 = new class05066(this, this.field_22740, this, var2x);
         this.method_25321(class05066);
         if (var2 != null && var2.L().equals(var2x.L())) {
            this.U.method_25395(this);
            this.method_25395(class05066);
         }
      });
      this.method_65506();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return this.method_25334() != null ? this.method_25334().method_25404(var1) : super.method_25404(var1);
   }

   @Override
   public int method_25322() {
      return this.field_22758 - 4;
   }

   @Override
   protected int method_65507() {
      return this.method_55442() - 6;
   }
}
