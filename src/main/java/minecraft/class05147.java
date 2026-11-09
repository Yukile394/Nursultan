package minecraft;

public class class05147 implements class07703 {
   private static final String N = "Rcon";
   private static final class00392 L = class00392.y("Rcon");
   private final StringBuffer u = new StringBuffer();
   private final class02796 i;

   public void L() {
      this.u.setLength(0);
   }

   public class05147(class02796 var1) {
      super();
      this.i = var1;
   }

   @Override
   public boolean B() {
      return this.i.M();
   }

   public String i() {
      return this.u.toString();
   }

   @Override
   public void N(class00392 var1) {
      this.u.append(var1.getString());
   }

   public class07701 R() {
      class04782 class04782 = this.i.NY();
      return new class07701(this, class06889.N(class04782.method_74854().y()), class07109.N, class04782, class06984.i, "Rcon", L, this.i, null);
   }

   @Override
   public boolean A_() {
      return true;
   }

   @Override
   public boolean B_() {
      return true;
   }
}
