package minecraft;

class class04636 extends class05699<class04636> {
   private final class00392 y;
   private final class00392 L;
   private final class00392 u;
   private final boolean i;
   private final boolean R;

   public class04636(class07078<?> var1, class07078 var2) {
      super();
      this.N = var1;
      this.y = var2.M();
      int ix = var1.N.B.N(class01235.M.y(var2));
      if (ix == 0) {
         this.L = class00392.N("stat_type.minecraft.killed.none", this.y);
         this.i = false;
      } else {
         this.L = class00392.N("stat_type.minecraft.killed", ix, this.y);
         this.i = true;
      }

      int j = var1.N.B.N(class01235.B.y(var2));
      if (j == 0) {
         this.u = class00392.N("stat_type.minecraft.killed_by.none", this.y);
         this.R = false;
      } else {
         this.u = class00392.N("stat_type.minecraft.killed_by", this.y, j);
         this.R = true;
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.y(class04610.z(this.N.N), this.y, this.method_73380() + 2, this.method_73382() + 1, -1);
      var1.y(class04610.U(this.N.N), this.L, this.method_73380() + 2 + 10, this.method_73382() + 1 + 9, this.i ? -4539718 : -8355712);
      var1.y(class04610.W(this.N.N), this.u, this.method_73380() + 2 + 10, this.method_73382() + 1 + 18, this.R ? -4539718 : -8355712);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", class05220.N(this.L, this.u));
   }
}
