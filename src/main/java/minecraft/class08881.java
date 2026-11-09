package minecraft;

public record class08881(class08877 blockPart, class08887 block, class08910 item) {

   public class08910 L() {
      return this.item;
   }

   public class08881(class08877 blockPart, class08887 block, class08910 item) {
      this.blockPart = blockPart;
      this.block = block;
      this.item = item;
   }

   public class08887 y() {
      return this.block;
   }

   public class08877 N() {
      return this.blockPart;
   }

   public static class08881 N(class08529 var0, class02601 var1, class02012 var2) {
      class08869 class08869 = new class08869(var1, var2);
      class08838 class08838 = var0.B();
      boolean flag = var0.u();
      boolean flag1 = var0.i().N();
      class03702 class03702 = var0.R();
      class08496 class08496 = var0.N(class08838, class08869, class08510.N);
      class08388 class08388 = var0.N(class08838, class08869);
      class08431 class08431 = new class08431(class08496, flag, class08388);
      class08857 class08857 = new class08857(class08431);
      class08908 class08908 = new class08908(class08496.method_68048(), new class08517(flag1, class08388, class03702));
      return new class08881(class08431, class08857, class08908);
   }
}
