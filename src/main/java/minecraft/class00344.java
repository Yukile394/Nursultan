package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00344 implements class00340 {
   public static final class01894 N = class01894.y("christmas");
   public static final class01894 y = class01894.y("normal");
   public static final class01894 L = class01894.y("trapped");
   public static final class01894 u = class01894.y("ender");
   public static final class01894 i = class01894.y("copper");
   public static final class01894 R = class01894.y("copper_exposed");
   public static final class01894 M = class01894.y("copper_weathered");
   public static final class01894 B = class01894.y("copper_oxidized");
   private final class08097 Z;
   private final class02443 z;
   private final class05913 U;
   private final float E;

   public class00344(class08097 var1, class02443 var2, class05913 var3, float var4) {
      super();
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      this.E = var4;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      var3.N(this.z, this.E, var2, this.U.N(class06851::u), var4, var5, -1, this.Z.N(this.U), var7, null);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      this.z.method_2819(this.E);
      this.z.method_63512().N(class01421, var1);
   }
}
