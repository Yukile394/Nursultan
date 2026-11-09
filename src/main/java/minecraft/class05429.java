package minecraft;

import org.jspecify.annotations.Nullable;

public class class05429 extends class06546<class07479> {
   private static final class01894 n = class01894.y("container/slot");
   private static final class01894 t = class01894.y("container/horse/chest_slots");
   private static final class01894 G = class01894.y("textures/gui/container/horse.png");

   @Nullable
   @Override
   protected class01894 L() {
      return t;
   }

   public class05429(class07479 var1, class08044 var2, class07862 var3, int var4) {
      super(var1, var2, var3.method_5476(), var4, var3);
   }

   @Override
   protected boolean i() {
      return this.u.method_56991(class07085.field_55946) && this.u.method_5864().N(class01217.V);
   }

   @Override
   protected class01894 y() {
      return n;
   }

   @Override
   protected class01894 N() {
      return G;
   }

   @Override
   protected boolean R() {
      return this.u.method_56991(class07085.field_48824) && (this.u.method_5864().N(class01217.H) || this.u instanceof class00683);
   }
}
