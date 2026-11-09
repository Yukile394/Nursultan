package minecraft;

public enum class05432 {
   field_22839(class05433.Ns, class05433.Nj, false),
   field_22840(class05433.NP, class05433.Nb, false),
   field_55176(class05433.NT, class05433.Nv, true);

   private final class05403 field_55177;
   private final class05403 field_55178;
   private final boolean field_55179;

   private class05432(class05403 var3, class05403 var4, boolean var5) {
      this.field_55177 = var3;
      this.field_55178 = var4;
      this.field_55179 = var5;
   }

   public class05388 y(class00891 var1) {
      return this.field_55179 ? class05388.M(var1) : class05388.R(var1);
   }

   public class05403 y() {
      return this.field_55178;
   }

   public class01894 N(class05404 var1, class00891 var2) {
      class06581 class06581 = var2.B();
      return this.field_55179 ? var1.y(class06581, var2, "_emissive") : var1.N(class06581, var2);
   }

   public class05388 N(class00891 var1) {
      return this.field_55179 ? class05388.i(var1) : class05388.L(var1);
   }

   public class05403 N() {
      return this.field_55177;
   }
}
